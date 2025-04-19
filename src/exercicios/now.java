package exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class now {

	public static void main(String[] args) {
		
	/*LocalDateTime agora = LocalDateTime.now();
		System.out.println("Data e hora atual: " + agora);
		*/
		
	/*LocalDateTime fivedays = LocalDateTime.now().plusDays(5);
	System.out.println(fivedays);
	*/
		
	/*LocalDateTime subhours = LocalDateTime.now().minusHours(2);
	System.out.println(subhours);
	*/
		
	//SimpleDateFormat sdf = new SimpleDateFormat();
	
	/*LocalDateTime december = LocalDateTime.of(2025, 12, 25, 20, 30);	
	System.out.println(december);
	*/
		
		/* // Data e hora atual
        LocalDateTime agora = LocalDateTime.now();
        // Data futura (exemplo: 1º de janeiro de 2030 às 10h)
        LocalDateTime futura = LocalDateTime.of(2030, 1, 1, 10, 0);
        // Verifica se a data futura é depois da atual
        boolean isDepois = futura.isAfter(agora);
        // Exibe o resultado
        System.out.println("A data futura é depois da atual? " + isDepois);
	    */
		
		/*LocalDateTime agora = LocalDateTime.now();	
		DateTimeFormatter dias = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatado = agora.format(dias);
		System.out.println(formatado);
		*/
		
		/*LocalDateTime now = LocalDateTime.now();	
		DateTimeFormatter days = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formated = now.format(days);
		System.out.println(formated);
		*/
	}	
}
