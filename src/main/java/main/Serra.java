package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public class Serra extends Ferramenta{
    
    private boolean possuiBateria;
    private double tamanhoCorte;
    
    public Serra(){
    }
    
    public boolean isPossuiBateria() {
        return possuiBateria;
    }

    public void setPossuiBateria(boolean possuiBateria) {
        this.possuiBateria = possuiBateria;
    }

    public double getTamanhoCorte() {
        return tamanhoCorte;
    }

    public void setTamanhoCorte(double tamanhoCorte) {
        this.tamanhoCorte = tamanhoCorte;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nPossui bateria: " + this.possuiBateria
                + "\nTamanho do corte: " + this.tamanhoCorte;
    }
    
    @Override
    public boolean ehPerigosa(){
        return true;
    }
}
