public class Pessoa {
    // Attributes
    String nome, identidade;
    int idade;
    
    // Constructor Method
    public Pessoa(String nome, String identidade, int idade){
        // Setters and Attributes
        setNome(nome);
        setIdentidade(identidade);
        setIdade(idade);
    } 

    // Getter and Setter Methods

    // Nome - Getters and Setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String no){
        if(!no.isEmpty()){
            nome = no;
        }
    }

    // Identidade - Getters and Setters
    public String getIdentidade(){
        return identidade;
    }
    
    public void setIdentidade(String iden){
        if(!iden.isEmpty()){
            identidade = iden;
        }
    }

    // Idade - Getters and Setters
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int ida){
        if(ida > 0){
            idade = ida;
        }
    }

    // Imprimir() method
    public void imprimir(){
        System.out.println("Pessoa = " + nome);
        System.out.println("Identidade = " + identidade);
        System.out.println("Idade = " + idade);
    }
}