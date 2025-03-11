import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    MenuItem selectedItem = null;

    public Kiosk() {
        MenuItem Cheeseburger = new MenuItem("치즈버거", "치즈버거입니다.", 1500);
        MenuItem bulgogiburger = new MenuItem("불고기버거", "불고기버거입니다.", 2500);
        MenuItem tomatoburger = new MenuItem("토마토버거", "토마토버거입니다.", 2300);
    }

    public void start() {


        while (true) {
            if (selectedItem == null) {
                System.out.println("---- 햄버거 메뉴 ----");
                for (int i = 0; i < MenuItem.menuItems.size(); i++) {
                    MenuItem item = MenuItem.menuItems.get(i);
                    System.out.println((i + 1) + ". " + item.burgerName + " - " + item.price + "원 (" + item.burgerDescription + ")");
                }
                System.out.println("0 . 종료");
                System.out.println("--------------------");
                System.out.print("메뉴를 골라주세요: ");

                int choice = -1;
                try {
                   choice= scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    continue;
                }
                if (choice > 0 && choice <= MenuItem.menuItems.size()) {
                    selectedItem = MenuItem.menuItems.get(choice - 1);
                    System.out.println(selectedItem.burgerName + "를 선택하셨습니다.");
                    continue;
                } else if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            } else {
                System.out.println("현재 선택한 메뉴 : " + selectedItem.burgerName);
                System.out.println("1. 선택 확정");
                System.out.println("0. 뒤로 가기");
                System.out.println("입력: " );
                int action = -1;
                try{
                    action = scanner.nextInt();
                }catch(InputMismatchException e){
                    scanner.nextLine();
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    continue;
                }
                if (action == 1){
                    System.out.println(selectedItem.burgerName + "로 정하셨습니다.");
                    selectedItem = null;
                }else if(action == 0){
                    System.out.println(selectedItem.burgerName + "선택을 취소하셨습니다.");
                    selectedItem = null;
                }else {
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            }

        }
        scanner.close();

    }
    }
