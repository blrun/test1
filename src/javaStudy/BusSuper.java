package javaStudy;

public class BusSuper extends CarSuper {
    int fee;
    
    public BusSuper(String name, int number, int fee) {
        // super를 이용해서 Car클래스의 생성자를 이용하세요.
        super(name, number);
        this.fee = fee;
    }
}
