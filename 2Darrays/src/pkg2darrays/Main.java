/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darrays;
public class Main {
    public static void main(String[] args) {
        int[][] values={
            {10,20,30},{40,50,60},{70,80,90},{11,21,32}
        };
        for(int r=0; r<4; r++){
            for(int c=0; c<3; c++){
                System.out.print(values[r][c]+" "); //if using prinktln thang it's reconigze "low" so have to using print here  
            }
               System.out.println();
        }
    }
    
}
