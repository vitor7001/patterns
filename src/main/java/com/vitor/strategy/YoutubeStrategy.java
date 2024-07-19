package com.vitor.strategy;

public class YoutubeStrategy implements PlayerStrategy{

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando " + musica + " no YouTube");
    }
}
