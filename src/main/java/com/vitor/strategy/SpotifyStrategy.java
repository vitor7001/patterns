package com.vitor.strategy;

public class SpotifyStrategy implements PlayerStrategy{
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando " + musica + " no Spotify");
    }
}
