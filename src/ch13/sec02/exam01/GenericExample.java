package ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
//		Product<Tv, String> product1 = new Product<>();
//		//product1의 종류는 Tv, 모델은 String
//		
//		//데이터 넣기
//		product1.setKind(new Tv());
//		product1.setModel("스마트TV");
//
//		//데이터 가져오기
//		Tv tv = product1.getKind();
//		String tvModel = product1.getModel();
//		
////		-----------------------------------------------------
//		
//		Product<Car, String> product2 = new Product<>();
//		
//		product2.setKind(new Car());
//		product2.setModel("SUV자동차");
//		
//		Car car = product2.getKind();
//		String carModel = product2.getModel();
		
		
		//더 나은 코드 제안
		//생성자 이용 => 결정할 당시에 세팅을 한다!
		//제품이 만들어질 때 값이 결정되는 것이 훨씬 간단하다
		Product<Tv, String> product1 = new Product<>(new Tv(), "스마트TV");
		
		Product<Car, String> product2 = new Product<>(new Car(), "SUV자동차");
		
	}
}
//객체를 만들 때 타입 정해짐
//사용하는 사람 마음대로 타입 지정하여 생성