/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;

import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author leonardo
 */
public class Teste {
    public static void main(String[] args) throws IOException, ParseException {
        UsaProduto.cadastrarProduto();
        SaidaProduto.saida();
        Consulta.consulta();
    }
}
