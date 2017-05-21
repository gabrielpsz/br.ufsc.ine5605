/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck
 */
public class Elevador implements IElevador {
    
    private int capacidade;
    private int totalPessoas;
    private int totalAndaresPredio;
    private int andarAtual;
    
    public Elevador(int andarAtual, int totalAndaresPredio, int capacidade, int totalPessoas) {
        this.andarAtual = andarAtual;
        this.totalAndaresPredio = totalAndaresPredio;
        this.capacidade = capacidade;
        this.totalPessoas = totalPessoas;
    }
    
    public int getCapacidade() {
        return this.capacidade;
    }
    public int getTotalPessoas() {
        return this.totalPessoas;
    }
    public String descer() {
        if (this.andarAtual == 0) {
            System.out.println("O andar atual eh 0, nao pode descer.");
            return null;
        } else {
            this.andarAtual -= 1;
            return "Elevador descendo";
        }
    }
    public String entraPessoa() {
        this.totalPessoas += 1;
        return "Entrando pessoa";
    }
    public String saiPessoa() {
        this.totalPessoas -= 1;
        return "Saindo pessoa";
    }
    public String subir() {
        if ((this.andarAtual+1) > this.totalAndaresPredio) {
            return "Nao foi possivel subir.";
        } else {
            this.andarAtual += 1;
            return "Elevador subindo";
        }
    }
    public void setTotalAndaresPredio(int totalAndaresPredio) {
        this.totalAndaresPredio = totalAndaresPredio;
    }
    public int getTotalAndaresPredio() {
        return this.totalAndaresPredio;
    }
    public int getAndarAtual() {
        return this.andarAtual;
    }
    
    
}