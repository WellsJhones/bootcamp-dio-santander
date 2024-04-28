package edu.wells.metodos;

public class Metodos {
    Boolean tvLigada = null;
    Boolean tvDesligada = null;
    int volume = 10;

    public void ligarTv() {
        tvLigada = true;
        System.out.println("TV ligada");
    }

    public void desligarTv() {
        tvDesligada = true;
        System.out.println("TV desligada");
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume máximo");
        }
    }

}
