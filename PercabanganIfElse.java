/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner; 
public class PercabanganIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah barang dan harga satuan
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();
        
        System.out.print("Masukkan harga satuan barang: ");
        double hargaSatuan = scanner.nextDouble();
        
        // Menghitung total pembelian
        double totalPembelian = jumlahBarang * hargaSatuan;
        double diskon = 0.0;
        
        // Menentukan besaran diskon
        if (totalPembelian < 100000) {
            diskon = 0.0;
        } else if (totalPembelian <= 200000) {
            diskon = 0.05;
        } else if (totalPembelian <= 300000) {
            diskon = 0.10;
        } else if (totalPembelian <= 400000) {
            diskon = 0.15;
        } else if (totalPembelian <= 500000) {
            diskon = 0.20;
        } else {
            diskon = 0.25;
        }

        // Menghitung nominal diskon dan total akhir
        double nominalDiskon = totalPembelian * diskon;
        double totalAkhir = totalPembelian - nominalDiskon;

        // Menampilkan hasil
        System.out.printf("\nTotal Pembelian: Rp %.2f%n", totalPembelian);
        System.out.printf("Nominal Diskon: Rp %.2f%n", nominalDiskon);
        System.out.printf("Pembelian Akhir: Rp %.2f%n", totalAkhir);

        // Input uang yang dibayarkan
        System.out.print("\nMasukkan uang yang dibayarkan: ");
        double uangDibayar = scanner.nextDouble();
        
        // Menghitung kembalian
        if (uangDibayar > totalAkhir) {
            double kembalian = uangDibayar - totalAkhir;
            System.out.printf("Nominal Kembalian: Rp %.2f%n", kembalian);
        } else if (uangDibayar < totalAkhir) {
            System.out.println("Uang tidak cukup untuk membayar.");
        } else {
            System.out.println("Uang Pas");
        }

        // Menutup scanner
        scanner.close();
    }
}

    

