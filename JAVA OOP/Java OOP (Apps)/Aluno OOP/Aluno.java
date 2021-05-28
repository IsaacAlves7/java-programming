// Classe Aluno

public class Aluno { // declaração e início da classe

    // Atributos devem ser identificados começando por letras minúsculas
    
    String matricula, nome;
    
    double cr;
    
    // Métodos devem ser identificados começando por letras minúsculas
    
    public void imprimir( ){ // "método imprimir" os dados do Aluno
    
    System.out.println("Matrícula: " + matricula);
    
    System.out.println("Nome : " + nome);
    
    System.out.println("CR : " + cr);
    
    }
    
    public void setCr(double c){ // Setter
        if(c >= 0.0 && c <= 10.0){
            cr = c;
        }
    }

    public double getCr( ){ // Getter
        return cr;    
    }
    
    } // término da classe
    
    