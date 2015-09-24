package Funcionalidades;

import java.util.*;
import java.io.*;

public class Produto implements Serializable {

    private int codigo, matricula, quantidade;
    private String nome, data, fornecedor;
    private boolean aprovar;

    public boolean isAprovar() {
        return aprovar;
    }

    public void setAprovar(boolean aprovar) {
        this.aprovar = aprovar;
    }
    
    int getQuantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
