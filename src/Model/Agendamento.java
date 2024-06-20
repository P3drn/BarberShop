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
public class Agendamento {
   
    private int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private Date data;
    private String observacao;

    // Contrutor:
    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Setters:
    public void setId(int id){
        this.id = id;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setServico(Servico servico){
        this.servico = servico;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public void setData(Date data){
        this.data = data;
    }
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    //Getters:
    public int getId(){
        return id;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Servico getServico(){
        return servico;
    }
    public float getValor(){
        return valor;
    }
    public Date getData(){
        return data;
    }
    public String getObservacao(){
        return observacao;
    }

}
