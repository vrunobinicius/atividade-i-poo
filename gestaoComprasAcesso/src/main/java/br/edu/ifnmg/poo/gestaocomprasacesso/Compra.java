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
public class Compra {
    private String notaFiscal;
    
    private Pessoa pessoa;
    private ArrayList<Item> itens;

    public Compra() {
        this.itens = new ArrayList<>();
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    public void adicionarItens(Item item){
        this.getItens().add(item);
    }
    
    public BigDecimal calcularTotal(){ 
        BigDecimal total = new BigDecimal("0");
        for(Item a : itens){
            total = total.add(a.calcularTotal());
        }
        return total; 
    }

    @Override
    public String toString() {
        String stringItens = "[";
        int i = 1;
        for(Item a : itens) {
            stringItens = stringItens + "Item " + i + ": " + a.toString();
            i++;
        }
        stringItens = stringItens + "]";
        
        String formattedNotaFiscal = notaFiscal.substring(0,3) + "." + notaFiscal.substring(3,6) 
                + "." + notaFiscal.substring(6,9);
        return "Nota Fiscal: " + formattedNotaFiscal + "; Cliente: " + pessoa.getNome() + "; R$ " + calcularTotal() + "; " + stringItens;
    }
}
