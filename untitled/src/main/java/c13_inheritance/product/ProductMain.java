package c13_inheritance.product;
/*
    c13_inheritance 패키지 내부에 product 패키지 생성
 */
public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 상품", "일반 카테고리");

        System.out.println("이 상품은 " + item1.getName() + "입니다.");
        System.out.println("이 상품은 " + item1.getCategory() + "입니다.");

        Product product1 = new Product("전자제품", "가전", 100000, 10 );
        product1.displayInfo();
    }
}
