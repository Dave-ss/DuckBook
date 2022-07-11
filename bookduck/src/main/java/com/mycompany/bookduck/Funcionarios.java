/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookduck;

import java.util.List;
import java.util.ArrayList;
import com.mycompany.bookduck.pessoa.Funcionario;

/**
 *
 * @author davi2
 */
public class Funcionarios {
    private  List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public Funcionarios(){
        
    }
    
    public void addFuncionarios(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    
    public void removerFuncionario(Funcionario funcionario){
        if(funcionarios.remove(funcionario)){
            System.out.println("funcionario removido");
        }
    }
    
    public Funcionario procuraFuncionario(String nome){
        Funcionario aux = null;
        for(Funcionario f : funcionarios){
            if(nome.equals(f.getName())){
                aux = f;
            }
        }
        return aux;
    }
    
    public void printaFuncionarios(){
        for(Funcionario f : funcionarios)
            System.out.println(f.getName() + " " + f.getCargo());
 
    }
    
}
