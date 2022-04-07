import java.util.Scanner;

public class Carro {

// use as regras da boa prática em programação Java

// para os identificadores da classe, dos atributos e dos métodos

String fabricante, modelo, cor, placa;

double valor;

int numeroPortas, anoFabricacao, anoModelo;

// Getters e Setters Fabricante
public String getFabricante () {
    return fabricante;
}

public void setFabricante (String fab) {
  if(!fab.isEmpty()) {
    fabricante = fab;
  }
}

// Getters e Setters Modelo
public String getModelo () {
    return modelo;
}

public void setModelo (String mod) {
 if(!mod.isEmpty()) {
   modelo = mod;
 }
}

// Getters e Setters Cor
public String getCor () {
   return cor;
}

public void setCor (String co) {
  if(!co.isEmpty()) {
    cor = co;
  }
}

// Getters e Setters Placa
public String getPlaca () {
  return placa;
}

public void setPlaca (String pla) {
 if(!pla.isEmpty()) {
   placa = pla;
 }
}

// Getters e Setters Valor
public double getValor () {
  return valor;
}

public void setValor (double val) {
  if(val > 0) {
     valor = val;
}

}

// Getters e Setters Número de Portas
public int getNumeroPortas () {
 return numeroPortas;
}

public void setNumeroPortas (int nump) {
  if(nump > 0) {
    numeroPortas = nump;
  }
}

// Getters e Setters Ano de Fabricação
public int getAnoFabricacao () {
  return anoFabricacao;
}

public void setAnoFabricacao (int anof) {
  if(anof > 0) {
   anoFabricacao = anof;
  }
}

// Getters e Setters Ano do Modelo
public int getAnoModelo () {
 return anoModelo;
}

public void setAnoModelo (int anom) {
  if(anom > 0) {
    anoModelo = anom;
  }
}

public void imprimir (){

System.out.println( "------------------------------------");

System.out.println( "Fabricante : " + getFabricante() );

System.out.println( "Modelo : " + getModelo() );

System.out.println( "Cor : " + getCor() );

System.out.println( "Placa : " + getPlaca() );

System.out.println( "Valor : " + getValor() );

System.out.println( "Número de Portas : " + getNumeroPortas() );

System.out.println( "Ano de fabricação: " + getAnoFabricacao() );

System.out.println( "Ano do Modelo : " + getAnoModelo() );

}

public void entradaDados () {
  Scanner entrada = new Scanner( System.in );

// O objeto Scanner deve ficar local ao método

// o objeto Scanner para entrada de dados não é um atributo do carro

// é apenas um objeto auxiliar a entrada de dados

// Fabricante
System.out.println("Digite o Fabricante do carro :");
setFabricante( entrada.nextLine() );

// Modelo
System.out.println("Digite o Modelo do carro :");
setModelo( entrada.nextLine() );

// Cor
System.out.println("Digite a Cor do carro :");
setCor( entrada.nextLine() );

// Placa
System.out.println("Digite a Placa do carro :");
setPlaca( entrada.nextLine() );

// Valor
System.out.println("Digite o Valor do carro :");
setValor( Double.parseDouble( entrada.nextLine()) );

// Número de Portas
System.out.println("Digite o Número de Portas do carro :");
setNumeroPortas( Integer.parseInt( entrada.nextLine()) );

// Ano de Fabricação
System.out.println("Digite o Ano de fabricação do carro :");
setAnoFabricacao( Integer.parseInt( entrada.nextLine()) );

// Ano do Modelo
System.out.println("Digite o Ano do Modelo do carro :");
setAnoModelo( Integer.parseInt( entrada.nextLine()) );

   }
}