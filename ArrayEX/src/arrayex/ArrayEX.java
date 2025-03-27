
package arrayex;
import java.util.*;
public class ArrayEX{
    public static void main(String[] args) {
        int n;
        
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        n=kb.nextInt(); //n is will be have 10//
        int [] arr = new int[10];
       System.out.println("Enter the values:");
        for(int i=0; i<n; i++) 
            arr[i]=kb.nextInt(); // arr is variablr positioning starting 0//
        System.out.println("the array Elements are:");
        for(int i=0; i<n; i++)
            System.out.println(arr[i]);
            }
    
}
