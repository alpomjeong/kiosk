import java.util.*;

 class Menu {
    private String foodCategory;
    private List<MenuItem> menuItems;
    private static List<Menu> menus = new ArrayList<>();
    //생성자
    public Menu(String foodCategory){
        this.foodCategory = foodCategory;
        this.menuItems = new ArrayList<>();
        menus.add(this);
    }
    //메뉴아이템을 현재 카테고리에 추가하는 메서드
    public void addMenuItem(MenuItem item){
        menuItems.add(item);
    }
    //현재 카테고리의 모든 메뉴 리스트를 반환하는 메서드
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }
    //음식 카테고리들을 반환하는 메서드
    public String getFoodCategory(){
        return foodCategory;
    }
    //모든 메뉴 객체 리스트를 반환하는 정적 메서드
    public static List<Menu> getMenus(){
        return  menus;
    }
}
