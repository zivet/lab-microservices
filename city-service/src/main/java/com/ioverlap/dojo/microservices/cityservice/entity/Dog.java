package com.ioverlap.dojo.microservices.cityservice.entity;

public class Dog {

    private Long id;

    private String name;

    private String breed;

    private String origin;

    public Dog() {
    }

    public Dog(Long id, String name, String breed, String origin) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
