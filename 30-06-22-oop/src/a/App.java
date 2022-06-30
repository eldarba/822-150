package a;

public class App {

	public static void main(String[] args) {
		
		Person p = new Person();
//		p.id = 111;
//		p.name = "Alon";
//		p.age = 2500;
		
		p.setId(111);
		p.setName("Avi");
		p.setAge(25);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
