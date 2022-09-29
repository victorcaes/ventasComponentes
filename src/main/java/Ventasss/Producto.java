
package Ventasss;

import java.util.ArrayList;

class Producto {
    private int cod;
    private String despro;
    private double prepro;
    private Categoria cat;
    ArrayList<DetalleFactura> listDetalle;
    
    static int contador=10;

    public Producto(String despro, double prepro, Categoria cat) {
        this.cod = contador++;
        this.despro = despro;
        this.prepro = prepro;
        this.cat = cat;
        cat.adicion(this);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDespro() {
        return despro;
    }

    public void setDespro(String despro) {
        this.despro = despro;
    }

    public double getPrepro() {
        return prepro;
    }

    public void setPrepro(double prepro) {
        this.prepro = prepro;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
    
    
    
}
