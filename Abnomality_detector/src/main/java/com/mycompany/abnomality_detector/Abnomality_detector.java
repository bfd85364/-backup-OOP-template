/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abnomality_detector;
interface Abnomality{
    String Abnomality_grade();
}
 class Whitenight implements Abnomality{
     public String Abnomality_grade() {    
         return "aleph";
     }
 }
class Blindeness implements Abnomality{
    public String Abnomality_grade() {
        return "waw";
    }
            }
 

     class Abnomality_detector {

    public static void main(String[] args) {
        Abnomality A = new Whitenight();
        System.out.println("Detected" + A.Abnomality_grade());
    }
}
