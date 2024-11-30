package javaStudy;

public class TaxiInterExam {

	public static void main(String[] args) {
        int distance = 10;
        TaxiInter taxi = new TaxiInter();
        
        taxi.start();
        taxi.stop(distance);
        taxi.afterMidnight(distance);
	}

}
