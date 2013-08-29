package lk.example;

public class Example {
	public static void main (String[] args){
		String list = "hi i'm thushara";
		String[] whiteNumbers = list.split(",");
		
		for (int i = 0; i < whiteNumbers.length; i++) {
			System.out.println("person "+ i +" : " + whiteNumbers[i]);
		}
		System.out.println("");
		
	}

}
