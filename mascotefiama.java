package fefefifi;

import java.util.Scanner;

public class mascotefiama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] mascote = {
            {"mascote1", "0"},
            {"mascote2", "0"},
            {"mascote3", "0"},
            {"mascote4", "0"},
            {"mascote5", "0"},
        };

        int[] votos = new int[5];  // Para armazenar votos reais de cada mascote
        int votototal = 0;

        while (true) {
            System.out.println("Bem vindo, escolha um mascote");
            System.out.print("Qual é seu nome? ");
            String nome = sc.next();

            int opcao = -1;

            do {
                System.out.println("Opções de mascote para votar:");
                for (int i = 0; i < mascote.length; i++) {
                    System.out.println("[" + (i + 1) + "] para > " + mascote[i][0]);
                }
                System.out.println("[0] para sair da votação");

                System.out.print("Em quem você vai votar? ");
                opcao = sc.nextInt();

                if (opcao == 0) {
                    System.out.println("Saindo da votação...");
                    break;
                } else if (opcao >= 1 && opcao <= 5) {
                    votos[opcao - 1]++;
                    votototal++;
                    System.out.println("Voto confirmado com sucesso!");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }

            } while (true);

            System.out.println("Outra pessoa vai votar? digite 1 para continuar ou 0 para sair");
            int opcao2 = sc.nextInt();

            if (opcao2 == 0) {
                System.out.println("Saindo do sistema de votação...");
                break;
            } else if (opcao2 != 1) {
                System.out.println("Opção inválida, saindo do sistema.");
                break;
            }
        }

        System.out.println("\nQuantidade total de votos: " + votototal);
        System.out.println("Porcentagem de votos por mascote:");

        for (int i = 0; i < mascote.length; i++) {
            double percentual = 0;
            if (votototal > 0) {
                percentual = (votos[i] * 100.0) / votototal;
            }
            System.out.printf("%s: %d votos (%.2f%%)\n", mascote[i][0], votos[i], percentual);
        }

        sc.close();
    }
}
