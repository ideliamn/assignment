/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitment_assignment;

import java.math.BigInteger;
import java.text.DecimalFormat;

/**
 *
 * @author Idelia
 */
public class d784 {

    public static void main(String[] args) {
        
        // VARIABEL AWAL:
        // utk menyimpan nilai hasil pangkat:
        BigInteger num1, num2;
        // utk menyimpan jumlah dari bilangan2 hasil partisi:
        int sum1 = 0;
        int sum2 = 0;
        // utk menyimpan nilai hasil pangkat dlm bentuk string:
        String to_str1, to_str2;
        // utk menyimpan bilangan2 hasil partisi dlm bentuk string:
        String[] arr_str1, arr_str2;
        // utk menyimpan bilangan2 hasil partisi dlm bentuk int:
        int[] arr_num1, arr_num2;
        
        // VARIABEL INPUTAN:
        // utk bilangan pangkat
        int power1 = 100;
        int power2 = 1592;

        System.out.println("Operasi pangkat: 2^"+power1);
        num1 = BigInteger.valueOf(2).pow(power1);
        System.out.println("Hasil: "+num1);
        to_str1 = num1.toString();
        arr_str1 = to_str1.split("(?<=\\G.{3})");
        arr_num1 = new int[arr_str1.length];
        System.out.print("Partisi: ");
        for (int i = 0; i < arr_str1.length; i++) {
            arr_num1[i] = Integer.parseInt(arr_str1[i]);
            System.out.print(arr_num1[i] + ", ");
            sum1 += arr_num1[i];
        }
        System.out.println("\nHasil jumlah bilangan partisi: " + sum1);
        
        System.out.println("\n\n============ anjeeengggg =============\n");

        System.out.println("Operasi pangkat: 2^"+power2);
        num2 = BigInteger.valueOf(2).pow(power2);
        System.out.println("Hasil: "+num2);
        to_str2 = num2.toString();
        arr_str2 = to_str2.split("(?<=\\G.{3})");
        arr_num2 = new int[arr_str2.length];
        System.out.print("Partisi: ");
        for (int i = 0; i < arr_str2.length; i++) {
            arr_num2[i] = Integer.parseInt(arr_str2[i]);
            System.out.print(arr_num2[i] + ", ");
            sum2 += arr_num2[i];
        }
        System.out.println("\nHasil jumlah bilangan partisi: " + sum2);

    }
}
