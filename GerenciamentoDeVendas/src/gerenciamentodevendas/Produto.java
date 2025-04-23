/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentodevendas;


import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Produto extends ProdutoBase{

    public Produto() {
    }

    @Override
    public Produto cadastrarProduto() {
       Scanner scanner = new Scanner(System.in);
       
    System.out.println("Digite o nome do produto:");
    String nome = scanner.nextLine();
    System.out.println("Digite o preço do produto:");   
    double preco = Double.parseDouble(scanner.nextLine());
    System.out.println("Digite o código do produto:");
    int cod = Integer.parseInt(scanner.nextLine());
    
    Produto produto = new Produto();
   
    produto.setCodigo(cod);
    produto.setNome(nome);
    produto.setPreco(preco);
    return produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto = " + nome;
    }
    
    
}
