public class AppCarro{

    public static void main (String[] args) {

        Carro carro1 = new Carro(); 

        carro1.velocidade = 0;
        carro1.buzina = true;
        carro1.farol = true;

        carro1.buzinar();
        carro1.acelerar();
        carro1.frear();
        carro1.ligarDesligarfarol();
    }
}