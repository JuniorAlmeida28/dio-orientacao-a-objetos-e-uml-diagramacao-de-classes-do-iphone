package com.dio.main.internet.apps;

import com.dio.main.camera.Camera;

public class Instagram implements Camera {

    private String usuario;
    private String senha;

    public Instagram(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto via Instagram");
    }

    @Override
    public void gravarVideos() {
        System.out.println("Gravando vídeo via Instagram");
    }


}