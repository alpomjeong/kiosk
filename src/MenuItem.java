import java.util.ArrayList;
import java.util.List;

public class MenuItem {

  private String foodName;
  private int price;
  private String foodDescription;

    public MenuItem(String Name, String Description, int price){
        this.foodDescription = Description;
        this.foodName = Name;
        this.price = price;
    }
    public String getFoodName(){
        return foodName;
    }

    public String getFoodDescription(){
        return foodDescription;
    }

    public int getPrice(){
        return price;
    }
}
