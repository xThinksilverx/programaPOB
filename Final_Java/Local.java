public class Local {
    private static int contadorId = 0;
    private int id;
    private String descricao;
    private int vagas;

    public Local(String descricao, int vagas) {
        this.id = ++contadorId;
        this.descricao = descricao;
        this.vagas = vagas;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
}
