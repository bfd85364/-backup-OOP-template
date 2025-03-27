package a6;
interface Printable{
    void print();
}
public class A6 implements Printable{
   public void print(){
       System.out.print("Hello using interface!");
   }
    public static void main(String[] args) {
        A6 obj= new A6();
        obj.print();
    }
    
}
