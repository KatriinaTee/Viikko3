package main;
public class Animal {
    private String specie;
    private String name;
    private int age;

    public Animal(String specie, String name, int age) {
        this.specie = specie;
        this.name = name;
        this.age = age;
    }

    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
    this.specie = specie;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
    this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
    this.age = age;    
    }

    public void printSpecs() {
        System.out.println(specie + ": " + name + ", " + age + " vuotta");
    }

    public void run() {
        System.out.println(name + " juoksee kovaa vauhtia!");
        
    }
}
