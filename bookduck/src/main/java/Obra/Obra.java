/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Obra;

/**
 *
 * @author davi2
 */
public class Obra {
    private int id;
    private String titulo;
    private String dataPublicacao;
    private String editora;
    private String localizacao;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    
}
