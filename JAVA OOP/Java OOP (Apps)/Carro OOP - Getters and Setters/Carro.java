public class Carro{
    // Attributes
    String fabricante, modelo, cor, placa;
    double valor;
    int numeroPortas, anoFabricacao, anoModelo;

    // Setter Methods
    public void setFabricante (String fab){
        if(!fab.isEmpty()){
            fabricante = fab;
        }
    } 

    public void setModelo (String mod){
        if(!mod.isEmpty()){
            modelo = mod;
        }
    } 

    public void setCor (String c){
        if(!c.isEmpty()){
            cor = c;
        }
    } 

    public void setPlaca (String p){
        if(!p.isEmpty()){
            placa = p;
        }
    } 

    public void setValor (double val){
        if(val > 0){
            valor = val;
        }
    } 

    public void setNumeroPortas (int nportas){
        if(nportas > 0){
            numeroPortas = nportas;
        }
    } 

    public void setAnoFabricacao (int anofab){
        if(anofab > 0){
            anoFabricacao = anofab;
        }
    } 

    public void setAnoModelo (int anomod){
        if(anomod > 0){
            anoModelo = anomod;
        }
    } 

    // Getter Methods

    public String getFabricante(){
        return fabricante;
    }

    public String getModelo(){
        return modelo;
    }

    public String getCor(){
        return cor;
    }

    public String getPlaca(){
        return placa;
    }

    public double getValor(){
        return valor;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public int getNumeroPortas(){
        return numeroPortas;
    }

    public int getAnoModelo(){
        return anoModelo;
    }

    // Imprimir() Method

    public void imprimir(){
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Valor: " + getValor());
        System.out.println("Número de Portas: " + getNumeroPortas());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Ano do Modelo: " + getAnoModelo());
    }

}
