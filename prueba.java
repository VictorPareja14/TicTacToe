
import java.util.Scanner;

public class prueba {
static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {
	
		int aleatorio = (int) (Math.random()*2+1);
		int jugador;
		boolean sw=false;
		int contador=0;
		int contador2=0;
		
		
		if(aleatorio==1) 
		{
			System.out.println("Empieza el jugador 1"); 
			jugador=aleatorio;
			contador=0;
		}
		else 
		{
			System.out.println("Empieza el jugador 2"); 
			jugador=aleatorio; 
			contador2=0;
		}
		
		System.out.println("Elige un numero");
		int num = in.nextInt();

		if(aleatorio==1) {contador++;}
		if(aleatorio==2) {contador2++;}
		System.out.println(contador+" "+contador2);
		
		if(jugador==1&&contador==1) 
		{
			System.out.println("Le toca al jugador 2");
			sw=true;

		}
	
		
		if(jugador==2&&contador2==1) 
		{
			System.out.println("Le toca al jugador 1");
			sw=false;

		}
	
		while(contador!=3&&contador2!=3) {
		
			
			System.out.println("Elige un numero");
			num = in.nextInt();
			
			if(jugador==1&&contador==2) 
			{
				System.out.println("Le toca al jugador 2");
				sw=true;

			}
			if(jugador==1&&contador==3) 
			{
				System.out.println("Le toca al jugador 2");
				sw=true;
			}
			if(jugador==2&&contador2==2) 
			{
				System.out.println("Le toca al jugador 1");
				sw=false;
			}
			if(jugador==2&&contador2==3) 
			{
				System.out.println("Le toca al jugador 1");
				sw=false;
			}
			
			if(sw==false) {
				contador2++;
			}
			if(sw=true) {
			contador++;
			}
			System.out.println(contador+" "+contador2);
		}
		
	}
}
