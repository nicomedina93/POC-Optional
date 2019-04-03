package com.company;



public class Location {

    private int id;
    private String name;
    private City city;

    public Location() {

    }

    public Location(int id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public Location setId(int id) {
        this.id = id;
        return this;

    }

    public String getName() {
        return name;
    }

    public Location setName(String name) {
        this.name = name;
        return this;

    }

    public City getCity() {
        return city;
    }

    public Location setCity(City city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
