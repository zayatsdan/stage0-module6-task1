package com.epam.mjc.stage0;

public class Animal {
  private String color;
  private int numberOfPaws;
  private boolean hasFur;

  // Constructor with full parameters
  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  // Method to get the description of the animal
  public String getDescription() {
    String furDescription = hasFur ? "a" : "no";
    String pawDescription = numberOfPaws == 1 ? "paw" : "paws";

    return String.format("This animal is mostly %s. It has %d %s and %s fur.",
            color, numberOfPaws, pawDescription, furDescription);
  }

  // Getter methods (optional)
  public String getColor() {
    return color;
  }

  public int getNumberOfPaws() {
    return numberOfPaws;
  }

  public boolean hasFur() {
    return hasFur;
  }

  public static void main(String[] args) {
    // Example usage
    Animal cat = new Animal("gray", 4, true);
    Animal snake = new Animal("green", 1, false);

    System.out.println(cat.getDescription());
    System.out.println(snake.getDescription());
    Bird bird=new Bird();
    System.out.println(bird.getDescription());
    Dog dog=new Dog();
    System.out.println(dog.getDescription());
  }
}
