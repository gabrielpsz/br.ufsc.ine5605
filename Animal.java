/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
 
public abstract class Animal {
    
    private int tamanhoPasso;
    
    public Animal (int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }
    
    public int getTamanhoPasso() {
        return this.tamanhoPasso;
    }
    
    public void setTamanhoPasso(int tamanhoPasso) {
        this.tamanhoPasso = tamanhoPasso;
    }
    
    public String mover() {
        return "ANIMAL: DESLOCOU " +tamanhoPasso;
    }
    
    public String produzirSom() {
        return "PRODUZ SOM: ";
    }


}


