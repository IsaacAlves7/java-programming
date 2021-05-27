//Aplicação para uso da Classe Aluno

public class AppAluno { // declaração e início da classe

    public static void main (String[] args){// método inicial da App
    
    Aluno aluno1 = new Aluno(); // Criação ou instanciação do objeto aluno1
    
    Aluno aluno2 = new Aluno(); // Criação ou instanciação do objeto aluno2
    
    Aluno aluno3 = new Aluno(); // Criação ou instanciação do objeto aluno3
    
    //definindo valores para os atributos do aluno1
    
    aluno1.matricula = "1001";
    
    aluno1.nome = "André";
    
    aluno1.cr = 6.7;
    
    //definindo valores para os atributos do aluno2
    
    aluno2.matricula = "1002";
    
    aluno2.nome = "Maria";
    
    aluno2.cr = 7.5 ;
    
    //definindo valores para os atributos do aluno3
    
    aluno3.matricula = "1003";
    
    aluno3.nome = "João";
    
    aluno3.cr = 7.0;
    
    //exibindo os valores dos atributos de cada aluno:
    
    aluno1.imprimir();
    aluno2.imprimir();
    aluno3.imprimir();
    
    }
    
    }