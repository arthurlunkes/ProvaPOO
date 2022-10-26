package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public class Cafeteira extends Eletrodomestico{
    
    private double capacidadeLitros;
    
    private Cafeteira(){
    }

    public Cafeteira(double capacidadeLitros, String cor, String marca, String material, String modelo, int potenciaw, double peso, double preco) {
        super.setCor(cor);
        super.setMarca(marca);
        super.setMaterial(material);
        super.setModelo(modelo);
        super.setPeso(peso);
        super.setPotenciaWatts(potenciaw);
        super.setPreco(preco);
        this.capacidadeLitros = capacidadeLitros;
    }
    
    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nCapacidade em Litros: " + this.capacidadeLitros;
    }

    @Override
    public double calcularPeso(double capacidadeLitros) {
        super.setPeso(capacidadeLitros*0.5);
        return super.getPeso();
    }
    
}
