package a;

public class B {

	public static void main(String[] args) {
		A a = new A();
//		System.out.println(a.xPrivate);
		System.out.println(a.xProtected);
		System.out.println(a.xPackage);
		System.out.println(a.xPublic);
	}

//	public void m() {
//		System.out.println(this.xPrivate);
//		System.out.println(this.xProtected);
//		System.out.println(this.xPackage);
//		System.out.println(this.xPublic);
//	}

}
