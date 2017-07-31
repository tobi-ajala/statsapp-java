import java.util.Scanner;


public class StatsApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		double [] values = new double[5];
		
		values[0]=1.0;
		values[0]=3.0;
		values[0]=5.7;
		values[0]=3.8;
		values[0]=100.0;
		
		
		double sum=0.0; /*b/c I want a running sum of the values*/
		for(int i=0; i<5;i++) 
		{
			sum = sum + values[i];
		}
		double average;
		average=sum/5.0;
		System.out.println("average = "+average);
		
		while(true)
		{
			System.out.println("enter something or 'x' to exit");
			str = s.nextLine();
			if(str.equals("x"))
			//*if((str.toLowerCase()).equals("x")) this is what I write instead of the above if statement if I want to be able to enter an upper case 'X'*//
				break;
			System.out.println("you entered: "+str);	
		}
		System.out.println("Bye for now!");
	}

}
