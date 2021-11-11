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

    /*
        SOAL:
        Diketahui daftar bilangan bulat positif n ≤ 20 berkelipatan 3 atau 5.
        Jumlah daftar bilangan tersebut adalah 98.
        Pertanyaan: berapakah jumlah dari kelipatan 17 atau 71 di bawah 100000
        yg sudah di-mod dengan 51681?
     */
    
    // JAWAB:
    
    // VARIABEL AWAL:
    // utk menyimpan daftar bilangan n
    int n;
    // utk menyimpan jumlah dari perhitungan
    int sum = 0;
    int sum_mod = 0;

    // VARIABEL INPUTAN:
    // utk menyimpan batas akhir n
    int b; // batas akhir
    // utk menyimpan bilangan kelipatan
    int x;
    int y;
    // utk menyimpan bilangan mod
    int mod_check;
    
    public void answer(int b, int x, int y, int mod_check) {
        System.out.print("JAWAB:\nDaftar bilangan n: ");
        for (n = 1; n < b + 1; n++) {
            if (n % x == 0 || n % y == 0) {
                sum += n;
                System.out.print(n + ", ");
            }
        }
        System.out.println("\nSum dari daftar bilangan n: " + sum);
        sum_mod = sum % mod_check;
        System.out.println("Sum setelah di-mod " + mod_check + ": " + sum_mod);
        System.out.println("\n======================================\n");
    }

    public static void main(String[] args) {
        d774 d = new d774();
        d.answer(20, 3, 5, 1);
        d.answer(100000, 17, 71, 51681);
    }
}
