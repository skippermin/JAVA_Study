package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력 
		System.out.println((int)ch1); //문자에 해당하는 정수 값(아스키 코드) 출력
		System.out.println("----------------------");
		
		char ch2 = 66; // 정수값 대입 
		System.out.println(ch2); // 정수 값에 해당하는 문자 출력 
		System.out.println("----------------------");
		
		char ch3 = 67;
		System.out.println(ch3); // 문자 정수 값 출
		System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력 
		
		System.out.println("----------------------");
		char ch4 = 'Z';
		char ch5 = 38;
		char ch6 = 97;
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println((char)ch5);
		System.out.println(ch6);
		System.out.println((char)ch6);
		//파이썬으로 돌아가고 싶다.
	}
}
