import java.util.Scanner;

public class Carro{
    // use as regras da boa prática em programação Java
    // para os identificadores da classe, dos atributos e dos métodos

    // Attributes

    String fabricante, modelo, cor, placa;
    double valor;
    int numeroPortas, anoFabricacao, anoModelo;

    // Constructor Methods

    public Carro() { }

    public Carro(String placa, double valor){
        this.placa = placa;
        this.valor = valor;
    }

    public Carro(String modelo, String cor, String placa, double valor){
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
    }

    public Carro(String fabricante, String modelo, String cor, String placa, double valor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
    }

    public Carro(String fabricante, String modelo, String cor, String placa, double valor, int numeroPortas, int anoFabricacao, int anoModelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa= placa;
        this.valor = valor;
        this.numeroPortas = numeroPortas;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }

    // Getters and Setters Methods

    // Fabricante - Getters and Setters
    
    public String getFabricante () {
      return fabricante;    
    }
            
    public void setFabricante (String fab) {
      if(!fab.isEmpty()) {
        fabricante = fab;  
      }    
    }

    // Modelo - Getters and Setters
    
    public String getModelo () {
        return modelo;
    }
            
    public void setModelo (String mod) {
        if(!mod.isEmpty()) {
          modelo = mod;
        }
    }

    // Cor - Getters and Setters

    public String getCor() {
        return cor;
    }

    public void setCor (String co) {
        if(!co.isEmpty()){
            cor = co;
        }
    }

    // Placa - Getters and Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca (String pla){
        if(!pla.isEmpty()){
            placa = pla;
        }
    }

    // Valor - Getters and Setters

    public double getValor(){
        return valor;
    }

    public void setValor(double val){
        if(val > 0){
            valor = val;
        }
    }

    // Número de Portas - Getters and Setters+

    public int getNumeroPortas(){
        return numeroPortas;
    }

    public void setNumeroPortas(int nportas){
        if(nportas > 0){
            numeroPortas = nportas;
        }
    }

    // Ano de Fabricação - Getters and Setters

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anofab){
        if(anofab > 0){
            anoFabricacao = anofab;
        }
    }

    // Ano de Modelo - Getters and Setters

    public int getAnoModelo(){
        return anoModelo;
    }

    public void setAnoModelo(int anomod){
        if(anomod > 0){
            anoModelo = anomod;
        }
    }

    public void imprimir(){
        System.out.println("====================================================");
        System.out.println(">>>>>>>>> " +"Carro: "+ getFabricante() +" "+ getModelo() +" "+ getCor() + " <<<<<<<<<");
        System.out.println( "Fabricante : " + getFabricante() );
        System.out.println( "Modelo : " + getModelo() );
        System.out.println( "Cor : " + getCor() );
        System.out.println( "Placa : " + getPlaca() );
        System.out.println( "Valor : " + getValor() );
        System.out.println( "Número de Portas : " + getNumeroPortas() );
        System.out.println( "Ano de fabricação: " + getAnoFabricacao() );
        System.out.println( "Ano do Modelo : " + getAnoModelo() );
        System.out.println("====================================================");

    }

    public void entradaDados(){
        Scanner entrada = new Scanner(System.in);
        // O objetivo Scanner deve ficar local ao método
        // O objetivo Scanner para entrada de dados não é um atributo do carro
        // é apenas um objeto auxiliar a entrada de dados
        System.out.println("Digite o Fabricante do carro: ");
        setFabricante( entrada.nextLine() );

        System.out.println("Digite o Modelo do carro: ");
        setModelo( entrada.nextLine() );

        System.out.println("Digite a Cor do carro: ");
        setCor( entrada.nextLine() );

        System.out.println("Digite a Placa do carro: ");
        setPlaca( entrada.nextLine() );

        System.out.println("Digite o Valor do carro: ");
        setValor( Double.parseDouble( entrada.nextLine()) );

        System.out.println("Digite o Número de Portas do carro: ");
        setNumeroPortas( Integer.parseInt( entrada.nextLine()) );

        System.out.println("Digite o Ano de fabricação do carro: ");
        setAnoFabricacao( Integer.parseInt( entrada.nextLine()) );

        System.out.println("Digite o Ano do Modelo do carro: ");
        setAnoModelo( Integer.parseInt( entrada.nextLine()) );
    }
}