/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitment_assignment;

import java.math.BigInteger;

/**
 *
 * @author Idelia
 */
public class d784 {

    /*
        SOAL:
        Diketahui 2^100 = 1267650600228229401496703205376
        Partisi 3 bilangan tersebut jika dijumlahkan (126 + 765 + ... + 537 + 6)
        hasilnya 4417.
        Pertanyaan: berapakah jumlah partisi 3 bilangan dari 2^1592?
     */

    //JAWAB:
    
    // utk menyimpan nilai hasil pangkat:
    BigInteger num;
    // utk menyimpan jumlah dari bilangan2 hasil partisi:
    int sum = 0;
    // utk menyimpan nilai hasil pangkat dlm bentuk string:
    String to_str;
    // utk menyimpan bilangan2 hasil partisi dlm bentuk string:
    String[] arr_str;
    // utk menyimpan bilangan2 hasil partisi dlm bentuk int:
    int[] arr_num;

    public void answer(int power) {
        System.out.println("Operasi pangkat: 2^" + power);
        num = BigInteger.valueOf(2).pow(power);
        System.out.println("Hasil: " + num);
        
        to_str = num.toString();
        arr_str = to_str.split("(?<=\\G.{3})");
        arr_num = new int[arr_str.length];
        
        System.out.print("Partisi: ");
        for (int i = 0; i < arr_str.length; i++) {
            arr_num[i] = Integer.parseInt(arr_str[i]);
            System.out.print(arr_num[i] + ", ");
            sum += arr_num[i];
        }
        
        System.out.println("\nHasil jumlah bilangan partisi: " + sum);
        System.out.println("\n======================================\n");
    }

    public static void main(String[] args) {
        d784 d = new d784();
        d.answer(100);
        d.answer(1592);
    }
}
