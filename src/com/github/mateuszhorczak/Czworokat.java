package com.github.mateuszhorczak;

public class Czworokat {
    private Linia l1, l2, l3, l4;

    public Czworokat() {
        l1 = new Linia();
        l2 = new Linia();
        l3 = new Linia();
        l4 = new Linia();
    }

    public Czworokat(Linia l1, Linia l2, Linia l3, Linia l4) {
        if (!(l1.compare(l2) && l1.compare(l3) && l1.compare(l4) && l2.compare(l3) && l2.compare(l4) && l3.compare(l4) )) {
            throw new ExceptionInInitializerError("Linie nie tworza czworokata!");
        }
        this.l1 = new Linia(l1);
        this.l2 = new Linia(l2);
        this.l3 = new Linia(l3);
        this.l4 = new Linia(l4);
    }

    public Czworokat(Czworokat czwo) {
        l1 = czwo.l1;
        l2 = czwo.l2;
        l3 = czwo.l3;
        l4 = czwo.l4;
    }

    public void przesun(int dx, int dy) {
        l1.przesun(dx, dy);
        l2.przesun(dx, dy);
        l3.przesun(dx, dy);
        l4.przesun(dx, dy);
    }

    @Override
    public String toString() {
        return "Czworokat{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", l4=" + l4 +
                '}';
    }
}
