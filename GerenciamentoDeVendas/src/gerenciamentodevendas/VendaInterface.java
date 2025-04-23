/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentodevendas;

import java.util.ArrayList;

/**
 *
 * @author adria
 */
public interface VendaInterface {
    public Venda cadastrarVenda(ArrayList<Produto> produtosCadastrados);
    public void adicionarProdutoNaVenda(ArrayList<Produto> produtosCadastrados);
    public void calcularValorDaVenda();
}
