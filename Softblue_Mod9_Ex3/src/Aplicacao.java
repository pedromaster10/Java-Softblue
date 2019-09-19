import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Aplicacao {

	public static void main(String[] args) {
		
		Aplicacao a = new Aplicacao();
		a.calculaAnos("19/05/1955");
		a.calculaSegundos();

	}
	
	public void calculaAnos(String dataNascimento) 
{
		LocalDate d1 = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate d2 = LocalDate.now();
		
		Period p = Period.between(d1, d2);
		
		System.out.println("Anos: " + p.getYears());
		System.out.println("Meses: " + p.getMonths());
		System.out.println("Dias: " + p.getDays());
}

	public void calculaSegundos() 
	{
		LocalTime hojeCedo = LocalTime.parse("03:00");
		
		LocalTime agora = LocalTime.now();
		
		Duration d = Duration.between(hojeCedo, agora);
		
		System.out.println("Passaram-se "+ d.getSeconds() + " segundos");
	}
}

/* RESPOSTA DO PROFESSOR
 * import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;


public class Aplicacao {

	public static void main(String[] args)  {

		periodSinceJamesGoslingBirthday();
		durationSince3AM();
	}
	
	// Calcula o tempo decorrido desde o nascimento de James Gosling.
	private static void periodSinceJamesGoslingBirthday() {
		// Data que representa o nascimento de James Gosling
		LocalDate birthday = LocalDate.parse("1955-05-19");
		
		// Data de hoje
		LocalDate today = LocalDate.now();
		
		// Período entre as datas.
		Period period = Period.between(birthday, today);
		
		// Exibição na tela.
		System.out.println(String.format("%d anos, %d meses e %d dias", period.getYears(), period.getMonths(), period.getDays()));
	}
	
	// Calcula o tempo decorrido em segundos desde às 3h da manhã de hoje.
	private static void durationSince3AM() {
		// Objeto que representa às 3h.
		LocalTime earlier = LocalTime.parse("03:00");
		
		// Objeto que representa a hora atual.
		LocalTime now = LocalTime.now();
		
		// Intervalo na linha do tempo.
		Duration duration = Duration.between(earlier, now);
		
		// Exibição na tela.
		System.out.println(String.format("%d segundos", duration.getSeconds()));
	}
}
*/
