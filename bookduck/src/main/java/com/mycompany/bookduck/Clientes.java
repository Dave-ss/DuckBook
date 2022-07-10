/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookduck;

import java.util.ArrayList;
import com.mycompany.bookduck.pessoa.Cliente;
import java.util.List;
/**
 *
 * @author davi2
 */
public class Clientes {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    
    public Clientes(){
        
    }
    
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void removerCliente(Cliente cliente){
        if(clientes.remove(cliente)){
            System.out.println("cliente removido");
        }
    }
    
    public Cliente procuraCliente(String nome){
        Cliente aux = null;
        for(Cliente c : clientes){
            if(nome.equals(c.getName())){
                aux = c;
            }
        }
        return aux;   
    }
    
    public void printaClientes(){
        for(Cliente c : clientes)
            System.out.println(c.getName());
            
    }
    
    public void printaEmprestimos(){
        for(Cliente c : clientes)
            c.printaEmprestados();
    }
}
