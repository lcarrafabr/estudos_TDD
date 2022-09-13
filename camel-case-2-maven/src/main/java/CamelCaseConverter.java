
public class CamelCaseConverter {

	public String converter(String nome) {

		nome = nome.toLowerCase();

		return nome.substring(0, 1).toUpperCase() + nome.substring(1);
	}

}
