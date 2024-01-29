package Project;

public class Groceries {

	
	private int groceryId;
    private String groceryName;
    private double groceryPrice;


    // Parameterized constructor
    public Groceries(int groceryId, String groceryName, double groceryPrice) {
        this.groceryId=groceryId;
        this.groceryName=groceryName;
        this.groceryPrice=groceryPrice;

    }


    //Getters and setters for variables
    
	int getGroceryId() {
		return groceryId;
	}


	private void setGroceryId(int groceryId) {
		this.groceryId = groceryId;
	}


	String getGroceryName() {
		return groceryName;
	}


	private void setGroceryName(String groceryName) {
		this.groceryName = groceryName;
	}


	double getGroceryPrice() {
		return groceryPrice;
	}


	private void setGroceryPrice(float groceryPrice) {
		this.groceryPrice = groceryPrice;
	}
    
}



	