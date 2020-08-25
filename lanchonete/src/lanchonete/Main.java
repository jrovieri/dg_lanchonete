package lanchonete;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import lanchonete.lanche.Lanche;
import lanchonete.lanche.impl.Bolo;
import lanchonete.lanche.impl.Massa;
import lanchonete.lanche.impl.Sanduiche;
import lanchonete.lanche.impl.TipoDeMassa;

public class Main {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Lanchonete DG Menu");
		System.out.println("[1] Sanduíches");
		System.out.println("[2] Massas");
		System.out.println("[3] Bolo");
		
		System.out.print("Selecione a opção desejada: ");
		int opt = scanner.nextInt();
		System.out.println("------------------------------");
		
		Lanche lanche = null;
		
		if (opt == 1) {
			lanche = (Lanche) sanduiche();
		} else if (opt == 2) {
			lanche = (Lanche) massa();
		} else if (opt == 3) {
			
		} else {
			System.out.println("Escolha uma opção válida.");
			System.exit(0);
		}
		
		System.out.print("Informe a distância da entrega: ");
		lanche.setDistance(scanner.nextInt());
		
		System.out.println("Valor a ser pago: R$" + lanche.getPrice());
		System.out.println("Tempo de espera: " + lanche.getDeliveryTime() + " minutos.");
		System.out.println("Obrigado!");
	}
	
	public static void printMainMenu() {
		
	}
	
	public static Sanduiche sanduiche() {
		int index = 0;
		String ans = "";
		String[] ingredientes = new String[10];
		
		System.out.println("Lanchonete DG - Menu Sanduíches");
		System.out.println("Digite os ingredientes do seu lanche ou '0' para fechar o pedido.");
		
		while(index < 10 && !ans.equals("0")) {
			ans = (String) scanner.next();
			ingredientes[index] = ans;
			index++;
		}
		return new Sanduiche(ingredientes);
	}

	public static Massa massa() {
		Map<Integer, TipoDeMassa> tipoDeMassa = new HashMap<Integer, TipoDeMassa>();
		tipoDeMassa.put(1, TipoDeMassa.MACARRAO);
		tipoDeMassa.put(2, TipoDeMassa.LASANHA);
		tipoDeMassa.put(3, TipoDeMassa.PIZZA);
		
		System.out.println("Lanchonete DG - Menu Massa");
		
		for (Map.Entry<Integer, TipoDeMassa> e: tipoDeMassa.entrySet()) {
			System.out.println("[" + e.getKey() + "] " + e.getValue());
		}
		System.out.print("Selecione o tipo de massa desejada: ");
		int massa = scanner.nextInt();
		
		System.out.print("Digite o molho desejado: ");
		
		String molho = scanner.next();
		return new Massa(molho, tipoDeMassa.get(massa));
	}
	
	public static Bolo bolo() {
		System.out.println("Lanchonete DG - Menu Bolo");
		
		System.out.println("Informe a massa: ");
		String massa = scanner.next();
		
		System.out.println("Informe a recheio: ");
		String recheio = scanner.next();
		
		System.out.println("Informe a cobertura: ");
		String cobertura = scanner.next();
		
		return new Bolo(massa, recheio, cobertura);
	}
}
