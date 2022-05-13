package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal shark = new Shark();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();


        Animal [] animals = {shark,turtle,eagle};
        for(Animal animal: animals){
            if (animal instanceof Shark){
                ((Shark) animal).attack();
                System.out.println(shark.getClass());
            }

            else if (animal instanceof Turtle){
                ((Turtle) animal).swim();
                System.out.println(turtle.getClass());
            }
            else if(animal instanceof Eagle){
                ((Eagle) animal).fly();
                System.out.println(eagle.getClass());
            }
             }
    }
}
