import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuItem Cheeseburger = new MenuItem("치즈버거","치즈버거입니다.",1500);
        MenuItem bulgogiburger = new MenuItem("불고기버거","불고기버거입니다.",2500);
        MenuItem tomatoburger = new MenuItem("토마토버거","토마토버거입니다.",2300);

        while(true){
            System.out.println("---- 햄버거 메뉴 ----");
            for (int i = 0; i < MenuItem.menuItems.size(); i++) {
                MenuItem item = MenuItem.menuItems.get(i);
                System.out.println((i + 1) + ". " + item.burgerName + " - " + item.price + "원 (" + item.burgerDescription + ")");
            }
            System.out.println((MenuItem.menuItems.size() + 1) + ". 종료");
            System.out.println("--------------------");
            System.out.print("메뉴를 골라주세요: ");
            int choice = scanner.nextInt();

            if (choice > 0 && choice <= MenuItem.menuItems.size()) {
                MenuItem selectedItem = MenuItem.menuItems.get(choice - 1);
                System.out.println(selectedItem.burgerName + "를 선택하셨습니다.");
            } else if (choice == MenuItem.menuItems.size() + 1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            scanner.close();
        }
    }
}