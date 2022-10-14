import java.util.Random;

public class Headtail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random myno = new Random();
		
		int num = myno.nextInt(2);
		
		switch (num) {
		case 0: 
			System.out.println("Head");
			break;
		default:
			System.out.println("Tails");
		}
	}

}
