package principal;

import java.util.Scanner;


public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
	
			String nome;
		    int   idade;
			double  altura ;
			char  sexo;
			
				
			System.out.print("Por favor, Digite seu nome: ");
			//leitura de dados do tipo string (conjunto de caract)
		
			nome= leia.nextLine();
			System.out.println("digite a sua idade :\n" );
			//leitura de dados do tipo string (conjunto de caract)
			
			 idade = leia.nextInt ();
			
			System.out.println("Digite a sua altura: \n");
			//leitura de dados do tipo string (conjunto de caract)
			altura = leia.nextDouble();
			
			System.out.println("Digite seu sexo (m/f: \n");
			
			sexo = leia.next().charAt(0);
			
			System.out.println("O nome digitado foi: " +nome );
			System.out.println("O idade digitada foi: " + idade );
			System.out.println("O sexo digitado foi: " +sexo );
			System.out.println("a altura digitada foi: " +altura );
			
			leia.close();

	}

}
