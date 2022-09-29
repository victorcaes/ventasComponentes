
package Ventasss;

import java.util.ArrayList;
public class Empresa {
    private ArrayList<Categoria> listCat=new ArrayList();

    public Empresa() {
        Categoria c1=new Categoria("memorias");
        Categoria c2=new Categoria("procesadores");
        
        new Producto("memoria ram8gb dsa", 180, c1);
        new Producto("memoria ram16gb dsa", 450, c1);
        new Producto("memoria ram32gb dwasada", 480, c1);
        new Producto("memoria ram8gb Feasdw", 480, c1);
        new Producto("amd radeom rtx580 Feasdw", 480, c2);
        new Producto("intel core i7 7070Feasdw", 480, c2);
        listCat.add(c1);
        listCat.add(c2);
        
    }
    
    
    
    public void adi_cat(Categoria cat){
        listCat.add(cat);
    }
    
   
    public Categoria busca(int nro){
        for(Categoria x:listCat){
            if(x.getCod()==nro){
                return x;
            }
        }
        return null;
    }

    public ArrayList<Categoria> getListCat() {
        return listCat;
    }

    public void setListCat(ArrayList<Categoria> listCat) {
        this.listCat = listCat;
    }
    
    
}
