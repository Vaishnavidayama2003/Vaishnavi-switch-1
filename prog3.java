import java.io.*;
class demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("enter the 1st number ");
		int num1=Integer.parseInt(br.readLine());

		System.out.println("enter the 2nd number ");
		int num2=Integer.parseInt(br.readLine());

		if(num1<0 || num2<0){
			System.out.println("Sorry negetive numberds not allowed");
		}
		else{
			switch((num1*num2)%2){
			case 0:
				System.out.println("product is EVEN");
				break;
			case 1:
				System.out.println("product is ODD");
				break;
			
			}
		
		}
		
		
	}
}