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
public class Produto {
    private String nome; // maxLenght = 150, Exception
    private BigDecimal preco;
    
    private ArrayList<Item> itens;

    public Produto() {
        this.itens = new ArrayList<>();
    }
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() > 150) {
            throw new Exception();
        }
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return nome + " R$" + preco;
    }
}
