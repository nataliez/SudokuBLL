package baseballStats;
import java.util.Scanner;

public class BaseballStats{
	public static void battingAvg(double hits, double atBat) {
	double BA = (hits/atBat);
	System.out.println("The Batting average is: " + BA);
}
	
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Player Name:" );
	String name = sc.nextLine();
	System.out.print("AB: ");
	int AB = sc.nextInt();
	System.out.println("H: ");
	int H = sc.nextInt();
	System.out.println("2B: ");
	int twoB = sc.nextInt();
	System.out.println("3B: ");
	int threeB = sc.nextInt();
	System.out.println("HR: ");
	int HR = sc.nextInt();
	System.out.println("R: ");
	int R = sc.nextInt();
	System.out.println("BB: ");
	int BB = sc.nextInt();
	System.out.println(R);
	System.out.println("Stats for: " + name);
	BaseballStats.battingAvg(H, AB);
	double OBP = (double) (H + BB) / AB;
	System.out.println("OBP = " + OBP);
	double TB = (H + 2 * twoB + 3 * threeB + 4 * HR);
	System.out.println("TB = " + TB);
	double SLG = TB / AB;
	System.out.println("SLG = " + SLG);
	double OPS = OBP + SLG;
	System.out.println("OPS = " + OPS);
	sc.close();
	}
}



