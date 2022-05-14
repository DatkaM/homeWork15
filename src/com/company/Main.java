package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animal = {new Shark(), new Turtle(), new Eagle()};

        Shark [] sharks = new Shark[3];
        Turtle [] turtles = new Turtle[3];
        Eagle [] eagles = new Eagle[3];



        for(Animal animals: animal){
            if (animals instanceof Shark){
                ((Shark) animals).attack();
                System.out.println(animals.getClass());
                sharks[0] = (Shark) animals;
            }
            else if (animals instanceof Turtle){
                ((Turtle) animals).swim();
                System.out.println(animals.getClass());
                turtles[0]=(Turtle) animals;
            }
            else if(animals instanceof Eagle){
                ((Eagle) animals).fly();
                System.out.println(animals.getClass());
                eagles[0]=(Eagle) animals;
            }

    }
    }
}



