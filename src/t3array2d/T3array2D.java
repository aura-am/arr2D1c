/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3array2d;

/**
 *
 * @author 62852
 */
public class T3array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data [][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        for(int a =0; a < data.length; a++){
            for (int b =0; b < data[0].length; b++) {
                System.out.print(data [a][b] + " ");
                }
            System.out.print("\n");
        }
            System.out.println("");
         
            int nilai=0;
            double average = 0;
            int total=0;
            for ( int a =0; a < data.length; a++ ) {
                if (a> 0){
                    System.out.print("\n"+ total + " + ");
                }
                for ( int b =0; b < data[a].length; b++ ){
                    System.out.print(data[a][b]);
                    total += data[a][b];
                    nilai++;
                    if (b == (data[a].length - 1)){
                        System.out.print(" = ");
                    } else{
                        System.out.print(" + ");
                    }
                }
                System.out.print(total);
            }
            System.out.println("\n\nJumlah :" + total + " / "+ nilai);
            average = total / nilai;
            System.out.println("Nilai rata-rata : "+ average);
        }   
    }
    
