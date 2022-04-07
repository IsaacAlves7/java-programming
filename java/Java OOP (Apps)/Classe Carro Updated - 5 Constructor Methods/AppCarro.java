public class AppCarro{
    public static void main(String[] args) {
    Carro car1 = new Carro();
    car1.entradaDados();
    car1.imprimir();
    
    Carro car2 = new Carro("AAA1A00", 25000);
    car2.imprimir();
    
    Carro car3 = new Carro("Logan", "Azul", "ABC1E00", 32000);
    car3.imprimir();
    
    Carro car4 = new Carro("Audi", "A5", "Prata", "AUD0I00", 123000);
    car4.imprimir();
    
    Carro car5 = new Carro("Fiat", "Argo", "Verde", "ABB1I00", 42000, 5, 2018, 2019);
    car5.imprimir();
    
    }    
}