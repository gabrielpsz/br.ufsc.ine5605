/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck
 */
public class ControladorElevador implements IControladorElevador {
    
    private Elevador elevador;

    
    /**
     * Faz o elevador subir um andar. Se nao for possivel subir, retorna mensagem de erro
     * @return Mensagem de erro, caso nao seja possivel realizar a operacao
     */
    public String subir() {
        if ((this.elevador.getAndarAtual()+1) > this.elevador.getTotalAndaresPredio()) {
            return "Nao foi possivel realizar a operacao.";
        } else {
            this.elevador.subir();
            return "Elevador subindo";
        }
    }    
    
    /**
     * Faz o elevador descer um andar. Se nao for possivel descer, retorna mensagem de erro
     * @return Mensagem de erro, caso nao seja possivel realizar a operacao
     */
    public String descer() {
        if (elevador.getAndarAtual() != 0) {
            elevador.descer();
            return "Elevador descendo.";
        } else {
            return "Nao foi possivel realizar a operacao.";
        }
    }

    /**
     * Entra uma pessoa no Elevador. Se nao for possivel permitir a entrada da pessoa, retorna mensagem de erro
     * @return Mensagem de erro, caso nao seja possivel realizar a operacao
     */
    public String entraPessoa() {
        //elevador.entraPessoa();
        return "Nao foi possivel realizar a operacao.";
    }
	
    /**
     * Sai uma pessoa no Elevador. Se nao for possivel permitir a saida da pessoa, retorna mensagem de erro
     * @return Mensagem de erro, caso nao seja possivel realizar a operacao
     */
    public String saiPessoa() {
        //elevador.saiPessoa();
        return "Nao foi possivel realizar a operacao.";
    }	
	
    /**
     *
     * @return Elevador
     */
    public Elevador getElevador() {
        return this.elevador;
    }

    /**
     *
     * @param andarAtual andar atual do elevador
     * @param totalAndaresPredio total de andares do predio
     * @param capacidade capacidade maxima do elevador
     * @param totalPessoas total de pessoas atual do elevador
     * @return retorna o Elevador instanciado como um IElevador
     */
    public IElevador inicializarElevador(int andarAtual, int totalAndaresPredio, int capacidade, int totalPessoas) {
        IElevador e = new Elevador(andarAtual, totalAndaresPredio, capacidade, totalPessoas);
        this.elevador = (Elevador)e;
        return e;
    }

    
}