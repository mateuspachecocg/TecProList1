package solutions;

public class SolutionMethods {

	public static void main(String[] args) {
		// Testing Solutions
		
		System.out.println("Test: Question 01");
		question01(10, 10); // A = 10, B = 10
		question01(11,  9); // A = 11, B =  9
		question01( 9, 11); // A =  9, B = 11
		question01( 3, 18); // A =  3, B = 18
		question01(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 02");
		question02(10, 10); // A = 10, B = 10
		question02(11,  9); // A = 11, B =  9
		question02( 9, 11); // A =  9, B = 11
		question02( 3, 18); // A =  3, B = 18
		question02(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 03");
		question03(10, 10); // A = 10, B = 10
		question03(11,  9); // A = 11, B =  9
		question03( 9, 11); // A =  9, B = 11
		question03( 3, 18); // A =  3, B = 18
		question03(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 04");
		question04(10, 10); // A = 10, B = 10
		question04(11,  9); // A = 11, B =  9
		question04( 9, 11); // A =  9, B = 11
		question04( 3, 18); // A =  3, B = 18
		question04(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 05");
		question05(10, 10); // A = 10, B = 10
		question05(11,  9); // A = 11, B =  9
		question05( 9, 11); // A =  9, B = 11
		question05( 3, 18); // A =  3, B = 18
		question05(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 06");
		question06(10, 10); // A = 10, B = 10
		question06(11,  9); // A = 11, B =  9
		question06( 9, 11); // A =  9, B = 11
		question06( 3, 18); // A =  3, B = 18
		question06(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 07");
		question07(10, 10); // A = 10, B = 10
		question07(11,  9); // A = 11, B =  9
		question07( 9, 11); // A =  9, B = 11
		question07( 3, 18); // A =  3, B = 18
		question07(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 08");
		question08(10, 10); // A = 10, B = 10
		question08(11,  9); // A = 11, B =  9
		question08( 9, 11); // A =  9, B = 11
		question08( 3, 18); // A =  3, B = 18
		question08(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 09");
		question09(10, 10); // A = 10, B = 10
		question09(11,  9); // A = 11, B =  9
		question09( 9, 11); // A =  9, B = 11
		question09( 3, 18); // A =  3, B = 18
		question09(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 10");
		question10(10, 10); // A = 10, B = 10
		question10(11,  9); // A = 11, B =  9
		question10( 9, 11); // A =  9, B = 11
		question10( 3, 18); // A =  3, B = 18
		question10(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 11");
		question11(10, 10); // A = 10, B = 10
		question11(11,  9); // A = 11, B =  9
		question11( 9, 11); // A =  9, B = 11
		question11( 3, 18); // A =  3, B = 18
		question11(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 12");
		question12(10, 10); // A = 10, B = 10
		question12(11,  9); // A = 11, B =  9
		question12( 9, 11); // A =  9, B = 11
		question12( 3, 18); // A =  3, B = 18
		question12(18,  3); // A = 18, B =  3
		
		System.out.println("Test: Question 13");
		question13(10, 10); // A = 10, B = 10
		question13(11,  9); // A = 11, B =  9
		question13( 9, 11); // A =  9, B = 11
		question13( 3, 18); // A =  3, B = 18
		question13(18,  3); // A = 18, B =  3
	
	}
	
	
	static void question01(int A, int B) {
		if (A > 10) {
			System.out.println("A > 10");
		}
		
		if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido.");
		}
	}
	
	static void question02(int A, int B) {
		if (A < 10) {
			System.out.println("A < 10");
		} else if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido.");
		}
	}
	
	static void question03(int A, int B) {
		if (A == 10) {
			System.out.println("A == 10");
		}
		
		if (A + B == 20) {
			System.out.println("A + B == 20");
		}
		
		if (B == 10) {
			System.out.println("B == 10");
		}
	}
	
	static void question04(int A, int B) {
		if ((A > 10) || (A + B == 20) ) {
			System.out.println("numero valido.");
		} else if (A == B){
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10.");
		} else {
			System.out.println("numero invalido.");
		}
	}
	
	static void question05(int A, int B) {
		if ((A > 10) || (A + B == 20) ) {
			System.out.println("numero valido.");
		} else {
			System.out.println("numero invalido.");
		}
	}
	
	static void question06(int A, int B) {
		if (A > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		
		if (A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
	}
	
    static void question07(int A, int B) {
    	if (A > 10) {
    		if(A + B == 20) {
    			System.out.println("numeros validos");
    		}
    	} else {
    		 System.out.println("numero nao valido");
    	}
	}
    
    static void question08(int A, int B) {
    	question01(A, B);
	}
    
    static void question09(int A, int B) {
    	if ((A > 10) && (A + B == 20) ) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("numero nao valido.");
		}
	}
    static void question10(int A, int B) {
		if(!(A > 10)) {
			System.out.println("numero menor que 10");
		}
		
		if(!(A + B == 20)) {
			System.out.println("numero diferente de 20");
		}
	}
    
    static void question11(int A, int B) {
    	if(!(A > 10)) {
    		if (A + B == 20) {
    			System.out.println("A + B == 20");
    		} else {
    			System.out.println("numero nao valido");
    		}
		}
	}
    
    static void question12(int A, int B) {
		if (!((A > 10) || (A + B == 20))) {
			System.out.println("numeros nao validos.");
		} else {
			if(A > 10) {
				System.out.println("A > 10");
			} else {
				System.out.println("A + B == 20");
			}
		}
		
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Pro");
	}
    
    static void question13(int A, int B) {
    	boolean condition1 = (A > 10);
    	boolean condition2 = (A + B == 20);
    	if(condition1) {
			System.out.println("A > 10");
    	}
    	
    	if(condition2) {
			System.out.println("A + B == 20");
    	}
    	
    	if (!(condition1 && condition2)) {
    		System.out.println("numeros nao validos");
    	}
    	
	}


}
