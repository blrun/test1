package javaStudy;

public class TruckSuper extends CarSuper {
    int load;
    
    public TruckSuper(String name, int number, int load) {
        // super를 이용해서 Car클래스의 생성자를 이용하세요.
        super(name, number);
        this.load = load;
    }
}
