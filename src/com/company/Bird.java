package com.company;
public class Bird {
    private Wings wings;
    private String name;

    public Bird(String name) {
        this.name = name;
        this.wings = new Wings();
    }

    public void fly() {
        System.out.print("Bird " + name + " is flying");
        wings.use();
    }

    public void eat() {
        System.out.println("Bird " + name + " is eating");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (!wings.equals(bird.wings)) return false;
        return name.equals(bird.name);

    }

    @Override
    public int hashCode() {
        int result = wings.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Bird : '" + name + "'";
    }
}
