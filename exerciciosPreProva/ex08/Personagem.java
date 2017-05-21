/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 15/04/2016
 */
public class Personagem {
    
    private int energia;
    private int habilidade;
    private int velocidade;
    private int resistencia;
    private TipoPersonagem tipo;
    
    public Personagem(int energia, int habilidade, int velocidade, int resistencia, TipoPersonagem tipo) {
        this.energia = energia;
        this.habilidade = habilidade;
        this.velocidade = velocidade;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    
    public int getEnergia() {
        return this.energia;
    }
    
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public int getHabilidade() {
        return this.habilidade;
    }
    
    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
    
    public int getVelocidade() {
        return this.velocidade;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public int getResistencia() {
        return this.resistencia;
    }
    
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public TipoPersonagem getTipo() {
        return this.tipo;
    }
    
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }
    
    public int getValorTotalCarta() {
        return energia + habilidade + velocidade + resistencia;
    }
    
}