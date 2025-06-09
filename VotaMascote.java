package fefefifi;

import java.util.Scanner;

public class VotaMascote {
''
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package fefefifi;

		import java.util.ArrayList;
		import java.util.Scanner;

		import static java.lang.String.valueOf;

		public class VotaMascote {
		   
			public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String[][] mascote = {
		                {"mascote1 ", "0"},
		                {"mascote2 ", "0"},
		                {"mascote3 ", "0"},
		                {"mascote4 ", "0"},
		                {"mascote5 ", "0"},
		        };
		        int votototal=0;


		        int opcao = 0;
		        String nome = ".";
		        while (true) {
		            System.out.println("Bem vindo, escolha um mascote");
		            System.out.print("Qual é seu nome? ");
		            nome = sc.next();


		            int voto_mascote1 = Integer.parseInt(mascote[0][1]);
		            int voto_mascote2 = Integer.parseInt(mascote[1][1]);
		            int voto_mascote3 = Integer.parseInt(mascote[2][1]);
		            int voto_mascote4 = Integer.parseInt(mascote[3][1]);
		            int voto_mascote5 = Integer.parseInt(mascote[4][1]);


		            do {
		                for (int i = 0; i < mascote.length; i++) {
		                    System.out.println("["+(i+1)+"] para > "+mascote[i][0]);
		                }
		                System.out.print("em quem você vai votar? Digite 0 para sair");
		                opcao = sc.nextInt()-1;
		                switch (opcao) {
		                    case 0:
		                        voto_mascote1++;
		                        votototal++;
		                        System.out.println("Voto confirmado com sucesso!");
		                        break;
		                        case 1:
		                            voto_mascote2++;
		                            votototal++;
		                            System.out.println("Voto confirmado com sucesso!");
		                            break;
		                            case 2:
		                                voto_mascote3++;
		                                votototal++;
		                                System.out.println("Voto confirmado com sucesso!");
		                                break;
		                                case 3:
		                                    voto_mascote4++;
		                                    votototal++;
		                                    System.out.println("Voto confirmado com sucesso!");
		                                    break;
		                                    case 4:
		                                        voto_mascote5++;
		                                        votototal++;
		                                        System.out.println("Voto confirmado com sucesso!");
		                                        break;
		                                        case 5:
		                                            System.out.println("Erro...");
		                                            break;



		                }

		                mascote[0][1]= String.valueOf((voto_mascote1*100)/votototal);
		                mascote[1][1]= String.valueOf((voto_mascote2*100)/votototal);
		                mascote[2][1]= String.valueOf((voto_mascote3*100)/votototal);
		                mascote[3][1]= String.valueOf((voto_mascote4*100)/votototal);
		                mascote[4][1]= String.valueOf((voto_mascote5*100)/votototal);

		            } while (opcao != -1);
		            System.out.println("Outra pessoa vai votar? digite 0 para sair e 1 para continuar");
		            int opcao2 = sc.nextInt();
		            if (opcao2 == 1) {
		                System.out.println("Continando");
		            }else if (opcao2 == 0) {
		                System.out.println("Saiindo");
		                break;
		            }else {
		                System.out.println("Erro...");
		            }
		        }

		        System.out.println("Quantidade de voto total: " + votototal);
		        System.out.println("");


		        for (int i =0; i<mascote.length; i++) {
		            for (int j = 0; j < mascote[i].length; j++) {
		                System.out.println(mascote[i][j]+"%");

		            }
		        }
		        sc.close();
       
	}

}
