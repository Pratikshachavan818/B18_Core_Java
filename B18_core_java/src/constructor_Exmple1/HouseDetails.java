package constructor_Exmple1;

public class HouseDetails {
	String housename; // data variable
    int doornum;   // data variable
    String street;  // data variable

    public void house() { //method
        System.out.println(housename);
        System.out.println("My House");
    }

    public void detail(){ //method
        System.out.println(doornum);
        System.out.println("This is doornum");
    }

    public void detail1(){ //method
        System.out.println(street);
        System.out.println("This is street");
    }
}
