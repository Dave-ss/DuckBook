/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookduck;

import java.util.ArrayList;
import com.mycompany.bookduck.pessoa.Cliente;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author davi2
 */
public class Clientes implements Serializable {
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
    
    public void alterarArquivo() throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream("G:/ssd prog/Java/DuckBook/bookduck/src/main/java/arquivos/clientes.file");
        ObjectOutputStream objeto = new ObjectOutputStream(file);
        objeto.writeObject(this.clientes);
        objeto.flush();        
    }
    
    public void carregarArquivo() throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
            FileInputStream file = new FileInputStream("G:/ssd prog/Java/DuckBook/bookduck/src/main/java/arquivos/clientes.file");
            ObjectInputStream objeto = new ObjectInputStream(file);
            
            ArrayList cliente = (ArrayList<Cliente>)objeto.readObject();
            objeto.close();
            System.out.printf("arraylist de objetos: %s\n", cliente);
            
            for(Object c : cliente){
                System.out.printf("nome: %s\n", ((Cliente) c).getName());
                this.addCliente((Cliente) c);
            }
        } catch(FileNotFoundException e){
            
            System.out.println("arquivo inexistente");
        }
    }
}
