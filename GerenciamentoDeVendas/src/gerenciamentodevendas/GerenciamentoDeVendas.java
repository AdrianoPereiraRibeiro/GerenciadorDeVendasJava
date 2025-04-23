/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciamentodevendas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class GerenciamentoDeVendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scanner = new Scanner(System.in);
   ArrayList<Produto> produtos = new ArrayList<>();
   ArrayList<Venda> vendas = new ArrayList<>();
   Produto produto = new Produto();
   Venda venda = new Venda();
   
   boolean continuar = true;     
  while (continuar) {
    try {
        limparTela();
        mostrarMenu();
        
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                produtos.add(produto.cadastrarProduto());
                break;
            case 2:
                vendas.add(venda.cadastrarVenda(produtos));
                break;
            case 3:
                mostrarVendasEProdutos(produtos, vendas);
                break;
            case 4:
                continuar = false;
                break;
            default:
                System.out.println("Opção Indisponível!");
                break;
        }
    } catch (NumberFormatException e) {
        System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
    } 
}

    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }   }
    
    public static void mostrarVendasEProdutos(ArrayList<Produto> produtos,ArrayList<Venda> vendas){
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
        System.out.println("Vendas:");
        for (Venda venda : vendas) {
            System.out.println(venda.toString());
        }
        
    }
    public static void mostrarMenu(){
        System.out.println("Digite 1- Cadastrar Produtos");
        System.out.println("Digite 2- Cadastrar Venda");
        System.out.println("Digite 3- Mostrar Vendas e Produtos");
        System.out.println("Digite 4 - Sair");
    
    
    }
}
