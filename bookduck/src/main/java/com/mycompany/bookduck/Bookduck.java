
package com.mycompany.bookduck;

import com.mycompany.bookduck.Historico.Catalogo;
import com.mycompany.bookduck.Obra.Obra;
import com.mycompany.bookduck.pessoa.Cliente;


public class Bookduck {

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Cliente cliente = new Cliente();
        Obra obra = new Obra();
        Obra obra2 = new Obra();
        obra.setTitulo("teste1");
        obra2.setTitulo("teste2");
        cliente.setName("jao");
        
        catalogo.adcObra(obra, 5);
        catalogo.adcObra(obra2, 2);
        catalogo.printaObras();
       
        Obra aux = catalogo.retornaObra("teste1");
        System.out.println();
        cliente.printaHistorico();
         System.out.println();
        cliente.emprestimo(aux, "janeiro, 1, 2022");
        cliente.printaEmprestados();
         System.out.println();
        cliente.devolucao(aux, "fevereiro, 2, 2023");
        cliente.printaHistorico();
    }
}
