package com.vitor;

import com.vitor.strategy.DeezerStrategy;
import com.vitor.strategy.PlayerStrategy;
import com.vitor.strategy.SpotifyStrategy;
import com.vitor.strategy.YoutubeStrategy;

import java.util.Map;

public class TocarMusica {

    private final Map<String, PlayerStrategy> map = Map.of(
            "spotify", new SpotifyStrategy(),
            "deezer", new DeezerStrategy(),
            "youtube", new YoutubeStrategy()
    );

    public void play(String player, String musica){
        map.get(player).tocarMusica(musica);
    }

}
