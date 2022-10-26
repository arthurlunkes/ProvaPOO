package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public abstract class Produto {
    
    private String marca;
    private double peso;
    private double preco;
    private String cor;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean ehCaro(){
        return this.preco>=100.0;
    }
    
    public boolean ehPesado(){
        return this.peso>=9.0;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
}
