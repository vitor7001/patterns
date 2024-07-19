package com.vitor.strategy;

public class DeezerStrategy implements PlayerStrategy {
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando " + musica + " no Deezer");
    }
}
