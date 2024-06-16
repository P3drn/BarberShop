/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author pedro
 */
public class Usuario {
   
    private int id;
    private String nome;
    private String senha;
    private String nivelAcesso;
    private char sexo;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String rg;

    public Usuario(int id, String nome, String senha, String nivelAcesso, char sexo, Date dataNascimento, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    
    // Setters:
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    
    // Getters:
    public String getNome(){
        return nome;
    }
    public String getSenha(){
        return senha;
    }
    public String getNivelAcesso(){
        return nivelAcesso;
    }
    public char getSexo(){
        return sexo;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }
    public String getRg(){
        return rg;
    }
    
    
}
