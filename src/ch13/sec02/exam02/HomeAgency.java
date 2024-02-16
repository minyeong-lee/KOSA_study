package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();		//Home 객체 만들어서 리턴
	}
	
}
