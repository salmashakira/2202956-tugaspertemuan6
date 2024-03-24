/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopert6.persegipanjang;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PersegiPanjang persegi1 = new PersegiPanjang();
        
        System.out.println("Masukkan panjang persegi panjang 1: ");
        int panjangInput1 = scanner.nextInt();
        persegi1.setPanjang(panjangInput1);
        System.out.println("Masukkan lebar persegi panjang 1: ");
        int lebarInput1 = scanner.nextInt();
        persegi1.setLebar(lebarInput1);

        PersegiPanjang persegi2 = new PersegiPanjang();
        
        System.out.println("Masukkan panjang persegi panjang 2: ");
        int panjangInput2 = scanner.nextInt();
        persegi2.setPanjang(panjangInput2);
        System.out.println("Masukkan lebar persegi panjang 2: ");
        int lebarInput2 = scanner.nextInt();
        persegi2.setLebar(lebarInput2);

        PersegiPanjang persegi3 = new PersegiPanjang();
        
        System.out.println("Masukkan panjang persegi panjang 3: ");
        int panjangInput3 = scanner.nextInt();
        persegi3.setPanjang(panjangInput3);
        System.out.println("Masukkan lebar persegi panjang 3: ");
        int lebarInput3 = scanner.nextInt();
        persegi3.setLebar(lebarInput3);

        System.out.println("Luas Persegi Panjang 1: " + persegi1.getLuas());
        System.out.println("Keliling Persegi Panjang 1: " + persegi1.getKeliling());

        System.out.println("Luas Persegi Panjang 2: " + persegi2.getLuas());
        System.out.println("Keliling Persegi Panjang 2: " + persegi2.getKeliling());

        System.out.println("Luas Persegi Panjang 3: " + persegi3.getLuas());
        System.out.println("Keliling Persegi Panjang 3: " + persegi3.getKeliling());

        scanner.close();
    }
}

