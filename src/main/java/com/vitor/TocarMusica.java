package com.vitor;

public class TocarMusica {

    public void play(String player, String musica){

        if(player.equalsIgnoreCase("spotify")){
            System.out.println("Tocando " + musica + " no Spotify");
        }

    }

}
