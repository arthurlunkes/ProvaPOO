package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public class Martelo extends Ferramenta{
    
    private String materialCabo;
    private String materialPonteira;
    
    public Martelo(){
    }
    
    public String getMaterialCabo() {
        return materialCabo;
    }

    public void setMaterialCabo(String materialCabo) {
        this.materialCabo = materialCabo;
    }

    public String getMaterialPonteira() {
        return materialPonteira;
    }

    public void setMaterialPonteira(String materialPonteira) {
        this.materialPonteira = materialPonteira;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nMaterial do cabo: " + this.materialCabo
                + "\nMaterial da ponteira: " + this.materialPonteira;
    }
    
    @Override
    public boolean ehPerigosa(){
        return false;
    }
    
}
