package com.github.mateuszhorczak;

public class Trojkat {
    private Linia l1, l2, l3;

    public Trojkat() {
        l1 = new Linia();
        l2 = new Linia();
        l3 = new Linia();
    }

    public Trojkat(Linia l1, Linia l2, Linia l3) {
        if (!(l1.compare(l2) && l1.compare(l3) && l2.compare(l3))) {
            throw new ExceptionInInitializerError("Linie nie tworza trojkata!");
        }
        this.l1 = new Linia(l1);
        this.l2 = new Linia(l2);
        this.l3 = new Linia(l3);
    }

    public Trojkat(Trojkat trk) {
        l1 = trk.l1;
        l2 = trk.l2;
        l3 = trk.l3;
    }

    public void przesun(int dx, int dy) {
        l1.przesun(dx, dy);
        l2.przesun(dx, dy);
        l3.przesun(dx, dy);
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                '}';
    }
}
