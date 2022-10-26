package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public class Furadeira extends Ferramenta{
    
    private int potenciaWatts;
    private boolean funcaoParafusar;
    private boolean funcaoMartelar;
    
    public Furadeira(){
    }
    
    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public boolean isFuncaoParafusar() {
        return funcaoParafusar;
    }

    public void setFuncaoParafusar(boolean funcaoParafusar) {
        this.funcaoParafusar = funcaoParafusar;
    }

    public boolean isFuncaoMartelar() {
        return funcaoMartelar;
    }

    public void setFuncaoMartelar(boolean funcaoMartelar) {
        this.funcaoMartelar = funcaoMartelar;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nPotencia em Watts: " + this.potenciaWatts
                + "\nFuncao Parafusar: " + this.funcaoParafusar
                + "\nFuncao Martelar: " + this.funcaoMartelar;
    }
    
    @Override
    public boolean ehPerigosa(){
        return true;
    }
    
}
