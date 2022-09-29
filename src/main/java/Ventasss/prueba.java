/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ventasss;

/**
 *
 * @author VICTOR
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria c1=new Categoria("memorias");
        Categoria c2=new Categoria("procesadores");
        
        new Producto("memoria ram12x", 150, c1);
        new Producto("memoria ram8x", 150, c1);
        new Producto("memoria ram8x", 250, c1);
        new Producto("memoria ram8x", 350, c1);
        new Producto("Procesadores", 8000, c2);
        new Producto("Procesadores", 8000, c2);
        new Producto("Procesadores", 8000, c2);
        new Producto("Procesadores", 8000, c2);
        
        
        System.out.println(c1.print());
        System.out.println("--------------");
        System.out.println(c2.print());
    }
    
}
