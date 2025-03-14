# 과제 소개
> * 본 프로젝트는 햄버거 및 음료 메뉴를 주문할 수 있는 콘솔 기반 키오스크 시스템입니다. 사용자는 기능이나 카테고리를 선택하고 원하는 메뉴를 장바구니에 추가한 후 주문을 확정할 수 있습니다.

# 과제 구조
> 1. Main.java: 프로그램의 진입점으로 Kiosk 객체를 생성하고 실행합니다.
> 
> 2. Kiosk.java: 키오스크 시스템의 전체적인 흐름을 관리하는 클래스입니다.
> 
> 3. Menu.java: 메뉴 카테고리를 관리하는 클래스입니다.
> 
> 4. Main.java: 프로그램의 진입점으로 Kiosk 객체를 생성하고 실행합니다.
> 
> 5. ShoppingCart.java: 장바구니 기능을 담당하는 클래스입니다.
> 
# 주요 기능
## 1. 카테고리 선택 기능
> ```java
> System.out.println("---- 카테고리 선택 ----");
> List<Menu> menus = Menu.getMenus();
> for (int i = 0; i < menus.size(); i++) {
> System.out.println((i + 1) + ". " + menus.get(i).getFoodCategory());
> } 
> ```

## 2. 장바구니 기능
> ```java
> public void addItemToCart(MenuItem item) {
>     items.add(item);
>     System.out.println(item.getFoodName() + "가 장바구니에 추가되었습니다.");
> }
> ```
> ```java
>    public void showCartItems(){
>        if (items.isEmpty()){
>            System.out.println("장바구니가 비어 있습니다");
>            return;
>        }
>        System.out.println("장바구니 목록 : ");
>        int total = 0;
>        for (MenuItem item : items){
>            System.out.println("-" + item.getFoodName() + "| 가격 : "+ item.getPrice() + "원");
>            total += item.getPrice();
> 
> ```
## 3. 주문 확정 기능
>```java
> public void clearCart() {
>     items.clear();
>    System.out.println("주문이 완료되었습니다. 장바구니가 초기화되었습니다.");
> ```
>
>