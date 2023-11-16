package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner Leia= new Scanner(System.in);
		int opcao;
		
		while(true) {
			
			System.out.println("********************************************");
			System.out.println("                                            ");
			System.out.println("               Banco Javander               ");
			System.out.println("                                            ");
			System.out.println("********************************************");
			System.out.println("                                            ");
			System.out.println("       1-Criar Conta                        ");
			System.out.println("       2-Listar todas as Contas             ");
			System.out.println("       3-Buscar Conta por Número            ");
			System.out.println("       4-Atualizar dados da Conta           ");
			System.out.println("       5-Apagar Conta                       ");
			System.out.println("       6-Sacar                              ");
			System.out.println("       7-Depositar                          ");
			System.out.println("       5-Transferir Valores entre Contas    ");
			System.out.println("       5-Sair                               ");
			System.out.println("                                            ");
			System.out.println("********************************************");
			System.out.println("Entre com a opção Desejada:                 ");
			System.out.println("                                            ");
			
			opcao=Leia.nextInt();
			
			if (opcao==9) {
				System.out.println("\nBanco Javander- O seu Futuro começa aqui!!");
				sobre();
				Leia.close();
				System.exit(0);
			}
			switch(opcao) {
			case 1:
				System.out.println("Criar conta\n\n");
				System.out.println("Conta Criada\n\n");
			break;
			
			case 2:
				System.out.println("Listar todas as contas\n\n");
			break;
			
			case 3:
				System.out.println("Consultar dados da conta-por Número\n\n");
			break;
			
			case 4:
				System.out.println("Atualizar dados da conta\n\n");
			break;
			
			case 5:
				System.out.println("Apagar a conta\n\n");
			break;
			
			case 6:
				System.out.println("Saque\n\n");
			break;
			
			case 7:
				System.out.println("Depósito\n\n");
			break;
			
			case 8:
				System.out.println("Transfêrencia entre contas\n\n");
			break;
			
			default:
				System.out.println("Opção incorreta, tente novamente!\n\n");
			break;
			}
		}
	}

	private static void sobre() {
		
		System.out.println("*******************************************");
		System.out.println("Projeto Desenvolvido por: Jenifer Benedetti");
		System.out.println("Generation Brasil-generation@generation.org");
		System.out.println("github.com/jeniferlemos/contabancaria.git"  );
		System.out.println("*******************************************");
	}

}
