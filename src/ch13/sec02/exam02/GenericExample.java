package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		Rentable<Home> homeAgency = new HomeAgency();		//일반화된, 정석적인 코드
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		
		Rentable<Car> carAgency = new CarAgency();			//일반화된, 정석적인 코드
		Car car = carAgency.rent();
		car.run();
	}
}
//객체에서 제공하는 메소드를 호출해봤다