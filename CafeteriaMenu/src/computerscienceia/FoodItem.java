/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceia;

/**
 *
 * @author 42752
 */
public class FoodItem {
    private String Cuisine, Name, Description;
    double Price;
    int foodID;


    public FoodItem(int foodID, String Cuisine, String Name, String Description, double Price) {
        this.foodID = foodID;
        this.Cuisine = Cuisine;
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
        
    }

      public int getFoodID() {
        return foodID;
    }
    
    public String getCuisine() {
        return Cuisine;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }


    public double getPrice() {
        return Price;
    }


    
}
