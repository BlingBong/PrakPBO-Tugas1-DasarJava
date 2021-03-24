package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih = 0;
        Mahasiswa mahasiswa = new Mahasiswa();

        while(pilih != 3){
            System.out.println();
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Exit");

            Scanner inputOpsi = new Scanner(System.in);
            System.out.print("Pilih\t : ");
            pilih = inputOpsi.nextInt();

            System.out.println();

            switch (pilih) {
                case 1:
                    Mahasiswa.lihat();
                    break;
                case 2:
                    Mahasiswa edit = new Mahasiswa();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                    break;
            }
        }
    }
}
