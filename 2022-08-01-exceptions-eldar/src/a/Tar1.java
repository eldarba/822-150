package a;

public class Tar1 {
	
	public static void main(String[] args) {
		String val = "125";
		int x = parse(val);
		System.out.println(x);
	}
	
	public static int parse(String val) {
		try {
			return Integer.parseInt(val);
		} catch (Exception e) {
			return 0;
		}
	}

}
