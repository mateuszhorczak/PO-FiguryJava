package com.github.mateuszhorczak;

import java.util.List;

public class Obraz {
    private List<Czworokat> czworokaty;
    private List<Trojkat> trojkaty;


    public void dodajTrojkat(Trojkat trojkat) {
        trojkaty.add(trojkat);
    }

    public void dodajCzworokat(Czworokat czworokat) {
        czworokaty.add(czworokat);
    }

    public Obraz przesun(int pionowo, int szerokosc) {
        return null;
    }
}
