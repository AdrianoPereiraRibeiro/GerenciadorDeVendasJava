/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentodevendas;

/**
 *
 * @author adria
 */
public abstract class ProdutoBase {
   public int codigo;
   public String nome;
   public double preco;

    public ProdutoBase() {
    }

    public ProdutoBase(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    public abstract Produto cadastrarProduto();
}
