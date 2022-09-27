public class Pilha {

	public Object[] vetor;
	public int ponteiro;

	public Pilha() {
		this.ponteiro = -1;
		this.vetor = new Object[10];
	}

	public boolean vazia() {
		if (this.ponteiro == -1) {
			return true;
		}
		return false;

	}
	
	public int tamanhoPilha(){
		if(this.vazia()){
			return 0;
		}
		return this.ponteiro+1;
	}
	
	public Object ultimoElemento(){
		if(this.vazia()){
			return null;
		}
		return this.vetor[this.ponteiro];
	}
	
	public Object desempilhar(){
		if(this.vazia()){
			return null;
		}
		
		return this.vetor[this.ponteiro--];
	}
	
	public void empilhar(Object valor){
		if(this.ponteiro < this.vetor.length-1){
			
			this.vetor[++ponteiro]=valor;
		}
	}
	
	public void exibirPilha(){
		for(int i=0;i<this.tamanhoPilha();i++)
			System.out.println(this.vetor[i]);
	}
	
	public void desempilharTudo(){
		while (this.vazia()==false){
			System.out.println(this.desempilhar());
		}
	}
	
	public static void main(String[] args){
		
		Pilha pilha = new Pilha();
		
		pilha.empilhar("Lucas0");
		pilha.empilhar("Lucas1");
		pilha.empilhar("Lucas2");
		pilha.empilhar("Lucas3");
		pilha.empilhar("Lucas4");
		pilha.empilhar("Lucas5");
		pilha.empilhar("Lucas6");
		pilha.empilhar("Lucas7");
		pilha.empilhar("Lucas8");
		
		System.out.println(pilha.ultimoElemento());
		System.out.println(pilha.tamanhoPilha());
		pilha.exibirPilha();
		
		System.out.println(" ");
		System.out.println(" ");
		pilha.empilhar("ultimo empilhado");

		pilha.exibirPilha();
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println(pilha.desempilhar());
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(pilha.tamanhoPilha());
		
		pilha.exibirPilha();
		
		System.out.println(" ");
		System.out.println(" ");
		
		pilha.desempilharTudo();
	}
	
}
