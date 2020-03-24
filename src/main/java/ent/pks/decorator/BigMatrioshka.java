package ent.pks.decorator;

public class BigMatrioshka extends MatrioshkaDecorator {

    public BigMatrioshka(IMatrioshka iMatrioshka) {
        super(iMatrioshka);
    }

    private String big() {
        return "Большая ";
    }

    @Override
    public String decorate() {
        return big() + super.decorate();
    }
}
