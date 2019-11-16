package aula_travis.main;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Novo Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		System.out.println(mainMenu.getSelection() + "foi selecionada");
		System.out.println("Fim");
	}

}
