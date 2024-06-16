/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author pedro
 */
public class main {
    
    public static void main(String[] args){
        // Teste Cliente
        //String nome = "Pedro";
        //System.out.println(nome);
        //Cliente cliente = new Cliente(01, "Pedro Escadão", 'M', "948272466", "R.Matriz de Camaragibe, 13");
        //System.out.println(cliente);
        // Teste Servico
        //Servico servico = new Servico(01, "barba", 15);
        //System.out.println(servico.getDescricao());
        //System.out.println(servico.getValor());
        // Teste usuario
        Usuario usuario = new Usuario(1, "Ivan", "teste001");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getSenha());
    }
    
    
    
}
