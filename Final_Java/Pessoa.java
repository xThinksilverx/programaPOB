public abstract class Pessoa {
    private static int contadorId = 0;
    private int id;
    private String nome;

    public Pessoa(String nome) {
        this.id = ++contadorId;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
