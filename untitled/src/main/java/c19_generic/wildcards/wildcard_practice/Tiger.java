package c19_generic.wildcards.wildcard_practice;

import lombok.ToString;

@ToString
public class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
