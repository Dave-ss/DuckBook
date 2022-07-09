/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookduck.pessoa;

/**
 *
 * @author davi2
 */
public class Funcionario extends Pessoa {
    private int  vinculo;
    private int tempoDeServico;
    private double salario;
    private String dataContratacao;
    
   enum Cargo {
        AuxiliarDeBiblioteca(1), Bibliotecario(2), 
        AssistenteAdministrativo(3), Atendente(4), Recepcionista(5);

        private final int id;

        Cargo(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }
    
    public Funcionario(){
        
    }

    public Funcionario(int vinculo, String dataContratacao){
        this.vinculo = vinculo;
        this.dataContratacao = dataContratacao;
    }
    
    public Funcionario(int vinculo, String dataContratacao, double salario){
        this.vinculo = vinculo;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }   
    
    public int getVinculo() {
        return vinculo;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setVinculo(int vinculo) {
        this.vinculo = vinculo;
    }

    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
    public void aumentoSalario(int porcentagem){
        this.salario = salario + this.salario*porcentagem;
    }
    
    public void ferias(int diasFerias){
        
    }
    
    public String descricaoCargo(){
        switch(this.vinculo){
            case 1 -> {
                return "Auxilia nos serviços de aquisição, classificação, organização";
            }
            case 2 -> {
                return "Organizar, manter e disponibilizar os acervos bibliograficos";
            }
            case 3 -> {
                return "Preparar relatórios, formulários e planilhas";
            }
            case 4 -> {
                return "esponsável pelo atendimento - pessoal ou telefônico "
                        + "- garantindo o suporte necessário ao cliente";
            }
            case 5 -> {
                return "Recepcionar membros da comunidade e visitantes";
            }
        }
        return null;
    }
   
    
}
