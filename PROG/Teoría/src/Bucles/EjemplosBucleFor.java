package Bucles;

public class EjemplosBucleFor {

	public static void main(String[] args) {
		
		//Bucle for
		for(int i=0; i<10; i+=2) {
			if (i%2==0 && i<8) {
				continue;
			}else if (i%3==0) {
				break;
			}
			System.out.println(i);
		}
		// Bucle foreach
		
	}
}
