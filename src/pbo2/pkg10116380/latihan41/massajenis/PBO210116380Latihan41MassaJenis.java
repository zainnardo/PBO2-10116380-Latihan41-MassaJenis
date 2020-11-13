/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan41.massajenis;

import java.util.Scanner;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang menghitung massa jennis dan volume
 */
public class PBO210116380Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Kubus cube = new Kubus();
        System.out.println("=====Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        Scanner scn = new Scanner(System.in);
        int sisi = scn.nextInt();
        System.out.print("Massa: ");
        int massa = scn.nextInt();

        cube.setSisi(sisi);
        cube.setMassa(massa);
        int totVolume = cube.hitungVolume(sisi);

        System.out.println("=====Hasil Perhitungan======");
        System.out.println("Volume : " + totVolume);

        System.out.println("Massa Jenis : " + cube.hitungMassaJenis(massa, totVolume));
       
    }
    
}
