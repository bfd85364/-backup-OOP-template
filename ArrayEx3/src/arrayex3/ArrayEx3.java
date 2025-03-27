/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayex3;
import java.util.*;
public class ArrayEx3 {
    public static void main(String[] args) {
       char [] c;
       c=vowels();
       for(int i=0; i<c.length; i++)
        System.out.println(c[i]);
    }

    private static char[] vowels() {
        char[]newarr=new char[5];
       newarr[0]='a';
       newarr[1]='e';
       newarr[2]='i';
       newarr[3]='o';
       newarr[4]='u';
       return newarr;
    }
    
}
