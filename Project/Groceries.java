package Project;

public class Groceries {

	
	private int groceryId;
    private String groceryName;
    private float groceryPrice;


    // Parameterized constructor
    public Groceries(int groceryId, String groceryName, float groceryPrice) {
        this.groceryId=groceryId;
        this.groceryName=groceryName;
        this.groceryPrice=groceryPrice;

    }


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


	float getGroceryPrice() {
		return groceryPrice;
	}


	private void setGroceryPrice(float groceryPrice) {
		this.groceryPrice = groceryPrice;
	}
    
}



	