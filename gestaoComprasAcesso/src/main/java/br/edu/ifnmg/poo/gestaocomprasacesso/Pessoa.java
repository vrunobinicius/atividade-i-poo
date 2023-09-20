/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.gestaocomprasacesso;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Pessoa {
    private String nome; // maxLenght = 45, Exception
    private LocalDate nascimento;
    private byte idade; // Derivada de nascimento
    
    private Credencial credencial;
    private ArrayList<Compra> compras;
    private ArrayList<Telefone> telefones;
    private ArrayList<Endereco> enderecos; 

    public Pessoa() {
        this.compras = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }

    //<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() > 45) {
            throw new Exception();
        }
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.idade = (byte) (LocalDate.now().getYear() - nascimento.getYear());
        this.nascimento = nascimento;
    }

    public byte getIdade() {
        return idade;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    private ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    private ArrayList<Compra> getCompras() {
        return compras;
    }

    private ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
    
    public void adicionarCompra(Compra c){
        this.getCompras().add(c);
    }
    
    public void adicionarTelefone(Telefone tel){
        this.getTelefones().add(tel);
    }
    
    public void adicionarEndereco(Endereco end){
        this.getEnderecos().add(end);
    }
    
    public BigDecimal gastoTotal(){
        BigDecimal gasto = new BigDecimal("0");
        for(Compra a : compras){
            gasto = gasto.add(a.calcularTotal());
        }
        return gasto;
    }

//</editor-fold>
    
    @Override
    public String toString() {
        String stringCompras = "";
        for(Compra a : compras){
            stringCompras = stringCompras + a.getItens().toString();
        }
        String stringTelefones = "[";
        for(Telefone b : telefones){
            stringTelefones = stringTelefones + b.toString() + ", ";
        }
        String stringEnderecos = "[";
        for(Endereco c : enderecos){
            stringEnderecos = stringEnderecos + c.toString() + "; ";
        }
        return nome + ", " + nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
                    + ", " + idade + " anos, " + credencial + ", " + "Endereços: " + stringEnderecos + "]" 
                    + ", Telefones: " + stringTelefones + "], " + "Gasto Total: " + gastoTotal() + ", Compras: " + stringCompras;
    }
}
