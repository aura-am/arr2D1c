/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3array2d;

import javax.swing.JOptionPane;

/**
 *
 * @author 62852
 */
public class array2D1b {
    public static void main(String[] args) {
        int data [][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        for(int a =0; a < data.length; a++){
            for (int b =0; b < data[0].length; b++) {
                System.out.print(data [a][b] + " ");
                }
            System.out.print("\n");
        }
            System.out.println("");
            
            int cariBaris =
    Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris (0 - 1)"));
            int cariKolom =
    Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris (o - 7)"));
            if (cariBaris >= 0 && cariBaris < data.length && cariKolom >= 0 && cariKolom < data[cariBaris].length){
                int newValue =
    Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai dari : ("+ cariBaris +"," + cariKolom + ")"));
                data[cariBaris][cariKolom]= newValue;
                System.out.println("Nilai dari (" + cariBaris + "'" + cariKolom + ")data yang berubah");
            } else {
                System.out.println("data tidak valid!");
            }
            System.out.println("\nAfter array dirubah");
            for ( int a =0; a < data.length; a++){
                for ( int b =0; b < data[a].length; b++){
                    System.out.print(data[a][b]);
                }
                System.out.println("");
            }
            System.out.println("");
    }
}
