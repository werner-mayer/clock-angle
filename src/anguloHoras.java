import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * A l�gica utilizada divide o rel�gio em 3 partes, na primeira parte que se situa entre os minutos 0 e 15,
 * o valor de cada minuto � considerado 3�, na segunda entre 15 e 30 � considerado 9�,
 * e na �ltima parte entre 30 e 60 cada minuto � considerado como 6�.
 */

public class anguloHoras {

	public long retornaAnguloRelogio(GregorianCalendar horario)
	{			
		long angulo = 0;
		//Captura o valor do minuto.
		int minuto = horario.get(Calendar.MINUTE);	
		//Captura o valor de hora no formato 12;
		int hora = horario.get(Calendar.HOUR);		

		// Transforma o valor de horas para minutos, se a hora for 3, passar� a ser 15.
		hora *= 5;		
		
		/*
		 * Utililiza-se o valor de horas transformado como refer�ncia do ponto inicial do calculo.
		 * Onde por exemplo, se a hora for 3:14, o ponteiro de horas transformado ter� o valor de 15,
		 * Entrando no loop a estrutura condicional verificar� qual o valor do ponteiro e adicionar�
		 * o valor equivalente ao angulo, toda volta de loop � adicionado o valor de 1 ao valor de hora,
		 * e quando a hora chega a 60, a hora passa a ser 0, e continuado o loop at� que seja igual a 14.
		 */
		
		while(hora != minuto)  
		{ 
			//Se o ponteiro de hora estiver na primeira parte, � adicinado 3 ao angulo.
			if(hora < 15) 
			{ 
				angulo += 3;
			} 	
			//Se o ponteiro de hora estiver na segunda parte, � adicinado 9 ao angulo.
			else if(hora < 30) 
			{ 
				angulo += 9;
			}	
			//Se o ponteiro de hora estiver na terceira parte, � adicinado 6 ao angulo.
			else	
			{ 			
				angulo += 6;			
			} 			
			
			//Adiciona 1 minuto ao ponteiro						
			hora++;
			
			//Quando o ponteiro chega a 60, ele passar a ser 0, possibilitando a volta completa no rel�gio.
			
			if(hora==60)
			{
				hora=0;	
			}
		}
		return angulo;		
	}		
}




