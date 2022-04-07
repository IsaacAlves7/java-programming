import java.util.Scanner;
// Scanner para imprimir os dados

public class AppCarro {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        Carro car1 = new Carro();
        
        // Entrada de Dados
        System.out.println("---------- Entrada de Dados - Carro ----------");
        
        // Fabricante
        System.out.println("Digite o Fabricante do Carro: ");
        car1.setFabricante(entrada.nextLine());

        // Modelo
        System.out.println("Digite o Modelo do Carro: ");
        car1.setModelo(entrada.nextLine());

        // Placa
        System.out.println("Digite a Placa do Carro: ");
        car1.setPlaca(entrada.nextLine());

        // Cor
        System.out.println("Digite a Cor do Carro: ");
        car1.setCor(entrada.nextLine());

        // Valor
        System.out.println("Digite o Valor do Carro: ");
        car1.setValor(Double.parseDouble(entrada.nextLine()));

        // Número de Portas
        System.out.println("Digite o N° de Portas do Carro: ");
        car1.setNumeroPortas(Integer.parseInt(entrada.nextLine()));

        // Ano de Fabricação
        System.out.println("Digite o Ano de Fabricação do Carro: ");
        car1.setAnoFabricacao(Integer.parseInt(entrada.nextLine()));

        // Ano do Modelo
        System.out.println("Digite o Ano do Modelo do Carro: ");
        car1.setAnoModelo(Integer.parseInt(entrada.nextLine()));

        // Saída de Dados
        System.out.println("--------------- Saída de Dados - Carro ----------------");
        car1.imprimir();
    }
}
