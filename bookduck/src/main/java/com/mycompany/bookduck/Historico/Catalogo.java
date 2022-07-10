/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookduck.Historico;

import com.mycompany.bookduck.Obra.Obra;
import java.util.HashMap;

/**
 *
 * @author davi2
 */
public class Catalogo {
    private HashMap<Obra, Integer> catalogo = new HashMap<>();
    
    public Catalogo(){
        
    }
    
    public void adcObra(Obra obra, int qtd){
        catalogo.put(obra, qtd);
    }
    
    public void atualizaQtd(Obra obra, int qtd){
        catalogo.put(obra, qtd);
    }
    
    
    public void removerObra(Obra obra){
        catalogo.remove(obra);
        System.out.print("obra removida com sucesso");
             
    }
    
    public int qtdExemplar(Obra obra){
        return (catalogo.get(obra));
    }
    
    public void printaObras(){
        
        for(Obra obra : catalogo.keySet()){
            System.out.println("Titulo: " + obra.getTitulo() + 
            "    Quantidade: "  + catalogo.get(obra) + "    Local: " +
            obra.getLocalizacao());
        }
    }
    
    public Obra retornaObra(String nome){
        Obra aux = null;
        for(Obra obra : catalogo.keySet()){
            if(nome.equals(obra.getTitulo()))
                aux = obra;  
        }     
        return aux;
    }
}
