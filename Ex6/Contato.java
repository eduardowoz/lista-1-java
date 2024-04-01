package Ex6;

class Contato {

    private String nome;
    private String Telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.Telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return Telefone;
    }
}