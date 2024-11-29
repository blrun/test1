package javaStudy;

public class CarExam {

	// 여기서 public(동일 패키지에서 생략가)과 private, static과 스태틱이 없는 메소드 접두어를 이해할 필요가 있다.
	public static void main(String[] args) {
		// 클래스명 접두어는 대문자, 인스턴스명 접두어는 여기서 소문자이다.
		Car.setName("그래저");
        // Person클래스에서 String과 int를 매개변수로 받는 생성자를 호출합니다.
        Car car = new Car();
        Car.numberOfCar += 1;
        car.run();
        // int형 매개변수를 받는 run을 호출합니다.
        Car.run(100);
        Car car2 = new Car();
        Car.numberOfCar += 1;
        car2.printNumberOfCar();
	}

}
