package javaStudy;

public class Taxi implements Meter {

	@Override
	public void start() {
		System.out.println("택시 출발!");

	}

	@Override
	public int stop(int distance) {
		System.out.println("택시가 도착했습니다. 요금은 " + (distance * 2) + "원 입니다!");
        return distance * 2;
	}

}
