/**
 * constructor, initialize the object with color and make
 *
 * @param String color:
 *       color of the car
 * @param String make
 *       make of the car
 */
public class Car{
private String color;
private String make;
private boolean isSold = false; //with default value set to false

/**
 * constructor, initialize the object with color and make
 *
 * @param String color:
 *       color of the car
 * @param String make
 *       make of the car
 */
Car(String color, String make){
this.color = color;
this.make = make;
}

 /**
  * @return String:
  *       return color of the car
  */
public String getColor(){
return color;
}

 /**
  * @return String:
  *       return make of the car
  */
public String getMake(){
return make;
}

 /**
  * @return boolean:
  *       return true if the car is sold, false otherwise
  */
public boolean isSold(){
if( isSold == true){
     return true;
   }
 return false;
}

 /**
  * selling the car, set the car as sold.
  */
public void sell(){
isSold = true;
}
   
}   