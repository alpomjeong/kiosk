import java.util.ArrayList;
import java.util.List;

public class MenuItem {

  private String foodName;
  private int price;
  private String foodDescription;
    //생성자
    public MenuItem(String Name, String Description, int price){
        this.foodDescription = Description;
        this.foodName = Name;
        this.price = price;
    }
    //음식 이름을 반환하는 메서드
    public String getFoodName(){
        return foodName;
    }
     // 음식 설명을 반환하는 메서드
    public String getFoodDescription(){
        return foodDescription;
    }
     // 음식 가격을 반환하는 메서드
    public int getPrice(){
        return price;
    }
}
