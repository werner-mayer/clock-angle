import java.util.Calendar;
import java.util.GregorianCalendar;

//Classe utilizada para testar a lógica de forma rápida, onde são passadas todas as possibilidades de hora

public class testes {
	
	public static void main(String[] args) {
		
		GregorianCalendar horario = new GregorianCalendar();
		
		anguloHoras h = new anguloHoras();

		for (int hora = 0; hora < 12; hora++)
		{
			for(int minuto = 0; minuto < 60; minuto++)
			{			
				horario.set(Calendar.HOUR, hora);
				horario.set(Calendar.MINUTE, minuto);
				System.out.println(hora + ":"+ minuto + " : " + h.retornaAnguloRelogio(horario)+"º");	
			}
		}
		
	}

}
