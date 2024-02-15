package ch13.sec01;

public class Box2<A, B> {
	private A content1;
	private B content2;
	
	public Box2(A content1, B content2) {
		super();
		this.content1 = content1;
		this.content2 = content2;
	}

	public A getContent1() {
		return content1;
	}

	public void setContent1(A content1) {
		this.content1 = content1;
	}

	public B getContent2() {
		return content2;
	}

	public void setContent2(B content2) {
		this.content2 = content2;
	}
	
}
//타입도 일종의 함수처럼 매개변수로 전달이 가능
//< > 안에 필요한 만큼 전달 가능