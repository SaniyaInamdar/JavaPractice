package string_Buffer;

public class E_CountEachVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java programming is high level object oriented programming language";
		int countA =0;
		int counta=0;
		int countE=0;
		int counte=0;
		int countI=0;
		int counti=0;
		int countO=0;
		int counto=0;
		int countU=0;
		int countu=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A') {
				countA++;
			}
			else if(s.charAt(i)=='a') {
				counta++;
			}
			
			if(s.charAt(i)=='E') {
				countE++;
			}
			else if(s.charAt(i)=='e') {
				counte++;
			}
			
			
			if(s.charAt(i)=='I') {
				countI++;
			}
			else if(s.charAt(i)=='i') {
				counti++;
			}
			
			
			if(s.charAt(i)=='O') {
				countO++;
			}
			else if(s.charAt(i)=='o') {
				counto++;
			}
			
			
			if(s.charAt(i)=='U') {
				countU++;
			}
			else if(s.charAt(i)=='u') {
				countu++;
			}
			
		}
		
//		System.out.println("A  "+countA);
//		System.out.println("E  "+countE);
//		System.out.println("I  "+countI);
//		System.out.println("O  "+countO);
//		System.out.println("U  "+countU);
		
		System.out.println("a  "+counta);
		System.out.println("o  "+counte);
		System.out.println("i  "+counti);
		System.out.println("o  "+counto);
		System.out.println("u  "+countu);
	
	}

}
