package com.example.demospringboot7PM.model;

public class City {
    String name;
    long population;
    int size;

    public City(String name, long population, int size) {
        this.name = name;
        this.population = population;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
