
package com.mycompany.bookduck;

import java.util.Scanner;
import com.mycompany.bookduck.Historico.Catalogo;
import com.mycompany.bookduck.Obra.Obra;
import com.mycompany.bookduck.Clientes;
import com.mycompany.bookduck.pessoa.Cliente;


public class Bookduck {
    Scanner entrada = new Scanner(System.in);
    public static void menu(){
        System.out.println("|-----------------------------------|");
        System.out.println("|           (1) Cliente             |");
        System.out.println("|           (2) Obra                |");
        System.out.println("|           (0) Sair                |");
        System.out.println("|           (99) ver menu           |");
        System.out.println("|-----------------------------------|");
    }
    
    public static void menuCLientes(){
        System.out.println("|-----------------------------------|");
        System.out.println("|       (1) Cadastro de cliente     |");
        System.out.println("|       (2) Pontos de fidelidade    |");
        System.out.println("|       (3) Alteraçao no cliente    |");
        System.out.println("|       (4) Remoção de cliente      |");
        System.out.println("|       (5) printa todos os cliente |");
        System.out.println("|           (0) Sair                |");
        System.out.println("|-----------------------------------|");
        
    }
    
    public static void menuCLienteAlteracao(){
        System.out.println("|-----------------------------------|");
        System.out.println("|       (1) Alterar  Email          |");
        System.out.println("|       (2) Exibir PF               |");
        System.out.println("|-----------------------------------|");
    }
    
    public static void menuObra(){
        System.out.println("|-----------------------------------|");
        System.out.println("|       (1) Cadastro de obra        |");
        System.out.println("|       (2) Alteraçao de obra       |");
        System.out.println("|       (2) Remoção de obra         |");
        System.out.println("|-----------------------------------|");
    }
    
     public static void menuObraAlteracao(){
        System.out.println("|-----------------------------------|");
        System.out.println("|       (1) Alterar editora         |");
        System.out.println("|       (2) Alterar local           |");
        System.out.println("|-----------------------------------|");
    }
     
     
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
    

    public static void main(String[] args) {
        
        Catalogo catalogo = new Catalogo();
        Clientes clientes = new Clientes();

        
        int opcao = 99;
        int cl = 0;
        do{
            Scanner entrada = new Scanner(System.in);
            if (opcao != 0)
                menu();
            System.out.print("-> ");
            opcao = entrada.nextInt();
            System.out.println();
            switch(opcao){
                case 1:
                    do{
                    menuCLientes();
                    System.out.print("-> ");
                    cl = entrada.nextInt();
                    System.out.println();
                    switch(cl){
                        case 1:
                            clearBuffer(entrada);
                            Cliente c = new Cliente();
                            System.out.print("Nome: ");
                            c.setName(entrada.next());
                            clearBuffer(entrada);
                            System.out.print("\nCpf: ");
                            c.setCpf(entrada.next());
                            clearBuffer(entrada);
                            System.out.print("\nEmail: ");
                            c.setEmail(entrada.next());
                            clearBuffer(entrada);
                            System.out.println();
                            clientes.addCliente(c);
                            break;
                            
                        case 2:
                            clearBuffer(entrada);
                            System.out.print("Nome do cliente que deseja add pf: ");
                            Cliente aux = null;
                            aux = clientes.procuraCliente(entrada.next());
                            
                            if(aux != null){
                                System.out.print("\nQuantidade de pontos que deseja add: ");
                                aux.setPontoDeFidelidade(entrada.nextInt());
                            }
                            else
                                System.out.println("cliente nao encontrado, favor revisar o nome.");
                            
                            break;
                            
                        case 3:
                            
                            System.out.print("Nome do cliente que deseja fazer alteraçoes: ");
                            aux = null;
                            aux = clientes.procuraCliente(entrada.next());
                            clearBuffer(entrada);
                            menuCLienteAlteracao();
                            int cla = entrada.nextInt();
                            if(aux != null){
                                if (cla == 1){
                                    System.out.print("\nDigite o novo email: ");
                                        aux.setEmail(entrada.next());
                                        clearBuffer(entrada);
                                }
                            }
                            break;
                        
                        case 4:
                            
                            System.out.print("Nome do cliente que deseja excluir: ");
                            aux = null;
                            aux = clientes.procuraCliente(entrada.next());
                            if (aux != null)
                                clientes.removerCliente(aux);
                            else 
                                System.out.println("cliente nao encontrado, favor revisar o nome.");
                            break;
                            
                        case 5:

                            clientes.printaClientes();
                            break;
                            
                        }
                    }while(cl != 0);    
                break;
                
               
            
            
            
            }
        }while(opcao != 0);
    }
}
