package javaStudy;

public class Car {
	static String carName;
	static int numberOfCar = 0;
    public void run() {
        System.out.println(carName + " 차가 달립니다.");        
    }
    // 정수 하나를 매개변수로 받는 메소드, run을 추가해 보세요.
    public static void run(int num) {
        System.out.println(carName + " 차가" + num + "분 동안 차가 달립니다.");        
    }
    public void printNumberOfCar() {
    	System.out.println(numberOfCar);
    }
    static void setName(String name) {
    	carName = name;
    }
}