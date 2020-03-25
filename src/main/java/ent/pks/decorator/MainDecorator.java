package ent.pks.decorator;

import ent.pks.decorator.decorators.*;

public class MainDecorator {
    public static void main(String[] args) {
        IMatrioshka matrioshka = new SimpleMatrioshka();
        System.out.println(matrioshka.decorate());
        IMatrioshka redMatrioshka = new RedMatrioshka(new SimpleMatrioshka());
        System.out.println(redMatrioshka.decorate());
        IMatrioshka purpleMatrioshka = new PurpleMatrioshka(new SimpleMatrioshka());
        System.out.println(purpleMatrioshka.decorate());
        IMatrioshka blueMatrioshka = new BlueMatrioshka(new SimpleMatrioshka());
        System.out.println(blueMatrioshka.decorate());
        IMatrioshka bigMatrioshka = new BigMatrioshka(new SimpleMatrioshka());
        System.out.println(bigMatrioshka.decorate());
        IMatrioshka bigRedMatrioshka = new BigMatrioshka(new RedMatrioshka(new SimpleMatrioshka()));
        System.out.println(bigRedMatrioshka.decorate());
        IMatrioshka bigPurpleMatrioshka = new BigMatrioshka(new PurpleMatrioshka(new SimpleMatrioshka()));
        System.out.println(bigPurpleMatrioshka.decorate());

    }
}
