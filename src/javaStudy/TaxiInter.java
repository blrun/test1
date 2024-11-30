package javaStudy;

public class TaxiInter implements Meter {
    public void start(){
        System.out.println("택시가 출발합니다.");
    }
    
    public int stop(int distance){
        int fare = distance * 2;
        System.out.println("택시가 도착했습니다. 요금은 "+fare+"입니다.");
        return fare;
    }
    
    public void afterMidnight(int distance){
        int fare = distance * 3;
        System.out.println("밤에는 할증 요금이 부과됩니다. 요금은 "+fare+"입니다.");
    }
}
