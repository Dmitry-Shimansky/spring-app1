package ru.dmitry.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ElectronicMusic implements Music {
    List<String> listElectronicMusic = new ArrayList<>();

    @Override
    public List <String> getSong() {
        listElectronicMusic.add("Axwell & Sebastien Ingrosso");
        listElectronicMusic.add("Alex Guadino");
        listElectronicMusic.add("Armin Van Buren");
        return listElectronicMusic;
    }
}
