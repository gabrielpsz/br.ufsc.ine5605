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
public class Chamado implements IChamado {
    
    private Cliente cliente;
    private String descricao;
    private int prioridade;
    private Tecnico tecnico;
    private TipoChamado tipo;
    private String titulo;
    
    public Chamado(Cliente cliente, String descricao, int prioridade, Tecnico tecnico, TipoChamado tipo, String titulo) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.tecnico = tecnico;
        this.tipo = tipo;
        this.titulo = titulo;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public Tecnico getTecnico() {
        return this.tecnico;
    }

    public TipoChamado getTipo() {
        return this.tipo;
    }

    public String getTitulo() {
        return this.titulo;
    }
    
}