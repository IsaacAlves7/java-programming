public class Fila {

	public Object[] vetor;
	public int inicio;
	public int fim;
	public int maximo;
	public int tamanho;

	public Fila() {
		
		this.tamanho = 0;
		this.maximo = 10;
		this.inicio = 0;
		this.fim = -1;
		this.vetor = new Object[10];
	}

	public boolean vazia() {
		if (this.tamanho == 0) {
			return true;
		}
		return false;

	}
	
	public int tamanhoFila(){
		if(this.vazia()){
			return 0;
		}
		return this.tamanho;
	}
	
	public Object primeiroElemento(){
		if(this.vazia()){
			return null;
		}
		return this.vetor[this.inicio];
	}
	
	public Object remover(){
		if(this.vazia()){
			return null;
		}
		this.tamanho--;
		return this.vetor[this.inicio++];
	}
	
	public void inserir(Object valor){
		if(this.tamanho < this.maximo){
			
			this.tamanho++;
			this.vetor[++fim]=valor;
		}
		
	}
	
	public void exibirFila(){
		for(int i=this.inicio;i<=this.tamanhoFila();i++)
			System.out.println(this.vetor[i]);
	}
	
	public static void main(String[] args){
		
		Fila fila = new Fila();
		
		fila.inserir("Lucas0");
		fila.inserir("Lucas1");
		fila.inserir("Lucas2");
		fila.inserir("Lucas3");
		fila.inserir("Lucas5");
		fila.inserir("Lucas6");
		fila.inserir("Lucas7");
		fila.inserir("Lucas8");
		fila.inserir("Lucas9");
		
//		System.out.println(fila.primeiroElemento());
//		System.out.println(fila.tamanhoFila());
		
//		while (fila.vazia()==false){
//			System.out.println(fila.remover());
//		}
		
		System.out.println(fila.tamanhoFila());
		System.out.println(fila.remover());
		System.out.println(fila.tamanhoFila());
		fila.inserir("Lucas10");
		System.out.println(fila.tamanhoFila());
		fila.exibirFila();
//		
//		System.out.println(fila.tamanhoFila());
	}
	
}
