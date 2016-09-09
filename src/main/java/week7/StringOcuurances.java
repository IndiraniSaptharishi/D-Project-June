package week7;

public class StringOcuurances {

	public static void main(String[] args) {
		String str="Amazon Development Centre";
		System.out.println(str.length()-str.replace("n","").length() + str.length()-str.replace("m", "").length());

	}

}
