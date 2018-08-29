import java.util.*;
import java.util.ArrayList;

public class CarLot {
 private ArrayList<Car> cars;
  
    /**
     * constructor, initialize cars to be a new ArrayList of Car
     *
     */
    CarLot(){
        cars = new ArrayList<Car>();
        
    }
 
    /**
     * This method will search the whole car lot for unsold cars of a given make and return a boolean array
     * that describes the results. A false at index n should translate to a
     * mismatch (sold or wrong make) at cars.get(n), whereas a true at index n should translate to a
     * match (unsold and same make) at cars.get(n).
     * For instance, if there are three cars, all unsold, with makes Ford, Dodge, Ford
     * respectively, getCars("Ford") should return [true,false,true] and getCars("Dodge")
     * should return [false,true,false]
     *
     * @param String make
     *       car make
     * @return boolean[]
     *       an boolean array that describe with results explained above
     */
    public boolean[] getCars(String make){
        //TODO

     boolean[] bool = new boolean[cars.size()];
     
     for(int i = 0; i < cars.size(); i++ ){
      Car d = cars.get(i);
      //need to get make
      //need to see if it is sold
      if(d.isSold() == false ){
       if(d.getMake() == make){
        bool[i]= true;
        }
       else{
        bool[i]= false;
       }
      }
         //System.out.println(item);
     }
     return bool;
    }
 
    /**
     * add a new car to the array
     *
     * @param String color
     *       color of the new car
     * @param String make
     *       make of the new car
     */
    public void addCar(String color, String make){
        //TODO
     Car c = new Car(color, make);
     cars.add(c);
    }
 
    /**
     * call the sell() method on the car at index 'index'
     * no need to delete the car from the array
     *
     * @param int index
     *       index of the car being sold
     */
    public void sellCar(int index){
        //TODO
     
     Car sold = cars.get(index);
     sold.sell();
    }
 
    //This is the interactive output you can use to test your code
  public static void main(String args[]){
    int choice = 0;
    String color;
    String make;
    CarLot CSLot = new CarLot();
 
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("");
      System.out.println("Welcome to the CS180 car lot, what would you like to do?");
      System.out.println("1 - Buy a car from the lot");
      System.out.println("2 - Sell a car to the lot");
      System.out.println("3 - Search car lot");
      System.out.println("4 - Leave");
      System.out.print("Choice: ");
      choice = sc.nextInt();
      System.out.println("");
      switch(choice){
        case 1:
          System.out.print("Please enter car ID: ");
          choice = sc.nextInt();
          System.out.println("");
          if(choice < CSLot.cars.size()){
            if(CSLot.cars.get(choice).isSold()){
              System.out.println("Car has already been sold, sorry!");
            }else{
              System.out.println("You have purchased a new car!");
              CSLot.sellCar(choice);
            }
          }else{
            System.out.println("Car does not exist!");
          }
          break;
        case 2:
          System.out.print("Please enter the car color: ");
          color = sc.next();
          System.out.println("");
          System.out.print("Please enter the car make: ");
          make = sc.next();
          System.out.println("");
 
          CSLot.addCar(color,make);
          System.out.printf("You have sold a %s car with %s make!", color, make);
          System.out.println("");
          break;
        case 3:
          System.out.print("Please enter car make you are searching for: ");
          make = sc.next();
          System.out.println("");
 
          boolean[] results = CSLot.getCars(make);
          int count = 0;
          for(int i = 0; i < results.length; i++){
            if(results[i]){
              count++;
              System.out.println("-->Car ID " + i + " matches search for car of make " + make);
            }
          }
          if(count == 0){
            System.out.println("No cars found");
          }
          break;
        case 4:
          System.out.println("Thank you, come again!");
          return;
        default:
          System.out.println("Unrecognized Command, please try again");
          break;
      }
    }
  }
}