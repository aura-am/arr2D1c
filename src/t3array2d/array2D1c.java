/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3array2d;

/**
 *
 * @author 62852
 */
public class array2D1c {
    public static void main(String[] args) {
        int data [][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        
        for ( int a =0; a < data.length; a++) {
            for ( int b =0; b < data[0].length; b++) {
            System.out.print(data [a][b] + " ");
        }
            System.out.print("\n");
    }
        System.out.println("\narray baris ke-1 : ");
        for ( int a = 0; a < data[0].length; a++){
            if (a % 2 !=0){
                System.out.print(data[0][a]);
                if (a == ( data[0].length - 1 )){
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
                total1 += data[0][a];
            }
            }
        System.out.println(total1);
        
        System.out.println("array baris ke-2 : ");
        for ( int b =0; b < data[0].length; b++){
            if (b % 2 !=0){
                System.out.print(data[1][b]);
                if (b == ( data[0].length - 1 )){
                    System.out.print(" = ");
                } else {
                    System.out.print(" + ");
                }
                total2 += data[0][b];
            }
            }
        System.out.println(total2);
        
        total3 = total1 + total2;
        System.out.println("\nbaris1 + baris2 = " + total3);
}
}