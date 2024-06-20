 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
abstract public class Pessoa {
    
    protected int id;
    protected String nome;
    protected char sexo;
    protected Date dataNascimento;
    protected String telefone;
    protected String email;
    protected String rg;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
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

    //Getters:
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
}   

