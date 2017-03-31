/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */
public abstract class Ave extends Animal{
    
    private int alturaVoo;
    
    public Ave(int tamanhoPasso, int alturaVoo) {
        super(tamanhoPasso);
        this.alturaVoo = alturaVoo;
    }
    
    public int getAlturaVoo() {
        return this.alturaVoo;
    }
    
    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }
    
    public String voar() {
        return "";
    }
    
    public String mover() {
        return super.mover() +" VOANDO";
    }
    
    public String produzirSom() {
        return "AVE: " +super.produzirSom();
    }
}
