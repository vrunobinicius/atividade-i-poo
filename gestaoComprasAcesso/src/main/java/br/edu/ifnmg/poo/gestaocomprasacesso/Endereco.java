/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.gestaocomprasacesso;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Endereco {
    enum TipoLogradouro {
        AVENIDA, PRACA, RUA, OUTRO;
    }
    
    TipoLogradouro tipoLogradouro;
    private String logradouro; // maxLenght = 255, Exception
    private Integer numero;
    private String bairro; // maxLenght = 50, Exception
    private Integer cep;

    //<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) throws Exception {
        if (logradouro.length() > 255) {
            throw new Exception();
        }
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if (bairro.length() > 50) {
            throw new Exception();
        }
        this.bairro = bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

//</editor-fold>

    @Override
    public String toString() {
        return logradouro + ", " + numero + ", " + bairro + ", " + cep;
    } 
}
