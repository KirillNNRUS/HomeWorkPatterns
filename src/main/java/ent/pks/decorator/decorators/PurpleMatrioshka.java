package ent.pks.decorator.decorators;

public class PurpleMatrioshka extends MatrioshkaDecorator {

    public PurpleMatrioshka(IMatrioshka iMatrioshka) {
        super(iMatrioshka);
    }

    private String purple() {
        return " фиолетового цета";
    }

    @Override
    public String decorate() {
        return super.decorate() + purple();
    }
}
