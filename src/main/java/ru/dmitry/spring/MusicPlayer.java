package ru.dmitry.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("electronicMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicStyle style) {
        switch(style){
            case CLASSICAL:
                return "Playing: " + music1.getSong().get(new Random().nextInt(3));
            default:
                return "Playing: " + music2.getSong().get(new Random().nextInt(3));
        }
    }
}
