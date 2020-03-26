package ent.pks.prototype;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Creature extends ACreature {
    public Creature(String name) {
        super();
        super.name = name;

    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public ICreature copy() {
        Creature copy = new Creature(name);
        return copy;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                '}';
    }
}
