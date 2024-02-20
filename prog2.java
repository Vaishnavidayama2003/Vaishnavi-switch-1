import java.io.*;
class demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number !!!!!!!!!!");
		int num=Integer.parseInt(br.readLine());
		
			
		switch(num){
			case 1:
				System.out.println("\" ONE \"");
				break;
			case 2:
				System.out.println("\" TWO \"");
				break;
			case 3:
				System.out.println("\" THREE \"");
				break;
			case 4:
				System.out.println("\" FOUR \"");
				break;
			case 5:
				System.out.println("\" FIVE \"");
				break;
			default :
				System.out.println("\"Entered number is greater than five\"");
				break;
			}
	}
}