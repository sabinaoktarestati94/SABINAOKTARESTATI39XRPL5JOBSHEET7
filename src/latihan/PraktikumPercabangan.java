/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PraktikumPercabangan {
    public static void main(String[] args)
    {
        System.out.println("Nama: Sabina Okta Restati");
        System.out.println("No.absen: 39");
        System.out.println("Kelas: XRPL5");
        
        Scanner baca = new Scanner(System.in);
        double hasil;
        
        System.out.println("---------------");
        
        System.out.println("SELAMAT DATANG");
        System.out.print("Masukkan nomor kamar: ");
        int nomor = baca.nextInt();
        
        if(nomor < 15)
        {
            System.out.println("Lantai 1");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 150000;
            System.out.println("Harga :" + hasil);
        }
        else if(nomor < 30)
        {
            System.out.println("Lantai 2");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 200000;
            System.out.println("Hasil: " + hasil);
        }
        else if(nomor < 45)
        {
            System.out.println("Lantai 3");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 250000;
            System.out.println("Harga: " + hasil );
        }
        else if(nomor < 60)
        {
            System.out.println("Lantai 4");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 300000;
            System.out.println("Harga: " + hasil);
        }
        else if(nomor <= 90)
        {
            System.out.println("Lantai 5");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 350000;
            System.out.println("Harga: " + hasil);
        }
        else
        {
            System.out.println("Tidak Tersedia");
        }
        
    
    
    }
    
}


