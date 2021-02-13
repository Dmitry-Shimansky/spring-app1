package ru.dmitry.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ElectronicMusic implements Music {
    @Override
    public String getSong() {
        return "Axwell & Sebastien Ingrosso";
    }
}
