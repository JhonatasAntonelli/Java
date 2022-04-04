package testes;

public class TesteArray2 {
		
	    public static void main(String[] args) {
	        // declares an array of integers
	        int[] ages;
	        // allocates memory for 10 integers
	        ages = new int[10];
	        // initialize first element
	        ages[0] = 10;
	        // and so forth
	        ages[1] = 15;
	        ages[2] = 22;
	        ages[3] = 35;
	        ages[4] = 37;
	        ages[5] = 17;
	        ages[6] = 21;
	        ages[7] = 19;
	        ages[8] = 26;
	        ages[9] = 28;
	        // Alternatively, you can use the shortcut syntax to create and initialize an array:
	        // int[] anArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
	        System.out.println("Element at index 0: " + ages[0]);
	        System.out.println("Element at index 1: " + ages[1]);
	        System.out.println("Element at index 2: " + ages[2]);
	        System.out.println("Element at index 3: " + ages[3]);
	        System.out.println("Element at index 4: " + ages[4]);
	        System.out.println("Element at index 5: " + ages[5]);
	        System.out.println("Element at index 6: " + ages[6]);
	        System.out.println("Element at index 7: " + ages[7]);
	        System.out.println("Element at index 8: " + ages[8]);
	        System.out.println("Element at index 9: " + ages[9]);
	    }
	}


