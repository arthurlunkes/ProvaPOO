package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public class Geladeira extends Eletrodomestico{
    
    private double volumeLitros;
    
    private Geladeira(){
    }
    
    public Geladeira(double capacidadeLitros, String cor, String marca, String material, String modelo, int potenciaw, double peso, double preco) {
        super.setCor(cor);
        super.setMarca(marca);
        super.setMaterial(material);
        super.setModelo(modelo);
        super.setPeso(peso);
        super.setPotenciaWatts(potenciaw);
        super.setPreco(preco);
        this.volumeLitros = capacidadeLitros;
    }
    
    public double getVolumeLitros() {
        return volumeLitros;
    }

    public void setVolumeLitros(double volumeLitros) {
        this.volumeLitros = volumeLitros;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nVolume em litros: " + this.volumeLitros;
    }

    @Override
    public double calcularPeso(double volumeLitros) {
        super.setPeso(volumeLitros*0.2);
        return super.getPeso();
    }
    
}
