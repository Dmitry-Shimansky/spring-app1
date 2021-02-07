package ru.dmitry.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private MusicStyle style;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("electronicMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicStyle style) {
        if (style == MusicStyle.CLASSICAL) {
            return "Playing: " + music1.getSong().indexOf(1);
        } else if (style == MusicStyle.ELECTONIC) {
            return "Playing: " + music2.getSong().indexOf(1);
        }
    }
}
