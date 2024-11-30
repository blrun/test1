package javaStudy;

public class ExamExam {

	public static void main(String[] args) {
        ExceptionExam ex = new ExceptionExam();
        int[] arr = {1,2,3,4,5};
        try {
            ex.get50thItem(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 크기가 50개 보다 작습니다.");
        }
	}

}
