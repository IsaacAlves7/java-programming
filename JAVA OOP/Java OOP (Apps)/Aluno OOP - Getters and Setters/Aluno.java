public class Aluno{
    // Atributos devem ser identificados começando por letras minúsculas

    String matricula, nome;
    double cr;

    // Métodos também
    public void setMatricula(String m){
        if(!m.isEmpty()){ // se o parâmetro m NÃO (!) estiver vazio
            matricula = m; // será feita a atribuição
        }
    }

    public String getMatricula(){
        return matricula; // retorna a matrícula
    }

    public void setNome(String n){
        if(!n.isEmpty()) { // se o parâmetro n NÃO (!) estiver vazio
            nome = n; // será feita a atribuição
        }
    }

    public String getNome(){
        return nome; // retorna o nome
    }

    public void setCr(double c){
        if (c >= 0 && c <= 10){ // se o parâmetro c for válido
            cr = c; // o valor de c será atribuído
        }
    }

    public double getCr(){
        return cr; // retorna o CR
    }

    public void imprimir(){
        // os métodos Getters foram usados aqui
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("CR: " + getCr());
    }
}