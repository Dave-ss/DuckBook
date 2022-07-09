/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookduck.pessoa;

/**
 *
 * @author davi2
 */
public class Cliente extends Pessoa{
    private int pontoDeFidelidade = 0;
    //private hash de livro livrosEmpretados
    //private hitorico<historico>
    
    
    public Cliente(){
        
    }
    
    public Cliente(int pontoDeFidelidade){
        this.pontoDeFidelidade = pontoDeFidelidade;
    }
    
    private void buscaLivro(String nomeLivro){
        
    }

    public int getPontoDeFidelidade() {
        return pontoDeFidelidade;
    }

    public void setPontoDeFidelidade(int pontoDeFidelidade) {
        this.pontoDeFidelidade = pontoDeFidelidade;
    }
    
    public void emprestimo(String nomeLivro){
        
    }
            
    public void devolucao(String nomeLivro){
        
    }
    
    public void atualizaFidelidade(int valor){
        this.pontoDeFidelidade += valor;
    }
}
