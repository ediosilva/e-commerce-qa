package com.br.modelos;

public class Usuario{

    private String email;
    private String senha;


    public Usuario(String usuario, String senha) {
        this.email = usuario;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
