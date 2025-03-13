import java.util.*;

public class Kiosk {
  private final Scanner scanner = new Scanner(System.in);
  private Menu currentMenu = null;
  private MenuItem selectedItem = null;
  private final ShoppingCart shoppingCart = new ShoppingCart();

    public Kiosk() {
        Menu burgerMenu = new Menu("햄버거 메뉴");
        burgerMenu.addMenuItem(new MenuItem("치즈버거", "치즈버거입니다.", 1500));
        burgerMenu.addMenuItem(new MenuItem("불고기버거", "불고기버거입니다.", 2500));
        burgerMenu.addMenuItem(new MenuItem("새우버거", "새우버거입니다.", 2000));
        Menu drinkMenu = new Menu("음료수 메뉴");
        drinkMenu.addMenuItem(new MenuItem("콜라", "콬라입니다.", 1500));
        drinkMenu.addMenuItem(new MenuItem("사이다", "사이다입니다.", 1500));
        drinkMenu.addMenuItem(new MenuItem("환타", "환타입니다.", 1500));

    }


    public void start() {


        while (true) {
            if (selectedItem == null && currentMenu == null) {
                System.out.println("---- 카테고리 선택 ----");

                List<Menu> menus = Menu.getMenus();
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println((i + 1) + ". " + menus.get(i).getFoodCategory());
                }
                System.out.println("9. 장바구니 보기");
                System.out.println("0 . 종료");
                System.out.println("--------------------");
                System.out.print("메뉴를 골라주세요: ");

                int choice;
                try {
                   choice= scanner.nextInt();
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    continue;
                }
                if (choice > 0 && choice <= menus.size()) {
                    currentMenu = menus.get(choice - 1);
                }else if(choice==9){
                    shoppingCart.showCartItems();
                    if(!shoppingCart.isEmpty()){
                        System.out.println("1. 주문 확정");
                        System.out.println("0. 돌아가기");
                        int cartChoice = scanner.nextInt();
                        if(cartChoice==1){
                            shoppingCart.clearCart();
                        }
                    }
                } else if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    continue;
                }
            }

            if (selectedItem == null && currentMenu != null){
                System.out.println("----"+currentMenu.getFoodCategory()+"----");
                List<MenuItem> items = currentMenu.getMenuItems();
                for(int i = 0; i<items.size(); i++){
                    MenuItem item = items.get(i);
                    System.out.println((1+i)+"."+item.getFoodName()+"-"+item.getPrice());
                }
                System.out.println("0. 뒤로 가기");
                System.out.println("--------------");
                System.out.println("메뉴를 골라주세요 :");

                int choice;
                try{
                    choice= scanner.nextInt();
                }catch (InputMismatchException e){
                    scanner.nextLine();
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    continue;
                }
                if(choice>0 && choice <= items.size()){
                    selectedItem = items.get(choice -1);
                    System.out.println(selectedItem.getFoodName() + "를 선택하셨습니다.");
                }else if(choice == 0){
                    currentMenu = null;
                }else{
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            }else if(selectedItem != null)
                {
                    System.out.println("현재 선택한 메뉴 : " + selectedItem.getFoodName());
                    System.out.println("1. 장바구니에 추가");
                    System.out.println("0. 뒤로 가기");
                    System.out.println("입력: " );

                    int action;
                    try{
                        action = scanner.nextInt();
                    }catch (InputMismatchException e){
                        scanner.nextLine();
                        System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                        continue;
                    }  if (action == 1){
                    shoppingCart.addItemToCart(selectedItem);
                    selectedItem = null;
                }else if(action == 0){
                    System.out.println(selectedItem.getFoodName() + "선택을 취소하셨습니다.");
                    selectedItem = null;
                }else {
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
        }


    } scanner.close();
    }
    }

