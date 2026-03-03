public class Tester{
   public static void main(String[] args){
   Animal Gorilla = new Animal("Gorilla");
   Cage cage1 = new Cage();
   System.out.println(cage1);
   cage1.addAnimal(Gorilla);
   System.out.println(cage1.getNumAnimals());
   System.out.println(cage1.getAnimalAtIndex(0));
   
   }
}