package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public class Ferramenta extends Produto{
    
    private String funcao;
    private boolean eletrica;
    
    public Ferramenta(){
    }
    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }
    
    public boolean ehPerigosa(){
        return false;
    }
    
    @Override
    public String toString(){
        return "Cor: " + super.getCor()
                + "\nMarca: " + super.getMarca()
                + "\nPeso: " + super.getPeso()
                + "\nPreço: " + super.getPreco()
                + "\nFuncao: " + this.funcao
                + "\nElétrica: " + this.eletrica;
    }
    
    public String toString(boolean descricaoCompleta){
        if(descricaoCompleta){
            return this.toString();
        }else{
            return "Marca: " + super.getMarca()
                    + "\nPreco: " + super.getPreco()
                    + "\nFuncao: " + this.funcao;
        }
    }
    
}
