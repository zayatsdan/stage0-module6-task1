package com.epam.mjc.stage0;

public class Bird extends Animal {
   
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        // Call the parent class method
        String baseDescription = super.getDescription();

        // Add additional information for Bird
        return baseDescription + " Moreover, it has 2 wings and can fly.";
    }

   
}
