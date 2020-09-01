package com.rinavenessa.Moives;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
       return "no plot here";
    }

    public String getName() {
        return name;
    }
}
   class Tallgirl extends Movie{
       public Tallgirl() {
           super ("Tallgirl");
       }
       @Override
       public String plot(){
           return "tall get made fun of by school mates";
       }
   }
   class Little extends Movie{
       public Little() {
           super("Little");
       }
       @Override
       public String plot() {
          return "grow woman sleeps and wakes up as a child again";
       }
   }
   class LordOfTheRing extends Movie{
       public LordOfTheRing() {
           super("Lord of the rings");
       }
       @Override
       public String plot() {
           return "a magical ring that makes people evil and has to be destroyed";
       }
   }
   class Annabel extends Movie{
       public Annabel(){
           super("Annabel");
       }
       @Override
       public String plot(){
           return "A demonic doll that possesses people and makes killers";
       }
   }
   class HouseOfNight extends Movie{
       public HouseOfNight(){
           super("House of night");
       }

//       public String plot() {
//           return plot();
//       }
   }

public class Main {
    public static void main(String[] args) {
        for(int i =1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("movie #"+ i +": "+ movie.getName()+"\n"+ "plot: "+movie.plot()+"\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5+1);
        System.out.println("random number generator is: "+ randomNumber);

        switch (randomNumber) {
            case 1:
                return new Tallgirl();

            case 2:
                return new Little();
            case 3:
                return new LordOfTheRing();
            case 4:
                return new Annabel();
            case 5:
                return new HouseOfNight();
        }
        return null;
    }
}
