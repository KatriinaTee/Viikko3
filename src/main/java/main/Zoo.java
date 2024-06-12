package main;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals;

    public Zoo(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }
        public Zoo() {
        //TODO Auto-generated constructor stub
    }
        public String getName() {
            return name;
        }
        public void setName(String name) {
        this.name = name;
        }
        public ArrayList<Animal> getAnimals() {
            return animals;
        }
        public void setAnimals(ArrayList<Animal> animals) {
            this.animals = animals;
        }

        public void addAnimal(Animal animal){
            animals.add(animal);
        }

        public void printAnimals(){
            System.out.println(name + " pitää sisällään seuraavat eläimet:");

            animals.forEach((animal) -> {
                animal.printSpecs();
            });
    
        }
        public void runAnimals(int laps) {
            animals.forEach((animal) -> {
                for (int i = 0; i < laps; i++) {
                    animal.run();
                }
            });


        }
    
    }

