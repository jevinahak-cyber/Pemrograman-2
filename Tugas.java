package tugas;

import java.util.Scanner;

public class Tugas {

    static class Mahasiswa {
        String nim;
        String nama;
        double uts;
        double uas;

        double hitungRata() {
            return (uts + uas) / 2;
        }

        String getGrade() {
            double rata = hitungRata();

            if (rata >= 85) return "A";
            else if (rata >= 70) return "B";
            else if (rata >= 60) return "C";
            else if (rata >= 50) return "D";
            else return "E";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        // Input satu-satu
        System.out.print("Masukkan NIM  : ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan Nilai UTS : ");
        mhs.uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        mhs.uas = input.nextDouble();

        // Output
        System.out.println("\n=== HASIL ===");
        System.out.println("NIM: " + mhs.nim);
        System.out.println("Nama: " + mhs.nama);
        System.out.println("UTS: " + mhs.uts);
        System.out.println("UAS: " + mhs.uas);
        System.out.println("Rata-rata: " + mhs.hitungRata());
        System.out.println("Grade: " + mhs.getGrade());

        input.close();
    }
}