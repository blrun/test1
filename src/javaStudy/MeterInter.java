package javaStudy;

public interface MeterInter {
    public void start();
    public int stop(int distance);
    
    public default void afterMidnight(int distance){
        System.out.println("자정이 넘었습니다. 할증이 필요한경우 이 메소드를 오버라이드 하세요.");
    }
}
