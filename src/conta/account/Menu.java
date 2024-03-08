package conta.account;

import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		// TESTES DE MÉTODOS DA CONTA
		
		// EX CONTA CORRENTE
		ContaCorrente cc1 = new ContaCorrente(1, 321, 1, "Eric Alejandro", 0.0f, 3000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
        // EX CONTA POUPANÇA
		ContaPoupanca cp1 = new ContaPoupanca(2, 321, 2, "Lucimara Alves", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("                BANCO DO JAVA S/A                     ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("             1 - Criar uma conta                      ");
			System.out.println("             2 - Listar todas as Contas               ");
			System.out.println("             3 - Buscar Conta por Numero              ");
			System.out.println("             4 - Atualizar Dados da Conta             ");
			System.out.println("             5 - Apagar Conta                         ");
			System.out.println("             6 - Sacar                                ");
			System.out.println("             7 - Depositar                            ");
			System.out.println("             8 - Transferir valores entre Contas      ");
			System.out.println("             9 - Sair                                 ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAgradecemos sua visita! \nBanco do Java");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1: 
					System.out.println(Cores.TEXT_WHITE_BOLD +  "Criar conta\n\n");
					break;            
					                  
				case 2:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas\n\n");
					break;             
					                   
				case 3:                
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta - por número\n\n");
					break;            
				                      
				case 4:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta\n\n");
					break;        
				                  
				case 5:           
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar conta\n\n");					
					break;         
				                   
				case 6:            
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");					
					break;             
				                       
				case 7:                
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");					
					break;            
				                      
				case 8:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas\n\n");					
					break;             
					                   
				default:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção inválida!");
					break;
					
					
			}
		}
		
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Anne Karolina A.C");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/IKaRu127");
		System.out.println("*********************************************************");
	}

}
