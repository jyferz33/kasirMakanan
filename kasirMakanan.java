
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class kasirMakanan {
    public static void main(String[] args) {
        System.out.println("Menu Makanan : ");
        System.out.println("1. soto (15000)");
        System.out.println("2. rawon (17000)");
        System.out.println("3. mie (5000)");
        System.out.println("4. tahu (8000)");
        System.out.println("5. sate (20000)");
        
        int soto,rawon,mie,tahu,sate;
        soto = 15000;
        rawon = 17000;
        mie = 5000;
        tahu = 8000;
        sate = 20000;
        
        int jumlahBeli,total,bayar,kembali;
         Scanner input = new Scanner(System.in);
         System.out.println("Jumlah Beli Soto");
         jumlahBeli = input.nextInt();
         total = jumlahBeli*soto;
         System.out.println("Jumlah Beli mie");
         jumlahBeli = input.nextInt();
         total += jumlahBeli*mie;
         System.out.println("Jumlah Beli tahu");
         jumlahBeli = input.nextInt();
         total += jumlahBeli*tahu;
         System.out.println("Jumlah Beli sate");
         jumlahBeli = input.nextInt();
         total += jumlahBeli*sate;
         System.out.println("Jumlah Beli Rawon");
         jumlahBeli = input.nextInt();
         total +=jumlahBeli*rawon;
         System.out.println("Total Pembelian : "+total);
         System.out.println("Masukkan Pembayaran : ");
         bayar = input.nextInt();
         kembali = bayar-total;
         System.out.println("Jumlah kembalian : "+kembali);
         
    
    }
}
