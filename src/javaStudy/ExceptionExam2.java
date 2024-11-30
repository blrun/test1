package javaStudy;

public class ExceptionExam2 {

	public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
	        int k = divide(i, j);     // j가 0일 경우 오류를 발생시킵니다.
	        System.out.println(k);
        } catch (IllegalArgumentException e){
        	System.out.println(e.toString());
        }
    }       
    public static int divide(int i, int j) throws IllegalArgumentException{
        if(j == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없어요.");
         }
        int k = i / j;
        return k;
    }   
}
