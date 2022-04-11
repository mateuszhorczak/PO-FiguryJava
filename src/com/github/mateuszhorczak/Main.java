package com.github.mateuszhorczak;

public class Main {

    public static void main(String[] args) {
        Punkt p1=new Punkt(0,0), p2=new Punkt(1,1);
        Linia l1=new Linia(p1, p2), l2=new Linia(p1, p2);
        l1.przesun(5,5);
        System.out.println(l1);
        System.out.println(l2);

        Obraz obraz = new Obraz();
        Trojkat trojkat = new Trojkat(
                new Linia(
                        new Punkt(1, 1),
                        new Punkt(2, 2)
                ),
                new Linia(
                        new Punkt(2, 2),
                        new Punkt(3, 3)
                ),
                new Linia(
                        new Punkt(3, 3),
                        new Punkt(1, 1)
                )
        );

        Czworokat czworokat = new Czworokat(
                new Linia(
                        new Punkt(1, 1),
                        new Punkt(2, 2)
                ),
                new Linia(
                        new Punkt(2, 2),
                        new Punkt(3, 3)
                ),
                new Linia(
                        new Punkt(3, 3),
                        new Punkt(4, 4)
                ),
                new Linia(
                        new Punkt(4, 4),
                        new Punkt(1, 1)
                )
        );
    }
}
