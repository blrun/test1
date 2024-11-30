package javaStudy;

public class ExceptionExam3 {

	public static void main(String[] args) {
        ExceptionExam3 exam = new ExceptionExam3();
        int[] array = new int[10];
        
        try {
            exam.get50thItem(array);
        } catch (Exception ex) {
            ex.printStackTrace(); 
        }
    }
    
    public int get50thItem(int []array) throws MyCheckedException{
        if(array.length < 50){
            throw new MyCheckedException("프로그램 실행 중단!");
        }
        return array[49];
	}

}
