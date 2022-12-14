package Pratice_Data_Struture;
import java.util.*;

public class Robo {
	public static void main(String args[]) {
		while (true) {
			  {
				{
					Scanner sc = new Scanner(System.in);
					System.out.println("Me pergunte algo:-");
					String User = sc.nextLine();

					if (User.equals("Ola!") || User.equals("ola!") || User.equals("Ola") || User.equals("ola") || User.equals("Oi") || User.equals("oi") || User.equals("Oi!") || User.equals("oi!")) {
						System.out.println("Você: " + User);
						System.out.println("Robo Marciano: " + "Olá!");
					}

					else if (User.equals("Como vai?") || User.equals("como vai?") || User.equals("Tudo bem?") || User.equals("tudo bem?")) {
						System.out.println("Você: " + User);
						System.out.println("Robo Marciano: " + "Comigo está tudo bem. Obrigado por perguntar.");
					}
					
					else if (User.equals("Quem e voce?") || User.equals("quem e voce?") || User.equals("Quem e vc?") || User.equals("quem e vc?")) {
						System.out.println("Você: " + User);
						System.out.println("Robo Marciano: " + "Eu sou um Robo, simples assim...");
					}

					else if (User.equals("Qual sua idade?") || User.equals("qual sua idade?")|| User.equals("Qual a sua idade?")|| User.equals("qual a sua idade?")) {
						System.out.println("Você: " + User);
						System.out.println("Robo Marciano: " + "Eu sou bem mais novo que vc.");
					}

					else if (User.equals("")) {
						System.out.println("Você: " + User);
						System.out.println("Robo Marciano: " + "Se não for perguntar, Não me incomode");
					}

					else if (User.equals("Vamos ser amigos?") || User.equals("vamos ser amigos?")) {
						System.out.println("Você: " + User);
						System.out.println("Robo Marciano: " + "Nós já somos amigos.");
					}

					else if (User.equals("me conte uma piada") || User.equals("Me conte uma piada")) {
						System.out.println("Você: " + User);
						System.out.println("Robo Marciano: " + "Você sabe o que houve com o pintinho que nasceu sem cú?"
								+ " Deu um peido e explodiu... KKKKKK");
					}

					else if (User.equals("Some") || User.equals("some")) {
						System.out.println("Você: " + User);
						System.out.println("Primeiro número = ");
						int num1 = sc.nextInt();
						System.out.println("Segundo número = ");
						int num2 = sc.nextInt();
						System.out.println("Robo Marciano: " + "Essa eu sei! " + (num1 + num2));
					}

					else if (User.equals("Divida") || User.equals("divida")) {
						System.out.println("Você: " + User);
						System.out.println("Primeiro número = ");
						int num1 = sc.nextInt();
						System.out.println("Segundo número = ");
						int num2 = sc.nextInt();
						System.out.println("Robo Marciano: " + "Essa eu sei! " + (num1 / num2));
					}

					else if (User.equals("Subtraia") || User.equals("subtraia")) {
						System.out.println("Você: " + User);
						System.out.println("Primeiro número = ");
						int num1 = sc.nextInt();
						System.out.println("Segundo número = ");
						int num2 = sc.nextInt();
						System.out.println("Robo Marciano: " + "Essa eu sei! " + (num1 - num2));
					}

					else if (User.equals("Multiplique") || User.equals("multiplique")) {
						System.out.println("Você: " + User);
						System.out.println("Primeiro número = ");
						int num1 = sc.nextInt();
						System.out.println("Segundo número = ");
						int num2 = sc.nextInt();
						System.out.println("Robo Marciano: " + "Essa eu sei! " + (num1 * num2));
					}
					
					else if (User.equals("Fim") || User.equals("fim") || User.equals("sair") || User.equals("Sair")|| User.equals("Exit") || User.equals("exit")) {
						System.exit(0);
					}
				}
			}
		}
	}
}