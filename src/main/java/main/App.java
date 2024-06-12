package main;

import java.util.Scanner;

/**
    Tehdään kerran alussa:
        1. git init
        2. git remote add .... (kopioi GitHub repositoryn sivulta)
        3. git branch -M main

    Tehdään aina kun halutaan tallentaa lokaalit muutokset GitHubiin:
        1.  git add .
        2.  git commit -m "VIESTI_TÄHÄN"
        3.  git push origin main   
   */

public class App 
{
    public static void main( String[] args )
    {
        /* System.out.println( "Hello World!" ); /** */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Anna eläintarhalle nimi:");
        String stringInput = sc.nextLine();
        Zoo zoo = new Zoo(stringInput);

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String specie = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        int age = Integer.parseInt(sc.nextLine());

                        Animal newAnimal = new Animal(specie, name, age);
                        zoo.addAnimal(newAnimal);
                        break;
                    case 2:
                        zoo.printAnimals();
                        break;

                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int laps = Integer.parseInt(sc.nextLine());
                        zoo.runAnimals(laps);
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        sc.close();
    }
}