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

        BigInteger num1 = BigInteger.valueOf(2).pow(100);
        System.out.println(num1);
        String to_str1 = num1.toString();
        System.out.println(to_str1);
        int sum1 = 0;

        String[] arr_str1 = to_str1.split("(?<=\\G.{3})");
        int[] arr_num1 = new int[arr_str1.length];
        for (int i = 0; i < arr_str1.length; i++) {
            arr_num1[i] = Integer.parseInt(arr_str1[i]);
            System.out.print(arr_num1[i] + ", ");
            sum1 += arr_num1[i];
        }

        System.out.println("\n" + sum1);

        BigInteger num2 = BigInteger.valueOf(2).pow(1592);
        System.out.println(num2);
        String to_str2 = num2.toString();
        System.out.println(to_str2);
        int sum2 = 0;

        String[] arr_str2 = to_str2.split("(?<=\\G.{3})");
        int[] arr_num2 = new int[arr_str2.length];
        for (int i = 0; i < arr_str2.length; i++) {
            arr_num2[i] = Integer.parseInt(arr_str2[i]);
            System.out.print(arr_num2[i] + ", ");
            sum2 += arr_num2[i];
        }

        System.out.println("\n" + sum2);

    }
}
