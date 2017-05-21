import java.util.*;
/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date 11/04/2016
 */
public class ControladorChamados implements IControladorChamados {
    
    private ArrayList<IChamado> chamados;
    
    public ControladorChamados() {
        this.chamados = new ArrayList<IChamado>();
    }
    
    /**
     * Retorna o total de chamados registrados para o TipoChamado recebido como parametro
     * @param tipo TipoChamado
     * @return int com a quantidade total dos chamados daquele tipo
     */
    public int getTotalChamadosPorTipo(TipoChamado tipo) {
        int contador = 0;
        for (IChamado tc : this.chamados) {
            if (tc.getTipo().getCodigo() == tipo.getCodigo()) {
                contador += 1;    
            }
            
        }
        return contador;
    }

    /**
     * Permite incluir um novo chamado na lista de Chamados. O chamado incluido eh retornado como um IChamado
     * @param data data do chamado em formato Date
     * @param cliente referencia para o Cliente do chamado
     * @param tecnico referencia para o Tecnico do chamado
     * @param titulo titulo do chamado
     * @param descricao descricao do chamado
     * @param prioridade prioridade do chamado
     * @param tipo tipo do chamado (TipoChamado)
     * @return retorna o chamato cadastrado
     */
    public IChamado incluiChamado(Date data, Cliente cliente, Tecnico tecnico, String titulo, String descricao, int prioridade, TipoChamado tipo) {
        IChamado chamado = new Chamado(cliente, descricao, prioridade, tecnico, tipo, titulo);
        this.chamados.add(chamado);
        return chamado;
    }

    /**
     * Permite incluir um novo TipoChamado na lista de TiposChamado. O TipoChamado incluido eh retornado como um ITipoChamado
     * @param codigo codigo do Tipo Chamado
     * @param nome nome do Tipo Chamado
     * @param descricao descricao do Tipo Chamado
     * @return retorna o Tipo Chamado cadastrado
     */
    public ITipoChamado incluiTipoChamado(int codigo, String nome, String descricao) {
        ITipoChamado tipoChamado = new TipoChamado(codigo, nome, descricao);
        return tipoChamado;
    }
    
}