/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.gestaocomprasacesso;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Item {
    private Integer quantidade;
    
    private Produto produto;
    private Compra compra;

    public Item() {
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    public BigDecimal calcularTotal() {
        BigDecimal total = produto.getPreco().multiply(new BigDecimal(quantidade));
        return total;
    }

    @Override
    public String toString() {
        return produto.getNome() + " " + quantidade + " x R$ " + produto.getPreco() + " = R$ " + calcularTotal() + "; ";
    }
}
