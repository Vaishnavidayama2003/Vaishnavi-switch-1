import java.io.*;
class demo{
	static int choice;
	void ser(){
		System.out.println("You are into SERIES section");
		System.out.println("1.Stranger things\n2.Lucifer\n3.Breaking Bad\n4.Peaky Blinders\n5.Money Heist\n7.Go to movies section");
		System.out.println("Enter your choice");
		int serchoice=Integer.parseInt(br.readLine());
		/*switch(serchoice){
			case 1 :
				System.out.println("Stranger Things");
				break;
			case 2:
				System.out.println("Lucifer");
				break;
			case 3:
				System.out.println("Breaking Bad");
				break;
			case 4:
				System.out.println("Peaky Blinders");
				break;
			case 5:
				System.out.println("Money Heist");
				break;
			case 6:
				System.out.println("Going to movies section");
				obj.movie();
				break;*/
						
		}
	void movie(){
		System.out.println("You are into MOVIES section");
		System.out.println("1.AVENGERS:INFINITY WAR\n2.TRANSFORMERS\n3.ALLADIN\n4.HITMAN\n5.DICTATOR\n6.go to series\n7.Exit");
		System.out.println("Enter your choice");
		int movchoice=Integer.parseInt(br.readLine());
		switch(movchoice){
			case 1:
				System.out.println("AVENGERS:INFINITY WAR");
				break;
			case 2:
				System.out.println("TRANSFORMERS");
				break;
			case 3:
				System.out.println("ALLADIN");
				break;
			case 4:
				System.out.println("HIT MAN");
				break;
			case 5:
				System.out.println("DICTATOR");
				break;
			case 6 :
				System.out.println("Going to series");
				obj.ser();
				break;
			case 7:
				break;
					
	}
		
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n------------------------\nWelcome User\n------------------------\n1.MOVIES\n2.SERIES");
		System.out.println("Enter your choice");
		choice=Integer.parseInt(br.readLine());
		
		demo obj=new demo();
		
		
		/*switch(choice){
			case 1:
				obj.movie();
				break;
			case 2:
				obj.ser();
				break;

			default :
				System.out.println("Enter the Right Number ");
			break;
			}
		*/	
			
		
	}
}