import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    static List<MenuItem> menuItems = new ArrayList<>();

    String burgerName;
    int price;
    String burgerDescription;

    public MenuItem(String burgerName, String burgerDescription, int price){
        this.burgerDescription = burgerDescription;
        this.burgerName = burgerName;
        this.price = price;
    }
}
