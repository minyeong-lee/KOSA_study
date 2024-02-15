package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
//		BoxString box1 = new BoxString("안녕하세요.");	//컴파일러가 실행 타임에 이렇게 코드 생성
														//가상머신에 이 코드가 올라감
		Box<String> box1 = new Box<>("안녕하세요.");	//Box 클래스 생성자 인자
		box1.setContent("안녕하세요.");					//값 설정 가능
		String str = box1.getContent();					//값 읽기 가능 
		System.out.println(str);
		
		
//		BoxInteger box2 = new BoxInteger(100);			//이 코드가 실행 타임에 가상머신에 올라감
		Box<Integer> box2 = new Box<>(100);
		box2.setContent(100);
		int value = box2.getContent();
		System.out.println(value);
	}
}
// = 을 중심으로 우측은 <> 타입 생략 가능(일반적으로 우측은 타입 명시 생략함)
