package constructor_example2;

public class Test {
	public static void main(String[] args) {
	    Box mybox1 = new Box(10,20,15); //default constructor
	    Box mybox2 = new Box(); //no arg constructor
	    Box myCube = new Box(7); // paramterized constructor
	    double vol=mybox1.volume();
		System.out.println("Volume of myBox is "+ vol);
		vol=mybox2.volume();
	    System.out.println("Volume of myBox is "+vol);
	    vol=myCube.volume();
	    System.out.println("Volume of myBox is "+vol);
	    
	  }
}
