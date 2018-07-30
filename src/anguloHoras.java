import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * A lógica utilizada divide o relógio em 3 partes, na primeira parte que se situa entre os minutos 0 e 15,
 * o valor de cada minuto é considerado 3º, na segunda entre 15 e 30 é considerado 9º,
 * e na última parte entre 30 e 60 cada minuto é considerado como 6º.
 */

public class anguloHoras {

	public long retornaAnguloRelogio(GregorianCalendar horario)
	{			
		long angulo = 0;
		//Captura o valor do minuto.
		int minuto = horario.get(Calendar.MINUTE);	
		//Captura o valor de hora no formato 12;
		int hora = horario.get(Calendar.HOUR);		

		// Transforma o valor de horas para minutos, se a hora for 3, passará a ser 15.
		hora *= 5;		
		
		/*
		 * Utililiza-se o valor de horas transformado como referência do ponto inicial do calculo.
		 * Onde por exemplo, se a hora for 3:14, o ponteiro de horas transformado terá o valor de 15,
		 * Entrando no loop a estrutura condicional verificará qual o valor do ponteiro e adicionará
		 * o valor equivalente ao angulo, toda volta de loop é adicionado o valor de 1 ao valor de hora,
		 * e quando a hora chega a 60, a hora passa a ser 0, e continuado o loop até que seja igual a 14.
		 */
		
		while(hora != minuto)  
		{ 
			//Se o ponteiro de hora estiver na primeira parte, é adicinado 3 ao angulo.
			if(hora < 15) 
			{ 
				angulo += 3;
			} 	
			//Se o ponteiro de hora estiver na segunda parte, é adicinado 9 ao angulo.
			else if(hora < 30) 
			{ 
				angulo += 9;
			}	
			//Se o ponteiro de hora estiver na terceira parte, é adicinado 6 ao angulo.
			else	
			{ 			
				angulo += 6;			
			} 			
			
			//Adiciona 1 minuto ao ponteiro						
			hora++;
			
			//Quando o ponteiro chega a 60, ele passar a ser 0, possibilitando a volta completa no relógio.
			
			if(hora==60)
			{
				hora=0;	
			}
		}
		return angulo;		
	}		
}




