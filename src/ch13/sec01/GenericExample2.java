package ch13.sec01;

public class GenericExample2 {

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
		
//		------------------------------------------------------------------
		
		Box3 box3 = new Box3(1, 2);		//Integer 데이터
		{
			int v1 = (int)box3.getContent1();	//return type이 Object이기에 못 가져와서 강제 형변환 필요
			int v2 = (int)box3.getContent2();
		}
		
		{
			box3 = new Box3("Hello ", "World");
			String v1 = (String)box3.getContent1();
			String v2 = (String)box3.getContent2();
			
			//논리적 오류 발생 
			box3.setContent1(10);	//box3은 문자열 타입인데, 숫자 넣어도 컴파일 에러나지 않음
									//실행해도 돌아가지만, 빼낼 때 정수로 빼내야 함 => 논리적 오류 가능성 농후함
									//오류는 컴파일러가 잡아야 한다
		}
		//이처럼 형변환이 불편함
		//불편함 해결 위해 만든 것이 Box2
		
//		------------------------------------------------------------------
		
		{
			Box2<Integer, Integer> box4 = new Box2<>(1, 2);
			int v1 = box4.getContent1();
			int v2 = box4.getContent2();
		}
		//위처럼 강제 형변환한 코드와 차이가 보임!
		
		{
			Box2<String, String> box4 = new Box2<>("Hello ", "World");	//box4가 정확히 String 문자열만 들어가는 것으로 fix된다
			String v1 = box4.getContent1();
			String v2 = box4.getContent2();
			
//			box4.setContent1(3);	//데이터 타입 안 맞는다고 바로 컴파일 오류 뜸 (컴파일러가 알려줌)
		}
		
		
	}
}
