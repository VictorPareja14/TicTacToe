
import java.util.Scanner;

public class TicTacToe {
static Scanner in = new Scanner (System.in); 
static int aleatorio;
	public static void main(String[] args) {
		pintaArray2();
		logicaArray();
		
		
	}
	
	public static void muestraDatos() {
		System.out.println("|---|---|---|");
		
	}
	public static void pintaArray1(int [] arr1, int [] arr2, int [] arr3,  int num) {
	
		
		muestraDatos();
		
		for (int i = 0; i < arr1.length; i++) {
			;;;
			if(arr1[i]==num) {
				if(aleatorio==1) {
					arr1[i]=0;
				}else {
					arr1[i]=1;

				}
			}
			System.out.print("| "+arr1[i]);
			System.out.print(" ");
			
		}
		
		
		System.out.println("|");
		muestraDatos();
	
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]==num) {
				arr2[i]=0;
				
			}
			System.out.print("| "+arr2[i]);
			System.out.print(" ");
		}

		System.out.println("|");
		
		muestraDatos();
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i]==num) {
				arr3[i]=0;
			}
			System.out.print("| "+arr3[i]);
			System.out.print(" ");
		}
	
		System.out.println("|");
		muestraDatos();
		
	

	}
	
	public static void logicaArray() {
		int num=0;
		int [] array = {1,2,3};
		int [] array2 = {4,5,6};
		int [] array3 = {7,8,9};
		
		aleatorio = (int) (Math.random()*2+1);
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
		num=in.nextInt();
		
		if(aleatorio==1) {contador++;}
		if(aleatorio==2) {contador2++;}
		System.out.println(contador+" "+contador2);
		pintaArray1(array,array2,array3,num);

		if(jugador==1&&contador==1) 
		{
			System.out.println("Le toca al jugador 2");
			System.out.println("Elige un numero");
			num = in.nextInt();
			contador2++;
			jugador=2;
			System.out.println(contador+" "+contador2);
			pintaArray1(array,array2,array3,num);


		}
	
		if(jugador==2&&contador2==1) 
		{
			System.out.println("Le toca al jugador 1");
			System.out.println("Elige un numero");
			num = in.nextInt();
			contador++;
			jugador=1;
			System.out.println(contador+" "+contador2);
			pintaArray1(array,array2,array3,num);


		}
		
		while(sw!=true || sw!=false) {
			/*switch(num) {
				
				case 1,2,3:
					pintaArray1(array,array2,array3,num);
					break;
				case 4,5,6:
					pintaArray1(array,array2,array3,num);
					break;
				case 7,8,9:
					pintaArray1(array,array2,array3,num);
					break;
					
			}*/
			
			
			if(jugador==1&&contador==1) 
			{
				System.out.println("Le toca al jugador 2");
				sw=true;
				System.out.println("Elige un numero");
				num = in.nextInt();
				contador2++;
				jugador=2;
				System.out.println(contador+" "+contador2);
				pintaArray1(array,array2,array3,num);

			}
			
			if(jugador==1&&contador==2) 
			{
				System.out.println("Le toca al jugador 2");
				sw=true;
				System.out.println("Elige un numero");
				num = in.nextInt();
				contador2++;
				jugador=2;
				System.out.println(contador+" "+contador2);
				pintaArray1(array,array2,array3,num);


			}
			if(jugador==1&&contador==3) 
			{
				System.out.println("Le toca al jugador 2");
				sw=true;
				System.out.println("Elige un numero");
				num = in.nextInt();
				contador2++;
				jugador=2;
				System.out.println(contador+" "+contador2);
				pintaArray1(array,array2,array3,num);

			}
			if(jugador==2&&contador2==2) 
			{
				System.out.println("Le toca al jugador 1");
				sw=false;
				System.out.println("Elige un numero");
				num = in.nextInt();
				contador++;
				jugador=1;
				System.out.println(contador+" "+contador2);
				pintaArray1(array,array2,array3,num);

			}
			if(jugador==2&&contador2==3) 
			{
				System.out.println("Le toca al jugador 1");
				sw=false;
				System.out.println("Elige un numero");
				num = in.nextInt();
				contador++;
				jugador=1;
				System.out.println(contador+" "+contador2);
				pintaArray1(array,array2,array3,num);

			}
			
			if(array[0]==0&&array[1]==0&&array[2]==0&&jugador==1) {
				sw=true;
			}else if(array2[0]==0&&array2[1]==0&&array2[2]==0&&jugador==1) {
				sw=true;
			}else if(array3[0]==0&&array3[1]==0&&array3[2]==0&&jugador==1) {
				sw=true;
			}
			
			if(array[0]==0&&array[1]==0&&array[2]==0&&jugador==2) {
				sw=false;
			}else if(array2[0]==0&&array2[1]==0&&array2[2]==0&&jugador==2) {
				sw=false;
			}else if(array3[0]==0&&array3[1]==0&&array3[2]==0&&jugador==2) {
				sw=false;
			}
			if(sw) {
				System.out.println("Jugador 1 gana");
				break;
			}else {
				System.out.println("Jugador 2 gana");
			}
			
		}
		


	}
	public static void pintaArray2() {
		int [] array1 = {1,2,3};
		int [] array2 = {4,5,6};
		int [] array3 = {7,8,9};
		
		
		muestraDatos();

		
		for (int i = 0; i < array1.length; i++) {
			System.out.print("| "+array1[i]);
			System.out.print(" ");
		}
		System.out.println("|");
		muestraDatos();
	
		for (int i = 0; i < array2.length; i++) {
			System.out.print("| "+array2[i]);
			System.out.print(" ");
		}
		System.out.println("|");
		
		muestraDatos();
		
		for (int i = 0; i < array3.length; i++) {
			System.out.print("| "+array3[i]);
			System.out.print(" ");
		}
		System.out.println("|");
		muestraDatos();
	}
	
	

	
}
