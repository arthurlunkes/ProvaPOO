package main;

/**
 *
 * @author Arthur Lunkes
 * github.com/arthurlunkes
 */

public class main {

    public static void main(String[] args) {
        
        //Cafeteira
        Cafeteira cafeteira = new Cafeteira(5.0, "Preta", "Mondial", "t1", "Teste1", 50, 2.5, 450.0);
        
        System.out.println(cafeteira.toString());
        System.out.println("Peso calculado" + cafeteira.calcularPeso(cafeteira.getPeso()));
        System.out.println("É pesado? " + cafeteira.ehPesado());
        System.out.println("É caro? " + cafeteira.ehCaro());
        
        //pula linha
        System.out.println();
        
        
        
        //Ferramenta
        Ferramenta ferramenta = new Ferramenta();
        
        ferramenta.setCor("Preta");
        ferramenta.setEletrica(true);
        ferramenta.setFuncao("Corte");
        ferramenta.setMarca("WEG");
        ferramenta.setPeso(5.0);
        ferramenta.setPreco(23.0);
        
        System.out.println(ferramenta.toString());
        System.out.println(ferramenta.toString(true));
        System.out.println(ferramenta.toString(false));
        System.out.println("É pesado? " + ferramenta.ehCaro());
        System.out.println("É perigosa? " + ferramenta.ehPerigosa());
        System.out.println("É pesado? " + ferramenta.ehPesado());
        
        System.out.println();
        
        
        
        //Furadeira
        Furadeira furadeira = new Furadeira();
        
        furadeira.setCor("Preta");
        furadeira.setEletrica(true);
        furadeira.setFuncao("Martelar");
        furadeira.setFuncaoMartelar(true);
        furadeira.setFuncaoParafusar(false);
        furadeira.setMarca("WEG");
        furadeira.setPeso(5.0);
        furadeira.setPotenciaWatts(50);
        furadeira.setPreco(350.0);
        
        System.out.println(furadeira.toString());
        System.out.println(furadeira.toString(true));
        System.out.println(furadeira.toString(false));
        System.out.println("É pesado? " + furadeira.ehCaro());
        System.out.println("É perigosa? " + furadeira.ehPerigosa());
        System.out.println("É pesado? " + furadeira.ehPesado());
        
        System.out.println();
        
        
        
        //Geladeira
        Geladeira geladeira = new Geladeira(0, "Amarela", "Brastemp", "INOX", "Teste", 500, 50, 20);
        
        System.out.println(geladeira.toString());
        System.out.println("Peso calculado" + geladeira.calcularPeso(geladeira.getPeso()));
        System.out.println("É pesado? " + geladeira.ehPesado());
        System.out.println("É caro? " + geladeira.ehCaro());
        
        System.out.println();
        
        
        
        //Martelo
        Martelo martelo = new Martelo();
        
        martelo.setCor("Preta");
        martelo.setEletrica(true);
        martelo.setFuncao("Martelar");
        martelo.setMarca("WEG");
        martelo.setPeso(5.0);
        martelo.setPreco(350.0);
        martelo.setMaterialCabo("Fibra");
        martelo.setMaterialPonteira("Aço");
        
        System.out.println(martelo.toString());
        System.out.println(martelo.toString(true));
        System.out.println(martelo.toString(false));
        System.out.println("É pesado? " + martelo.ehPesado());
        System.out.println("É caro? " + martelo.ehCaro());
        System.out.println("É perigoso? " + martelo.ehPerigosa());
        
        System.out.println();
        
        
        
        //Serra
        Serra serra = new Serra();
        
        serra.setCor("Preta");
        serra.setEletrica(true);
        serra.setFuncao("Corte");
        serra.setMarca("WEG");
        serra.setPeso(5.0);
        serra.setPreco(23.0);
        serra.setPossuiBateria(true);
        serra.setTamanhoCorte(20);
        
        System.out.println(serra.toString());
        System.out.println(serra.toString(true));
        System.out.println(serra.toString(false));
        System.out.println("É pesado? " + serra.ehPesado());
        System.out.println("É caro? " + serra.ehCaro());
        System.out.println("É perigosa? " + serra.ehPerigosa());
        
    }
}
