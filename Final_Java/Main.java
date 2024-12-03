import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Evento> eventos = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Evento");
            System.out.println("2. Motrar Eventos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma das opções acima: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Tipo do evento: ");
                String descricao = scanner.nextLine();

                System.out.print("Organizador: ");
                String nomeOrganizador = scanner.nextLine();

                System.out.print("Email: ");
                String emailOrganizador = scanner.nextLine();

                Organizador organizador = new Organizador(nomeOrganizador, emailOrganizador);

                System.out.print("Local: ");
                String descricaoLocal = scanner.nextLine();

                System.out.print("Vagas: ");
                int vagas = scanner.nextInt();
                scanner.nextLine();

                Local local = new Local(descricaoLocal, vagas);

                Date dataHora = new Date();

                Evento evento = new Evento(organizador, local, dataHora, descricao);

                System.out.print("Quantidade participantes: ");
                int numParticipantes = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < numParticipantes; i++) {
                    System.out.print("Nome: ");
                    String nomeParticipante = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Participante participante = new Participante(nomeParticipante, telefone);
                    evento.addParticipante(participante);

                    NotificacoesTelefone notificacaoTelefone = new NotificacoesTelefone();
                    notificacaoTelefone.enviar("Olá " + nomeParticipante + ", você está inscrito no evento: " + descricao);
                }

                NotificacoesEmail notificacaoEmail = new NotificacoesEmail();
                notificacaoEmail.enviar("Olá " + nomeOrganizador + ", você organizara o evento: " + descricao);

                eventos.add(evento);
                System.out.println("Evento cadastrado com sucesso!");

            } else if (opcao == 2) {
                for (Evento evento : eventos) {
                    System.out.println("\nEvento ID: " + evento.getId());
                    System.out.println("Descrição: " + evento.getDescricao());
                    System.out.println("Organizador: " + evento.getOrganizador().getNome());
                    System.out.println("Participantes:");
                    for (Participante p : evento.getParticipantes()) {
                        System.out.println("- " + p.getNome() + " (Telefone: " + p.getTelefone() + ")");
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Cabo");
                break;
            } else {
                System.out.println("Escolhe novamente!");
            }
        }

        scanner.close();
    }
}
