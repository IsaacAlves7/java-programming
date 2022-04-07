public class AppLogin {

    public static void main(String[] args) {
    
    // TODO Auto-generated method stub
    
    Login lg1 = new Login( "carneiro5" , "123456" );
    System.out.println( "O seu nome é: " + lg1.getNome() );
    
    System.out.println( "O seu nivel de acesso é: " + lg1.getNivelAcesso() );
    Login lg2 = new Login( "kkk" , "000000" );
    
    System.out.println( "O seu nome é: " + lg2.getNome() );
    System.out.println( "O seu nivel de acesso é: " + lg2.getNivelAcesso() );
    
    }
    
}