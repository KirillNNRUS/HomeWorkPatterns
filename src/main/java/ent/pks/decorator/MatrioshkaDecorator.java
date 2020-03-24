package ent.pks.decorator;

public abstract class MatrioshkaDecorator implements IMatrioshka {

    IMatrioshka iMatrioshka;

    public MatrioshkaDecorator(IMatrioshka iMatrioshka) {
        this.iMatrioshka = iMatrioshka;
    }

    public String decorate() {
        return iMatrioshka.decorate();
    }
}
