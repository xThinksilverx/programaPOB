public class NotificacoesEmail extends Notificacoes {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}
