package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

//na questão 4 precisava criar um metodo abstrato, entao defini a classe como abstrata
public abstract class Eletrodomestico extends Produto{
    
    private String modelo;
    private String material;
    private int potenciaWatts;
    
    public Eletrodomestico(){
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }
    
    @Override
    public String toString(){
        return "Cor: " + super.getCor()
                + "\nMarca: " + super.getMarca()
                + "\nPeso: " + super.getPeso()
                + "\nPreço: " + super.getPreco()
                + "\nModelo: " + this.modelo
                + "\nMaterial: " + this.material
                + "\nPotencia Watts: " + this.potenciaWatts;
    }
    
    public abstract double calcularPeso(double capacidadeLitros);
    
}
