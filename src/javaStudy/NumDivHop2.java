package javaStudy;
import java.util.Scanner;

public class NumDivHop2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);

        // 사용자에게 입력 안내
        System.out.print("0~3000 까지의 정수를 입력하세요: ");

        // 정수 입력받기
        int number = scanner.nextInt();
        
        // Scanner 객체 닫기
        scanner.close();
        
        Solution2 res = new Solution2();
        
        // 결과 값 출력
        System.out.println("입력받은 0~3000 까지 특정 수의 약수 합은: " + res.solution(number));
	}
}

class Solution2 {
	public int solution(int n) {
		if(n > 3000 || n < 0) {
			throw new IllegalArgumentException("입력 범위를 벗어났습니다."); // 에러 메시지 출력 및 프로그램 종료
		}
		int answer = 0;
		int mok;
		if(n <= 1) return n;
		else {
			for(int i=1; i<=n/2; i++) {
				if(n % i == 0) {
					mok = n / i;
					if(i < mok) {
						answer += i + mok;
					} else if(i == mok){
						answer += i;
					} else break;
				}
			}
		}
		return answer;
	}
}
