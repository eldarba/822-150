package a;

// generic class
// T represents a type parameter
public class Box<T> {

	private T content; // the box content

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
