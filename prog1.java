import java.io.*;
class demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int marathi_marks;
		System.out.println("Enter marathi marks");
		marathi_marks=Integer.parseInt(br.readLine());
		System.out.println("Enter maths marks");
		int maths_marks=Integer.parseInt(br.readLine());
		System.out.println("Enter geography marks");
		int geo_marks=Integer.parseInt(br.readLine());
		System.out.println("Enter english marks");
		int eng_marks=Integer.parseInt(br.readLine());
		System.out.println("Enter science marks");
		int sci_marks=Integer.parseInt(br.readLine());
		
		double avg=0;
		if(marathi_marks>35 && maths_marks>35 && geo_marks>35 && eng_marks>35 && sci_marks>35){
			avg=(marathi_marks+maths_marks+geo_marks+eng_marks+sci_marks)/5;
			System.out.println("Average marks of student"+avg);
		}
		else{
			System.out.println("fail");
		}
		char ch;
		if(100>avg && avg>75){
			ch='A';
		}
		else if(74>avg && avg>65){
			ch='B';
		}
		else if(64>avg && avg>45){
			ch='C';
		}
		else if(44>avg && avg>35){
			ch='D';
		}
		else{
			ch='F';
		}	
		switch(ch){
			case 'A':
				System.out.println("Distinction");
				break;
			case 'B':
				System.out.println("Second class");
				break;
			case 'C':
				System.out.println("Third Class");
				break;
			case 'D':
				System.out.println("Pass");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			}
	}
}