public class Login {
    // Attributes
    String nome;
    String nomeLogin;
    String senha;
    int nivelAcesso; // nível de acesso do usuário ao sistema

    // Constructor Methods
    public Login(String n1, String s){
        setNivelAcesso(verificaLogin(n1, s));
    }

    public int verificaLogin(String nolog, String sem){
        int na = 0;
        if( nolog.equals( "carneiro5" ) && sem.equals( "123456" ) ){
            na = 10;
            setNome( "André" );
        }
            
        else {
            na = 0;
        }
    
        return na;
    }

    // Getters and Setters

    // Nome - Getters and Setters

    public String getNome() {
        return nome; 
    }
        
    public void setNome( String no ) {
        if( !no.isEmpty() ){
            nome = no;
        }
    }
    
    // NomeLogin - Getters and Setters

    public String getNomeLogin() {
        return nomeLogin;    
    }
        
    public void setNomeLogin( String nl ) {
        if( !nl.isEmpty() ){
          nomeLogin = nl;
        }
    }
    
    // Senha - Getters and Setters

    public String getSenha() {        
        return senha;
    }
        
    public void setSenha( String sen ) {
        if( !sen.isEmpty() ){   
          senha = sen;
        }    
    }
        
    // NivelAcesso - Getters and Setters
    public int getNivelAcesso() {
        return nivelAcesso;    
    }
        
    public void setNivelAcesso( int na ) {    
        if( na >= 0 ){
          nivelAcesso = na;
        }    
    }
}
