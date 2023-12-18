package Test;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;     //skip the iteration
			}
		
			System.out.println("Hello"+i);
		}
	}

}
