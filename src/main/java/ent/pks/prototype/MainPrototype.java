package ent.pks.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        ICreature iCreature = new Creature("bobr-hobr");
        System.out.println(iCreature);
        ICreature clone = iCreature.copy();
        System.out.println(clone);
        System.out.println(iCreature.equals(clone));
    }
}
