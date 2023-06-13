/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaDeCadastro;

/**
 *
 * @author Caue
 */
public class Cliente {

    private String senha;
    private String nome;
    private String idade;
    private String email;


    public Cliente(String senha, String nome, String idade, String email) {
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.email = email;

    }
    
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
    
}


