package javaStudy;

public class CarAbstractExam {

	public static void main(String[] args) {
		CarAbstract car = new CarAbstract();
        if(Machine.class.isInstance(car)){
            car.turnOn();
            car.turnOff();
            car.Sound();
            System.out.println("정답입니다. [제출]을 누르세요.");
        }
        else{
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
	}

}
