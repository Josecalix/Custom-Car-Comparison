    
    import javax.swing.JOptionPane;

    public class NewCarDriver {

		public static void main(String[] args) {
		
		
		String makeOfCar, colorOfCar;
		double sizeOfEngine, horsepower;
		
		Car customCar = new Car();

		JOptionPane.showMessageDialog(null,"Provide the characteristics of your dream car and I will build it for you."); 
		
		makeOfCar = JOptionPane.showInputDialog("Enter the make");
		colorOfCar = JOptionPane.showInputDialog("Enter the color");
		String enigneString = JOptionPane.showInputDialog("Enter the size of the engine");
		sizeOfEngine = Double.parseDouble(enigneString);
		String horsepowerString = JOptionPane.showInputDialog("Enter how many horsepowers you would like it to have");
		horsepower = Double.parseDouble(horsepowerString);
		
		
		customCar.setMakeOfCar(makeOfCar);
		customCar.setColorOfCar(colorOfCar);
		customCar.setSizeOfEngine(sizeOfEngine);
		customCar.setHorsepower(horsepower);
		JOptionPane.showMessageDialog(null,customCar);

	
		Car joseCar = new Car();
		
		joseCar.setMakeOfCar(" Toyota");
		joseCar.setColorOfCar("red");
		joseCar.setSizeOfEngine(1.8);
		joseCar.setHorsepower(132);
		JOptionPane.showMessageDialog(null,joseCar);
		
		Car dereckCar = new Car();
		
		dereckCar.setMakeOfCar(" Mazda");
		dereckCar.setColorOfCar("black");
		dereckCar.setSizeOfEngine(2.5);
		dereckCar.setHorsepower(167);
		JOptionPane.showMessageDialog(null,dereckCar);
		
		Car bertinCar = new Car();
		
		bertinCar.setMakeOfCar("Honda");
		bertinCar.setColorOfCar("gray");
		bertinCar.setSizeOfEngine(2.4);
		bertinCar.setHorsepower(185);
		JOptionPane.showMessageDialog(null,bertinCar);
		
		
		Car keatenCar = new Car();
		
		keatenCar.setMakeOfCar(makeOfCar);
		keatenCar.setColorOfCar(colorOfCar);
		keatenCar.setSizeOfEngine(sizeOfEngine);
		keatenCar.setHorsepower(horsepower);
		JOptionPane.showMessageDialog(null,keatenCar);
		
		JOptionPane.showMessageDialog(null," Are the user's custom made car and Keaten's car identical? " +"\n"+customCar.equals(keatenCar));
	
	}

  }
