/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.gestaocomprasacesso;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Credencial {
    private String email;
    private String senha; // maxLenght = 12, Exception
    private Boolean administrador = false;
    
    private Pessoa pessoa;

    public Credencial() {}
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha.length() > 12) {
            throw new Exception();
        }
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }
    
    public void setAdministrador(Boolean administrador) {    
        this.administrador = administrador;
    }

//</editor-fold>

    @Override
    public String toString() {
        String user = (administrador)?"Administrador":"Usuário geral";
        return email + ", " + "'" + senha + "'" + ", " + user;
    }
    
}
