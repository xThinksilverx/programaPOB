public class Organizador extends Pessoa {
    private String email;

    public Organizador(String nome, String email) {
        super(nome);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
