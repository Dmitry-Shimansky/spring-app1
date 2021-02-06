package ru.dmitry.spring;

public class ElectronicMusic implements Music {
    private ElectronicMusic() {
    }

    public static ElectronicMusic getElectroMusic() {
        return new ElectronicMusic();
    }

    private void doMyInit() {
        System.out.println("Doing my initialization");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Axwell & Sebastien Ingrosso";
    }
}
