package ent.pks.prototype;

import java.util.Random;

public class MainPrototype {

    public static final long MAX_CREATURES = 100;
    public static Random random = new Random();

    public static void main(String[] args) {

        //Create first Creature
        ICreature iCreature = new Creature(randomStringGenerate());
        //Create Planet
        Planet planet = new Planet();
        //Add first Creature to Planet
        planet.addCreature(iCreature);

        //Начинаем заселять планету копиями
        for (int i = 2; i <= MAX_CREATURES; i++) {
            //Создаем копию, меняем у копии имя, и заселяем на планету
            ICreature copy = iCreature.copy();
            copy.setName(randomStringGenerate());
            planet.addCreature(copy);
        }

        System.out.println(planet.getPopulation());
        System.out.println(planet.creatures.toString());
    }

    public static String randomStringGenerate() {
        //Создаем имена для Чудища Лесного (Планетного) :-)
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = (int) MAX_CREATURES;

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
