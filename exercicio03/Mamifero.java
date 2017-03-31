/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
 
public abstract class Mamifero extends Animal{
    
    private int volumeSom;
    
   public Mamifero(int volumeSom, int tamanhoPasso) {
        super(tamanhoPasso);
        this.volumeSom = volumeSom;
    }
    
    public String produzirSom() {
        return "MAMIFERO: " +super.produzirSom() +volumeSom;
    }
    
    public int getVolumeSom() {
        return this.volumeSom;
    }
    
    public void setVolumeSom(int volumeSom) {
        this.volumeSom = volumeSom;
    }
    
}
