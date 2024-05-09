package com.dio.main;

import com.dio.main.internet.Email;
import com.dio.main.internet.Navegador;
import com.dio.main.internet.apps.Chrome;
import com.dio.main.internet.apps.Instagram;
import com.dio.main.internet.apps.Safari;
import com.dio.main.ipad.ReprodutorMusical;
import com.dio.main.ipad.apps.Itunes;
import com.dio.main.ipad.apps.Spotify;
import com.dio.main.telefone.Contato;
import com.dio.main.telefone.Telefone;

public class IphoneApplication {
    public static void main(String[] args) {
        Navegador navegador = null;
        String navegadorEscolhido = "Safari";

        if (navegadorEscolhido.equalsIgnoreCase("Safari")) {
            navegador = new Safari("https://www.google.com");
        } else if (navegadorEscolhido.equalsIgnoreCase("Chrome")) {
            navegador = new Chrome("https://www.google.com");
        } else {
            System.out.println("Navegador não encontrado.");
        }

        if (navegador != null) {
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
        }

        Email email = new Email("qualqueremail@email.com");
        email.enviarEmail();
        email.excluirEmail();

        ReprodutorMusical reprodutorMusical = null;
        String reprodutorMusicalEscolhido = "Spotify";

        if (reprodutorMusicalEscolhido.equalsIgnoreCase("Spotify")) {
            reprodutorMusical = new Spotify("Save Your Tears", "The Weeknd");
        } else if (reprodutorMusicalEscolhido.equalsIgnoreCase("iTunes")) {
            reprodutorMusical = new Itunes("My Girl", "Vintage Culture & Fancy");
        } else {
            System.out.println("Reprodutor musical não encontrado.");
        }

        if (reprodutorMusical != null) {
            reprodutorMusical.tocarMusica();
            reprodutorMusical.pausarMusica();
            reprodutorMusical.selecionarMusica();
        }

        Telefone telefone = new Telefone("11999999999");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Contato contato = new Contato("Maria", "Silva", telefone, email);
        contato.criarContato();

        Instagram instagram = new Instagram("Maria", "senha123");
        instagram.tirarFoto();
        instagram.gravarVideos();
    }
}