/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Agendamento;
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
        Cliente cliente = new Cliente(1, "Jean Patrick", "R.Teste, 23", "05483-42");
        System.out.println(cliente.getNome());
        // Teste Servico
        Servico servico = new Servico(01, "barba", 15);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        // Teste usuario
        Usuario usuario = new Usuario(001, "Ivan Figueira", "Teste123");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getSenha());
        // Teste agendamento
        Agendamento agendamento = new Agendamento(1, cliente, servico, servico.getValor(), "23/09/2024 08:30");
        System.out.println(agendamento.getCliente().getNome());
    }
    
    
    
}
