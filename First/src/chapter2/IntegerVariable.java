package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		short sVal = 10;
		byte bVal = 20; // byte는 뭐 당연히 -128 ~ 128 까지 정확히는 양수 127 음수 -128까
		System.out.println(sVal + bVal);
		
		// int num1 = 12345678900;  // 오류 원인 123억 찍음 -> int 최대값 32비트 기준 21억까지임 ㅅㄱ L 붙이셈 해결됨
			
		// integer형 4byte 32비트 8비트 1byte -> -2^31 ~ 2^31 -1 까지 (-2,147,483,648 ~ 2,147,483,647) 입니다.
		// short형 -> -2^15 ~ 2^15 -1 까지 유효범위 -> (-32,768 ~ 32,767)
		System.out.println("--------------------------------------------");	
		
		long num2 = 12345678900L;
		// long형 L을 안 붙이면. 에러 발생 하옵니다. -> 숫자 뒤에 L을 붙이도록 하십다. 범위 922경 long형 8byte 64비트 크기의 상자.
		//	System.out.println(num1);
		System.out.println(num2);
		
		/*
		 * 프로그램이 실행되어 정수 값을 연산할 시. 4바이트를 기본 단위로 사용.
		 * 두 정수를 더하기 전에 두 정수는 int 형으로 변환된다. -> 컴퓨터 연산 시 내부적으로 int형으로 변환합니다.
		 * 
		 */
	}

}
