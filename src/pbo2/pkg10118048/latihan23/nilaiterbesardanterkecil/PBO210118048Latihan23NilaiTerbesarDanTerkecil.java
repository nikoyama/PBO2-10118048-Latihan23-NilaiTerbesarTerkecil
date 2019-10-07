/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan23.nilaiterbesardanterkecil;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : mencari nilai terbesar dan terkecil
 * dari nilai mahasiswa
 */
public class PBO210118048Latihan23NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mahasiswa, i, nilai[], max, min;
        String nama;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil"
                + " Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scanner.next();
        System.out.print("Masukkan Banyaknya Mahasiwa : ");
        mahasiswa = scanner.nextInt();
        
        nilai = new int[mahasiswa];
        max = nilai[0];
        min = nilai[0];
        for (i = 0;i < mahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " = ");
            nilai[i] = scanner.nextInt();
            if (nilai[i] > max)
                max = nilai[i];
            else 
                min=nilai[i];
        }
        
        System.out.println("\n=====HASIL NILAI MAHASISWA=====");
        for (i = 0;i < mahasiswa; i++) { 
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " = " + nilai[i]);
        }
        System.out.println("\nNilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("\nPetugas : " + nama);
    }
}
