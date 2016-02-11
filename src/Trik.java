import java.util.Scanner;
public class Trik {
	public static void main(String[] args) {
		int swap = 1; 		
		char inp[] = new char[100]; 		
		Scanner scan = new Scanner(System.in); 		
		System.out.print("Enter ABC : "); 		
		inp=scan.next().toCharArray(); 	
		for (int i = 0 ; i < inp.length ; i++) { 	
			
			if (inp[i]=='A'||inp[i]=='a') { 				
				if (swap==1) { swap=2; } 				
				else if (swap==2) { swap=1;} 			} 		
					else if (inp[i]=='B'||inp[i]=='b') { 			
					if (swap==2) { swap=3; } 				
				else if (swap==3) { swap=2;} 			} 	
						else if (inp[i]=='C'||inp[i]=='c') { 		
						if (swap==3) { swap=1; } 			
					else if (swap==1) { swap=3;} 		
					} 		
				} 		
			
		System.out.print("Ball in glass : " + swap); 
		}
	}


