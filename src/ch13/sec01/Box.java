package ch13.sec01;

public class Box<T> {
	public T content;

	public Box(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
//제네릭이 일종의 매개변수이고, 함수이다