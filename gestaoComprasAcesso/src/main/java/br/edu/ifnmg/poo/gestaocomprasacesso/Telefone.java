/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.gestaocomprasacesso;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Telefone {
    private Byte ddd;
    private Integer numero;
    private boolean fixo;
    
    private Pessoa pessoa;

    public Telefone() {
    }
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
     public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean getFixo() {
        return fixo;
    }

    public void setFixo(Boolean fixo) {
        this.fixo = fixo;
    }
    //</editor-fold>

    @Override
    public String toString() {
        String num = "";
        String stringNumero =  numero.toString();
        if(fixo == true){
            num = num + stringNumero.substring(0, 4);
            num = num + "-" + stringNumero.substring(4, 8);
            return "(" + ddd + ")" + num;
        }
        return "(" + ddd + ")" + stringNumero.substring(0, 3) 
                                     + "-" + stringNumero.substring(3, 6)
                                     + "-" + stringNumero.substring(6, 9);
    }
}
