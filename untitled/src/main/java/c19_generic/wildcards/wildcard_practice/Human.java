package c19_generic.wildcards.wildcard_practice;

public class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 뜁니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
