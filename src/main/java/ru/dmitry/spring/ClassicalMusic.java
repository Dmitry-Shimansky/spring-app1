package ru.dmitry.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class ClassicalMusic implements Music {
    List<String> listClassicalMusic = new ArrayList<>();

    @Override
    public List<String> getSong() {
        listClassicalMusic.add("Hungarian Rhapsody");
        listClassicalMusic.add("Alex Petrov Ahmatov");
        listClassicalMusic.add("Sting Petrovich Azerman");
        return listClassicalMusic;
    }
}
