import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private static int contadorId = 0;
    private int id;
    private Organizador organizador;
    private Local local;
    private Date dataHora;
    private String descricao;
    private ArrayList<Participante> participantes;

    public Evento(Organizador organizador, Local local, Date dataHora, String descricao) {
        this.id = ++contadorId;
        this.organizador = organizador;
        this.local = local;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.participantes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public Local getLocal() {
        return local;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }
}
