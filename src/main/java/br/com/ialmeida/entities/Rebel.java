package br.com.ialmeida.entities;

import br.com.ialmeida.enums.Race;

public class Rebel {
    private final String name;
    private final int age;
    private final Race race;

    public Rebel(String name, int age, Race race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Race getRace() {
        return race;
    }
}
