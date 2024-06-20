/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import view.Login;

/**
 *
 * @author pedro
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        // Pegar um usuario da view
        Usuario usuario = helper.obterModelo();
        
        // Pesquisar o usuario no banco
        // Se o usuario da view tiver o mesmo usuario e senha do mesmo usuario do banco, eu vou redirecionar para o MenuPrincipal
        // Senão, vou mostrar uma mensagem ao usuario "Usuario ou senha invalido".
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
