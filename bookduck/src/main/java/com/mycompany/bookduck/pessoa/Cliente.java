/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookduck.pessoa;

import com.mycompany.bookduck.Historico.HistoricoPessoa;
import com.mycompany.bookduck.Obra.Obra;

/**
 *
 * @author davi2
 */
public class Cliente extends Pessoa{
    private int pontoDeFidelidade = 0;
    private HistoricoPessoa historico;
    
    
    public Cliente(){
        historico = new HistoricoPessoa();
    }
    
    public Cliente(int pontoDeFidelidade){
        this.pontoDeFidelidade = pontoDeFidelidade;
    }
    

    public int getPontoDeFidelidade() {
        return pontoDeFidelidade;
    }

    public void setPontoDeFidelidade(int pontoDeFidelidade) {
        this.pontoDeFidelidade = pontoDeFidelidade;
    }
    
    public void emprestimo(Obra obra, String data){
        this.historico.emprestimo(obra, data);
    }
    
    public void printaHistorico(){
        System.out.println("Historico de " + this.getName() + ":");
        this.historico.printaHistorico();
    }
    public void printaEmprestados(){
        System.out.println("livros emprestados por " + this.getName() + ":");
        this.historico.printaEmprestados();
    }
            
    public void devolucao(Obra obra, String data){
        this.historico.devolucao(obra, data);
    }
    
    public void atualizaFidelidade(int valor){
        this.pontoDeFidelidade += valor;
    }
}
