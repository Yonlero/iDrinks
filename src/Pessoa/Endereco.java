package Pessoa;
//Toda essa Classe foi feita na mão no Visual Studio Code
public class Endereco{
    //---------------------Atributos de um endereco Comum--------------------------------
    private String Rua;
    private String Bairro;
    private String CEP;
    private String Cidade;
    private String Complemento;
//------------------------Começando os Metodos GET de todos esses atributos--------------
    public String GetRua(){ //Metodo para Retornar a Rua do Cliente
        return this.Rua;
    }

    public String GetBairro(){ //Metodo para Retornar o Bairro do Cliente
        return this.Bairro;
    }

    public String GetCEP(){ //Metodo para Retornar o CEP do Cliente
        return this.CEP;
    }

    public String GetCidade(){ //Metodo para Retornar a Cidade do Cliente
        return this.Cidade;
    }

    public String GetComplemento(){ //Metodo para Retonar o Complemento do Endereco do Cliente caso tenha
        return this.Complemento;
    }

//-----------------------Começando os metodos SET de todos esses atributos-----------------
    public void SetRua(String Rua){ //Definindo a Rua do Cliente
        this.Rua = Rua;
    }

    public void SetBairro(String Bairro){ //Definindo o Bairro 
        this.Bairro = Bairro;
    }

    public void SetCEP(String CEP){ //Definindo o CEP
        this.CEP = CEP;
    }

    public void SetCidade(String Cidade){ //Definindo a cidade
        this.Cidade = Cidade;
    }

    public void SetComplemento(String Complemento){ //Definindo o Complemento
        this.Complemento = Complemento;
    }

//---------------------Definindo os Construtores desse Metodo-------------------------------
    //Construtor Sem o atributo complemento pois o mesmo e opcional e não obrigatorio
    public Endereco(String Rua, String Bairro, String CEP, String Cidade){
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
    }

    //Construtor Com o atributo Complemento
    public Endereco(String Rua, String Bairro, String CEP, String Cidade, String Complemento){
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.Complemento = Complemento;
    }
    //Não existe Construtor vazio pois e obrigatorio o cliente possuir um endereco!!!
}