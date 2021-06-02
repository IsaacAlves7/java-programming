public class Login {
    // Attributes
    String nome;
    String nomeLogin;
    String senha;
    int nivelAcesso; // nível de acesso do usuário ao sistema

    // Constructor Methods
    public Login(String nl, String s) {
      setNivelAcesso(verificaLogin(nl, s));
    }
    
    public Login(String nl, String s, int token) {
      setNivelAcesso(verificaLogin(nl, s, token));
    }
    
    public int verificaLogin(String nolog, String sem) {
    
    int na = 0;
    
    if (nolog.equals("carneiro5") && sen.equals("123456")) {
    
    na = 10;
    
    setNome("André");
    
    }
    
    else {
    
    na = 0;
    
    }
    
    return na;
    
    }
    
    public int verificaLogin(String nolog, String sen, int tk) {
    
    int na = 0;
    
    if (nolog.equals("pereira") && sen.equals("246810") &&
    
    verificarToken(tk)) {
    
    na = 8;
    
    setNome("Maria");
    
    }
    
    else {
    
    na = 0;
    
    }
    
    return na;
    
    }
    
    public boolean verificarToken(int tk) {
    
    if (tk == 1000 || tk == 2000 || tk == 3000) {
    
    return true;
    
    }
    
    else {
    
    return false;
    
    }
    
    }
    
    // Getters and Setters
    
    public String getNome() {
    
    return nome;
    
    }
    
    public void setNome(String no) {
    
    if (!no.isEmpty()) {
    
    nome = no;
    
    }
    
    }
    
    public String getNomeLogin() {
    
    return nomeLogin;
    
    }
    
    public void setNomeLogin(String nl) {
    
    if (!nl.isEmpty()) {
    
    nomeLogin = nl;
    
    }
    
    }
    
    public String getSenha() {
    
    return senha;
    
    }
    
    public void setSenha(String sem) {
    
    if (!sen.isEmpty()) {
    
    senha = sen;
    
    }
    
    this.senha = senha;
    
    }
    
   public int getNivelAcesso() { 
     return nivelAcesso;
   }
    
   public void setNivelAcesso(int na) {
     if (na >= 0) {
       nivelAcesso = na;
     }
   }
}