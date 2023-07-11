
package fifa;

public class Clubes {
    
    
    String nome;
    String liga;
    int estrelas;
    String desc;
    int qtd_de_jog;
    int titulos;
    
    
    Uniforme uni1 = new Uniforme();
    Uniforme uni2 = new Uniforme();
    Uniforme uni3 = new Uniforme();
    Estadio estadio = new Estadio();
    
    
    //Jogadores
    Jogadores j1 = new Jogadores();
    Jogadores j2 = new Jogadores();
    Jogadores j3 = new Jogadores();
    Jogadores j4 = new Jogadores();
    Jogadores j5 = new Jogadores();
    Jogadores j6 = new Jogadores();
    Jogadores j7 = new Jogadores();
    Jogadores j8 = new Jogadores();
    Jogadores j9 = new Jogadores();
    Jogadores j10 = new Jogadores();
    Jogadores j11 = new Jogadores();
    
    class Uniforme{
        String cor1Uniforme;
        String cor2Uniforme;     
    }
    
    class Estadio{
        String nomeEstadio;
        int larguraEstadio;
        int comprimentoEstadio;
    
    }
}
