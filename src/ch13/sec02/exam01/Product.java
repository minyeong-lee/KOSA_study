package ch13.sec02.exam01;

//제네릭 타입
public class Product<K, M> {
	//필드
	private K kind;
	private M model;
	//객체를 만들 때의 타입을 저장해주세요
	//타입이 명확하게 결정되지 않았음
	//객체 생성될 때 타입이 결정됨

	
	//메소드
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	//더 나은 코드
	//생성자
	public Product(K kind, M model) {
		super();
		this.kind = kind;
		this.model = model;
	}
}
