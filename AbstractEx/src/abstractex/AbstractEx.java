/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractex;
abstract class Table{
    public abstract void Primarykey();
    
    public void Forgirnerkey(){
        System.out.println("The Size_ID is FK");
    }
}
class Product_ID extends Table{

    @Override
    public void Primarykey() {
        System.out.println("The Product_ID is PK");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Product_ID myproduct_id = new Product_ID();
        myproduct_id.Primarykey();
        myproduct_id.Forgirnerkey();
    }
    
}
