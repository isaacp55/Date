package exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class now {

	public static void main(String[] args) {
		
	/*LocalDateTime agora = LocalDateTime.now();
		System.out.println("Data e hora atual: " + agora);
		*/
		
	/*LocalDateTime fivedays = LocalDateTime.now().plusDays(5);
	System.out.println(fivedays);
	*/
		
	LocalDateTime subhours = LocalDateTime.now().minusHours(2);
	System.out.println(subhours);
	}
}
