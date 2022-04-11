package com.github.mateuszhorczak;

public class Linia {
    private Punkt p1, p2;

    public Linia() {
        p1 = new Punkt();
        p2 = new Punkt();
    }

    public Linia(Punkt p1, Punkt p2) {
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) { // Wyjatek gdy punkty sa rowne
           throw new ExceptionInInitializerError("Punkty sa identyczne!");
        }
        this.p1 = new Punkt(p1);
        this.p2 = new Punkt(p2);
    }

    public Linia(Linia lin) {
        p1 = lin.p1;
        p2 = lin.p2;
    }

    public void przesun(int dx, int dy) {
        p1.przesun(dx, dy);
        p2.przesun(dx, dy);
    }

    @Override
    public String toString() {
        return "Linia{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public boolean compare(Linia lin) {
        return
                ( this.getP1().getX() == lin.getP1().getX() && this.getP1().getY() == lin.getP1().getY() ) ||
                ( this.getP1().getX() == lin.getP2().getX() && this.getP1().getY() == lin.getP2().getY() ) ||
                ( this.getP2().getX() == lin.getP2().getX() && this.getP2().getY() == lin.getP2().getY() ) ||
                ( this.getP2().getX() == lin.getP1().getX() && this.getP2().getY() == lin.getP1().getY() );
    }

    public Punkt getP1() {
        return p1;
    }

    public Punkt getP2() {
        return p2;
    }
}