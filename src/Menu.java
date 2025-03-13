import java.util.*;

 class Menu {
    private String foodCategory;
    private List<MenuItem> menuItems;
    private static List<Menu> menus = new ArrayList<>();

    public Menu(String foodCategory){
        this.foodCategory = foodCategory;
        this.menuItems = new ArrayList<>();
        menus.add(this);
    }
    public void addMenuItem(MenuItem item){
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }
    public String getFoodCategory(){
        return foodCategory;
    }

    public static List<Menu> getMenus(){
        return  menus;
    }
}
