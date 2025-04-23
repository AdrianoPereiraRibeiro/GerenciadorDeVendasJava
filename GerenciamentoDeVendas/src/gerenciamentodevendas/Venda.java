/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentodevendas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Venda implements VendaInterface {

    public ArrayList<Produto> produtos = new ArrayList<>();
    public double valorTotalVenda;

    public Venda() {
    }

    public Venda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }
    
    
    
    
    
    @Override
    public void calcularValorDaVenda() {
        double soma =0;
        for (Produto produto : produtos) {
            soma = soma+ produto.getPreco();
        }
        valorTotalVenda = soma;
    }

    @Override
    public void adicionarProdutoNaVenda(ArrayList<Produto> produtosCadastrados) {
        Scanner scanner = new Scanner(System.in);
        for (Produto produtosCadastrado : produtosCadastrados) {
            System.out.println(produtosCadastrado.getCodigo() + " "+ produtosCadastrado.getNome());
        }
        System.out.println("Digite o codigo do produto para ser adicionado na compra:");
        int cod = Integer.parseInt(scanner.nextLine());
        for (Produto produtosCadastrado : produtosCadastrados) {
            if(cod == produtosCadastrado.getCodigo()){
            produtos.add(produtosCadastrado);
            }
        }
        
    }

    @Override
    public Venda cadastrarVenda(ArrayList<Produto> produtosCadastrados) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos produtos voce deseja adicionar na venda:");
        int qtd =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qtd; i++) {
            adicionarProdutoNaVenda(produtosCadastrados);
        }
    calcularValorDaVenda();
    Venda venda = new Venda(valorTotalVenda);
    venda.produtos = produtos;
    return venda ;
    }

    @Override
    public String toString() {
        return "Venda{" + "produtos=" + produtos.size() + ", valorTotalVenda=" + valorTotalVenda + '}';
    }
    
}
