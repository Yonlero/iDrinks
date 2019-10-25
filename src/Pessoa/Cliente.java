package Pessoa;

import java.util.ArrayList;
import Telas.*;
import Telas.TelaCadastroDadosPessoais;
import Telas.TelaCadastroEndereco;

public class Cliente{
    //------------------------Atributos Comum para todos Cliente-----------------------------
    private String Nome;
    private String CPF;
    private String Email;
    private String Telefone;
    private String DataNascimento;
    private Endereco EnderecoPessoa;
    //------------------------Começando os Metodos GET de todos esses atributos--------------

    public String getNome() { // Retornando o Nome
        return Nome;
    }

    public String getCPF() { // Retornando o CPF
        return CPF;
    }
    
    public String getEmail() { // Retornando o Email
        return Email;
    }
    
    public String getTelefone() { // Retornando o Telefone
        return Telefone;
    }

    public String getDataNascimento() { // Retornando a Data de Nascimento
        return DataNascimento;
    }

    public Endereco getEnderecoPessoa() { // Retornando o Endereco da Pessoa
        return EnderecoPessoa;
    }

    //-----------------------Começando os metodos SET de todos esses atributos-----------------

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public void setEnderecoPessoa(Endereco EnderecoPessoa) {
        this.EnderecoPessoa = EnderecoPessoa;
    }
    
    //-----------------------Criando um construtor sem o endereco pois o mesmo sera adicionado posteriormente---------------

    public Cliente(String Nome, String CPF, String Email, String Telefone, String DataNascimento) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Email = Email;
        this.Telefone = Telefone;
        this.DataNascimento = DataNascimento;
    }
    
    //----------------------Construtor Vazio Somente para inicializar estancias quaisquer

    public Cliente() {
    }
    
    
}