import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String teamname , inningname ;
		System.out.println("Enter the teamname");
		teamname=in.nextLine();
		System.out.println("Enter the inning");
		inningname=in.nextLine();
		System.out.println("Enter the run");
		int run=in.nextInt();
		System.out.println("Name: " + teamname );
		System.out.println("Scored: " + run );
		
		switch(inningname)
		{
		    case  "first" : run=run+1;
		              System.out.println("Need " + run +" to win");
		              break;
		    case "second" : System.out.println("Match ended ");
		             break;
		    default: System.out.println("Invalid input");
		}

	}

}
