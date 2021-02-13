package ru.dmitry.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicList {
    List<Music> musicList = new ArrayList();

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private ElectronicMusic electronicMusic;

    public MusicList(ClassicalMusic classicalMusic, RockMusic rockMusic, ElectronicMusic electronicMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.electronicMusic = electronicMusic;
    }

    public List<Music> getMusicList() {
        musicList.add(classicalMusic);
        musicList.add(rockMusic);
        musicList.add(electronicMusic);
        return musicList;
    }
}
