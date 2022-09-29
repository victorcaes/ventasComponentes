
package Ventasss;
import java.util.ArrayList;
public class Categoria {
    private int cod;
    private String nom;
    private ArrayList<Producto> listPro;
    
    static int contador=100;

    public Categoria(String nom) {
        this.cod = contador++;
        this.nom = nom;
        this.listPro = new ArrayList();
    }

    public void adicion(Producto pro) {
        listPro.add(pro);
    }
    public String print(){
        //Imprimir los productos por categoria
        String cad="codigo "+cod+"\nNombre "+nom;
        cad=cad+"\nCodigo\tproducto\tPrecio\n";
        for(Producto x:listPro){
            cad=cad+x.getCod()+"\t"+x.getDespro()+"\t"+x.getPrepro()+"\n";
        }
        return cad;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Producto> getListPro() {
        return listPro;
    }

    public void setListPro(ArrayList<Producto> listPro) {
        this.listPro = listPro;
    }
    
    
    
    
    
    
    
}
