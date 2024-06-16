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
public class Cliente {
    
    private int id;
    private String nome;
    private char sexo;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String rg;
    private String endereço;
    private String cep;

    public Cliente(int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg, String endereço, String cep) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.endereço = endereço;
        this.cep = cep;
    }

    public Cliente(int id, String nome, char sexo, String telefone, String endereço) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereço = endereço;
    }
    
    // Setters:
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
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
    public void setEndereco(String endereco){
        this.endereço = endereco;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    
    // Getters:
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
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
    public String getEndereco(){
        return endereço;
    }
    public String getCep(){
        return cep;
    }
}
