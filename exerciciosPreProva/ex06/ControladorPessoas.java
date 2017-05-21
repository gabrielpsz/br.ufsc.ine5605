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
public class ControladorPessoas implements IControladorPessoas {
 
    private ArrayList<Cliente> clientes;
    private ArrayList<Tecnico> tecnicos;
    
    public ControladorPessoas() {
        this.clientes = new ArrayList<Cliente>();
        this.tecnicos = new ArrayList<Tecnico>();
    }
 
    /**
     *
     * @return retorna a lista de clientes
     */
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    /**
     * 
     * @return retorna a lista de tecnicos
     */
    public ArrayList<Tecnico> getTecnicos() {
        return this.tecnicos;
    }

    /**
     * Permite a inclusao de um novo cliente na lista de clientes
     * @param codigo codigo do Cliente
     * @param nome nome do Cliente
     * @return retorna o cliente inserido como um IPessoa
     */
    public IPessoa incluiCliente(int codigo, String nome) {
        IPessoa cliente = new Cliente(codigo, nome);
        return cliente;
    }

    /**
     * Permite a inclusao de um novo tecnico na lista de tecnicos
     * @param codigo codigo do tecnico
     * @param nome nome do tecnico
     * @return retorna o tecnico inserido como um IPessoa
     */
    public IPessoa incluiTecnico(int codigo, String nome) {
        IPessoa tecnico = new Tecnico(codigo, nome);
        return tecnico;
    }
    
}