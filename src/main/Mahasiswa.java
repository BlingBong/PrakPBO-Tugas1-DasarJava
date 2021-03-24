package main;

import java.util.Scanner;

public class Mahasiswa {
    private static String nama;
    private static String nim;
    private static int usia;
    private static float uts;
    private static float uas;

    public Mahasiswa() {
        System.out.println("Input Data");
        System.out.println("----------");

        Scanner inputNama = new Scanner(System.in);
        System.out.print("Nama\t : ");
        nama = inputNama.next();

        Scanner inputNim = new Scanner(System.in);
        System.out.print("NIM\t\t : ");
        nim = inputNim.next();

        Scanner inputUsia = new Scanner(System.in);
        System.out.print("Usia\t : ");
        usia = inputUsia.nextInt();

        Scanner inputUts = new Scanner(System.in);
        System.out.print("UTS\t\t : ");
        uts = inputUts.nextFloat();

        Scanner inputUas = new Scanner(System.in);
        System.out.print("UAS\t\t : ");
        uas = inputUas.nextFloat();
}

    static void lihat(){
        System.out.println("Perkenalkan, Nama Saya " + nama + ", NIM " + nim + ".");
        System.out.println("Usia\t\t : " + usia);
        System.out.println("Nilai Akhir\t : " + rerata());
    }

    static float rerata(){
        return (uts+uas)/2;
    }
}
