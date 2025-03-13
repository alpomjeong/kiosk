import java.util.*;

public class ShoppingCart {
    private List<MenuItem> items = new ArrayList<>();

    public void addItemToCart(MenuItem item) {
        items.add(item);
        System.out.println(item.getFoodName() + "가 장바구니에 추가되었습니다.");
    }

    public int calculateTotalPrice(){
        int total = 0;
        for(MenuItem item : items) {
         total += item.getPrice();
        }
        return total;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public void clearCart() {
        items.clear();
        System.out.println("주문이 완료되었습니다. 장바구니가 초기화되었습니다.");
    }

    public void showCartItems(){
        if (items.isEmpty()){
            System.out.println("장바구니가 비어 있습니다");
            return;
        }

        System.out.println("장바구니 목록 : ");
        int total = 0;
        for (MenuItem item : items){
            System.out.println("-" + item.getFoodName() + "| 가격 : "+ item.getPrice() + "원");
            total += item.getPrice();
        }
        System.out.println("총 금액 : "+total+"원");
    }
}
