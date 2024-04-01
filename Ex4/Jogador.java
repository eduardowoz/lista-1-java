public class Jogador {

    private String Nome;
    private int pontuacao;
    private int Nivel;
    
    
    public Jogador(String nome, int pontuacaoInicial, int Nivel) {
        this.Nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.Nivel = Nivel;

}

public void aumentarPontuacao(int pontos){
    if(pontos > 0){
        this.pontuacao += pontos;
        System.out.println("Pontuação de "+ this.Nome + "aumentada em "+ pontos + "pontos");
    } else{
        System.out.println("A pontução deve ser um valor positivo.");
    }
    }

    public void subirNivel(){
        this.Nivel++;
        System.out.println(this.Nome + "subiu de Nivel "+ this.Nivel + "!");
    }

    public void exibirInformacoes(){
        System.out.println("Nome do Jogador "+ this.Nome);
        System.out.println("Pontuação"+ this.pontuacao);
        System.out.println("Nivel "+ this.Nivel);
    }

    public String getNome(){
        return this.Nome;
    }
    public int getPontuacao(){
        return this.pontuacao;
    }
    public int getNivel(){
        return this.Nivel;
    }
    
}