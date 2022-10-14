import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random myno  = new Random();
		int ran_no = 100 + myno.nextInt(9900);
		System.out.println(ran_no);
	}

}
