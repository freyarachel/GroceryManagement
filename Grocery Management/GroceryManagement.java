package Project;

import java.util.ArrayList;
import java.util.Scanner;


public class GroceryManagement {

	Scanner sc=new Scanner(System.in);
	
	private String userNamereg;
	private String userPasswordreg;
	
	//User page is displayed where user can select any choice to create or exit froom application
	void userPage() {
	System.out.println("1. Register");
    System.out.println("2. Login");
    System.out.println("3. Exit");
    System.out.print("Enter your choice: ");
    int input = sc.nextInt();

    
    switch(input){
    
        case 1:
            register();
            break;
            
        case 2:
            login();
            break;
            
        case 3:
            System.out.println("You are exited");
            break;
            
        default:
            System.out.println("Invalid choice");
    }
    


}
	//User can create new account by registering
	private void register() {
		
		System.out.println("------------");
		System.out.println("Register");
		System.out.println("Enter your name: ");
		userNamereg=sc.next();
		
        System.out.println("Enter your password: ");
		userPasswordreg=sc.next();
		
		System.out.println("Succesfully created your account");
		
		login(); 
		
	}
	
	

	//User can login through the same details 
	private void login()  {
		
		System.out.println("------------");
		
		//Executes atleast once and then checks the code
		do{
		
	    System.out.println("Login");
        System.out.println("Enter your name: ");
		String userName=sc.next();
		
        System.out.println("Enter your password: ");
		String userPassword=sc.next();
		
		//Compares registered details content with login details
		
		//if password match then user will be logged in
		if(userName.toString().equals(userNamereg) && userPassword.toString().equals(userPasswordreg) ) {
				
	        System.out.println("Successfully Logged in!");
	        purchase();
	        break;

		}
		else{
			//If passwords doesn't match it asks to enter again
	        System.out.println("Username and password doesn't match");
	        

		}
	}
		while(true);
		
	
	
		
	}
	
	//User can purchase by selecting a choice
	void purchase() {
	System.out.println("Enter your choice: ");
    System.out.println("1. Purchase Groceries");
    System.out.println("2. Exit");

    int g = sc.nextInt();
    
    switch(g){
    
        case 1:
        	//executes
            groceries();
            break;
            
            
        case 2:
            System.out.println("You are exited");
            break;
            
        default:
            System.out.println("Invalid choice");
    }
    
	}
	
	
    
	void groceries() {
		
		System.out.println("------------");

		//Creating Grocery List as ArrayList
		ArrayList<Groceries> groceryList = new ArrayList<Groceries>();


	    // Adding Groceries objects to ArrayList
		System.out.println("  Vegetables  ");
		System.out.println("  Pulses  ");
		System.out.println("  Fruits  ");
		System.out.println("------------");

		//Vegetables
		groceryList.add(new Groceries(1, "Ladys Finger",24));
		groceryList.add(new Groceries(2, "Potato",30));
		groceryList.add(new Groceries(3, "Carrot",40));

		//Pulses
		groceryList.add(new Groceries(4, "Green gram",45));
		groceryList.add(new Groceries(5, "Horse gram",50));
		groceryList.add(new Groceries(6, "Chickpeas",65));

		//Fruits
		groceryList.add(new Groceries(7, "Apples",130));
		groceryList.add(new Groceries(8, "Oranges",60));
		groceryList.add(new Groceries(9, "Strawberries",120));


	    // Printing Vegetables details with id, name and price
	    for (Groceries grocery : groceryList) {
	        System.out.println("Grocery ID: "+grocery.getGroceryId());
	        System.out.println("Grocery Name: "+grocery.getGroceryName());
	        System.out.println("Grocery Price: "+grocery.getGroceryPrice());
			System.out.println("------------");


	    }
	    
	    //User inputs are stored in an array
	    
	    //No.of items is size of array
        System.out.println("Enter number of items you want to buy: ");
        int n= sc.nextInt();
        
        //Grocery Ids are stored as array
		System.out.println("Enter item number: ");
		int[] arrId = new int[n];
		
		for(int i=0;i<n;i++) {
			arrId[i]=sc.nextInt();
		}
		
	
		//Total sum of groceries are calculated
		double sum=0;
		for (Groceries grocery : groceryList) {
            for (int id:arrId) {
                if (grocery.getGroceryId()==id) {
                    sum = sum + grocery.getGroceryPrice();
                    break; // Breaks inner loop when a match is found
                }
                
            }
            
		}
		System.out.println("Total Amount of your bill:" + sum);
		System.out.println("------------");

		
		//Asks user to continue or exit from application
		System.out.println("Enter your choice: ");
	    System.out.println("1. Continue");
	    System.out.println("2. Exit");

	    int c = sc.nextInt();
	    
	    switch(c){
	    
	        case 1:
	        	userPage();
	            break;
	            
	            
	        case 2:
	            System.out.println("You are exited");
	            break;
	            
	        default:
	            System.out.println("Invalid choice");
	    }
 
	}
	    	   

        
    
	
	 public static void main(String[] args){

		 GroceryManagement obj=new GroceryManagement();
		 obj.userPage();
	 }
}