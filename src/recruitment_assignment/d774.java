/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitment_assignment;

import java.util.Arrays;

/**
 *
 * @author Idelia
 */
public class d774 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // variabel utk menyimpan daftar bilangan n
        int n;
        // variabel utk menyimpan batas awal & akhir n
        int a = 1; // batas awal
        int b = 20; // batas akhir
        // variabel utk menyimpan bilangan kelipatan
        int x = 3;
        int y = 5;
        // variabel utk menyimpan jumlah yg diharapkan
        int sum_check = 98;
        // variabel utk menyimpan jumlah dari perhitungan
        int sum = 0;

        System.out.print("JAWAB:\nDaftar bilangan n: ");
        for (n = a; n < b + 1; n++) {
            if (n % x == 0 || n % y == 0) {
                sum += n;
                System.out.print(n + " ");
            }
        }
        System.out.println("\nSum dari daftar bilangan n: " + sum);
        System.out.print("Cek apakah nilai sum sesuai: ");
        if (sum == sum_check) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("\n\n==========================\n\n");

        // VARIABEL AWAL
        // utk menyimpan daftar bilangan n
        int n2;
        // utk menyimpan jumlah dari perhitungan
        int sum2 = 0;
        int sum2_mod = 0;
        
        // VARIABEL INPUTAN
        // utk menyimpan batas awal & akhir n
        int a2 = 1; // batas awal
        int b2 = 100000; // batas akhir
        // utk menyimpan bilangan kelipatan
        int x2 = 17;
        int y2 = 71;
        // utk menyimpan bilangan mod
        int mod_check = 51681;

        System.out.print("JAWAB:\nDaftar bilangan n: ");
        for (n2 = a2; n2 < b2 + 1; n2++) {
            if (n2 % x2 == 0 || n2 % y2 == 0) {
                sum2 += n2;
                System.out.print(n2 + " ");
            }
        }
        System.out.println("\nSum dari daftar bilangan n: " + sum2);
        sum2_mod = sum2 % mod_check;
        System.out.println("Nilai sum setelah di-mod " + mod_check + ": " + sum2_mod);
    }
}
