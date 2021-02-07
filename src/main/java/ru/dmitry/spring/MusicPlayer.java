package ru.dmitry.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private ElectronicMusic electronicMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, ElectronicMusic electronicMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.electronicMusic = electronicMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }
}
