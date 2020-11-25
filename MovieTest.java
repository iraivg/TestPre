import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movies obj = new Movies();
		Scanner l = new Scanner(System.in);
		try {
		obj.income(l.nextInt(),1000);
		obj.Pechalba(3,1000);
		System.out.println(obj.income(3,1000));
		System.out.println(obj.Pechalba(3,1000));
		}
		catch(InputMismatchException t){
			System.out.println("Greshka");
		}
		
	}

}
