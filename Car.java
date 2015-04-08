public class Car {

	// Attributes
	private String colorOfCar;
	private double horsepower;
	private double sizeOfEngine;
	private String makeOfCar;
	private static int count;
	
// Constructors
public Car (){
	this.colorOfCar = "yellow";
	this.horsepower = 148;
	this.sizeOfEngine = 2.0;
	this.makeOfCar = "Chevrolet";
	this.count ++;
}
	
public Car( String colorOfCar, double horsepower, double sizeOfEngine, String makeOfCar){
	this.colorOfCar = colorOfCar;
	this.horsepower = horsepower;
	this.sizeOfEngine = sizeOfEngine;
	this.makeOfCar = makeOfCar;
	this.count ++;
}

 public String getColorOfCar(){
	 return this.colorOfCar;
 }
	
 public void setColorOfCar(String colorOfCar){
	 this.colorOfCar = colorOfCar;
 }
	
 public double getHorsepower(){
	 return this.horsepower;
 }
 
 public void setHorsepower(double horsepower){
	 this.horsepower = horsepower;
 }
 
 public double getSizeOfEngine(){
	 return this.sizeOfEngine;
 }
 
 public void setSizeOfEngine(double sizeOfEngine ){
	 this.sizeOfEngine = sizeOfEngine;
 }
 
 public String getMakeOfCar(){
	 return this.makeOfCar;
 }
 
 public void setMakeOfCar( String makeOfCar){
	 this.makeOfCar = makeOfCar;
 }
 
 public static int getCount() {
	return count;
}
// equal method to compare all all car's instance variables
 public boolean equals(Car anotherObject){
	return (this.colorOfCar == anotherObject.colorOfCar) && ( this.horsepower == anotherObject.horsepower) 
			&& ( this.sizeOfEngine == anotherObject.sizeOfEngine) && ( this.makeOfCar == anotherObject.makeOfCar);
 }
 
// All setters and getters combined in the same method
 public String toString(){
	 return " There is a " + this.colorOfCar + " " +  this.makeOfCar+ " that has " + this.horsepower + " HP and a " + this.sizeOfEngine+"-litre engine. "; 
 }
 
}

