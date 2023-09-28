/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan25;
import java.util.Scanner;
/**
 *
 * @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan25 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama depan anda untuk di eja: ");
            String nama = input.nextLine();
            
            System.out.println("Ejaan untuk " +" '"+ nama +"' "+ " adalah:");
            
            // Loop melalui setiap karakter dalam nama dan eja sesuai urutan yang diinginkan
            for (int i = 0; i < nama.length(); i++) {
                char karakter = nama.charAt(i);
                String ejaan = String.valueOf(karakter);
                
                // Tampilkan ejaan karakter sesuai urutan
                System.out.println("Huruf ke-" + (i + 1) + ": " + ejaan);
            }
        }
    }
}
