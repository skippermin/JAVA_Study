package chapter2;

public class CharactetEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C'; // 한 이라는 유니코드 값이고 16진수로 표현되어 있음 16진수 숫자 하나가 4비트 4개 사용. 
		// 2바이트 사용한다고 생각하면 될 듯용. -> 2진수 4자리씩 묶어서 16진수(0~9, A~F) 한 자리로 표현하기로 약속
		// 파일(txt, java)로 저장하거나, 네트워크(인터넷)로 전송할 때의 크기는 3바이트 -> 표준 인코딩 방식이 UTF-8입니다. 
		// 이유: 전송 속도 빠름 메모리 낭비 적음. 
		// 자바 프로그램이 실행 중인 메모리 안에서 '한'이라는 글자를 char 변수에 담아둘 때의 크기라고 생각하면 될 듯 
		// 자바 내부 규칙인 UTF-16을 따르므로 2바이트라고 봐야 함. 
		// 네트워크 전송 시 -> 3바이트(0xED 0x95 0x9C)로 변환되어 저장/전송됩니다.
		System.out.println(ch1);
		System.out.println(ch2); 
		//## 요약
		// 인코딩 (Encoding): 문자 String -> 바이트 byte[] (사람 글자 -> 컴퓨터 숫자)
		//디코딩 (Decoding): 바이트 byte[] -> 문자 String (컴퓨터 숫자 -> 사람 글자)
	}
}
