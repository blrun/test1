package javaStudy;

public class CarAbstract extends Machine {
    // Machine 클래스를 상속받고, 추상 메소드를 구현하세요.
    public void turnOn() {
        System.out.println("시동이 걸렸습니다.");
    }
    public void turnOff() {
        System.out.println("시동이 꺼졌습니다.");
    }

}
