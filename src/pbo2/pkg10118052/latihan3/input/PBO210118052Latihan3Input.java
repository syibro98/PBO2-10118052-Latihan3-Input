/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan3.input;

import java.util.Scanner;

/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Latihan ini bertujuan untuk menginput nilai melalui
 * keyboard
 */
public class PBO210118052Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan nama and: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
