import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produto {

	// formatador de data
	private static final DateFormat df = DateFormat.getDateInstance();

	// nome do produto
	private String nome;

	// peso do produto
	private double peso;

	// Data de validade
	private Date dataDeValidade;

	// construtor recebe nome, peso e date de validade
	public Produto(String nome, double peso, int dia, int mes, int ano) {
		this.nome = nome;
		this.peso = peso;

		// cria um calendar e seta os componentes da data
		Calendar cl = Calendar.getInstance();
		cl.set(ano, mes - 1, dia);

		this.dataDeValidade = cl.getTime();
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Date getDataDeValidade() {
		return dataDeValidade;
	}

	// obtem a data formatada como uma String no padrão curto
	public String getFormatedData() {
		return df.format(dataDeValidade);
	}

}
