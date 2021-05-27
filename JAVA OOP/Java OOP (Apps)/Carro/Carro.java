// Classe Carro

public class Carro{
    // Attributesdf

    float velocidade;
    boolean buzina, farol;
    String marca, modelo, ano, cor;

    // Methods
    public void acelerar(){
        if(velocidade <= 0){
          this.velocidade = 20;
          System.out.println("Aumentando velocidade para 20km/h | Velocidade Atual: " + velocidade + "km/h");
        }
        else{
            System.out.println("Reduzir para 10km/h");
        }
    }

    public void frear(){
        if(velocidade >= 20){
            this.velocidade = this.velocidade - 10;
            System.out.println("Reduzindo velocidade para 10km/h | Velocidade Atual: " + velocidade + "km/h");
          }
          else{
              System.out.println("Reduzir para 10km/h");
          }
    }

    public void buzinar(){
        if(buzina = true){
            System.out.println("Bi! bi!");
          }
          else{
              System.out.println("Erro na buzina");
          }
    }

    public void ligarDesligarfarol(){
        if(farol = true){
            System.out.println("Farol Aceso");
          }
          else{
              System.out.println("Farol Apagado");
          }
    }

    public void exibirInfo(){

    }

    public void encherCombustivel(){
    }    

    public void trocarMarcha(){

    }

    
}

