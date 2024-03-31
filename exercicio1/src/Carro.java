public class Carro {
    private String Marca;
    private String Modelo;
    private int Ano;
    private String Placa;
    private int VelocidadeAtual;

    

public Carro(String marca,String modelo, int ano, String placa) {
    this.Marca = marca;
    this.Modelo = modelo;
    this.Ano = ano;
    this.Placa = placa;
    this.VelocidadeAtual = 0;
}
public  void acelerar( int incremento){
    this.VelocidadeAtual += incremento;
    System.out.println("O carro acelerou. A nova velocidade "+ this.VelocidadeAtual + "Km/h");
}
public void frear( int decremento){
    if(this.VelocidadeAtual - decremento >= 0){
        this.VelocidadeAtual -= decremento;
        System.out.println("o Carro esta freiando, sua nova velocidade" + this.VelocidadeAtual + "km/h");
    } else {
        System.out.println(" O carro já esta parado. ");
    }
}
public void exibirInformacoes(){
    System.out.println("Marca "+ this.Marca);
    System.out.println("Modelo"+ this.Modelo);
    System.out.println("Ano "+ this.Ano);
    System.out.println("placa"+ this.Placa);
    System.out.println("velocidade Atual "+ this.VelocidadeAtual+ " Km/h");
}
}