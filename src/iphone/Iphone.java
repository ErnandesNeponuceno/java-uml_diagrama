package iphone;

import iphone.navegador.NavegadorInternet;
import iphone.player.ReprodutorMusical;
import iphone.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet  {

    public void ligar(String numero) {
        System.out.println("Realizou uma ligação: " + numero);
    }

    public void atender(String numero) {
       System.out.println("Atendeu a ligação do número: " + numero);
    }

    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Deixou uma mensagem: " + mensagem + " para :" + destinatario);
    }

    public void exibirPagina(String url) {
        System.out.println("Acessando a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Abrir nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar a página");
    }

    public void tocar() {
        System.out.println("Tocar");
    }

    public void pausar() {
        System.out.println("Pausar");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
