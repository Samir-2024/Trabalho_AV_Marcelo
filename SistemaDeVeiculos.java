import java.util.Scanner;
package com.company;

public class SistemaDeVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as informações do carro:");
        System.out.print("Nome: ");
        String nomeCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Número de Portas: ");
        int numeroPortas = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Carro carro = new Carro(nomeCarro, placaCarro, anoCarro, numeroPortas);

        System.out.println("\nInsira as informações da moto:");
        System.out.print("Nome: ");
        String nomeMoto = scanner.nextLine();
        System.out.print("Placa: ");
        String placaMoto = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int anoMoto = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Tipo de Freio: ");
        String tipoFreio = scanner.nextLine();

        Moto moto = new Moto(nomeMoto, placaMoto, anoMoto, tipoFreio);

        // Exibir as informações dos veículos usando instanceof
        exibirInformacoes(carro);
        exibirInformacoes(moto);

        scanner.close();
    }

    public static void exibirInformacoes(Veiculo veiculo) {
        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            System.out.println("\nInformações do carro:");
            System.out.println(carro);
        } else if (veiculo instanceof Moto) {
            Moto moto = (Moto) veiculo;
            System.out.println("\nInformações da moto:");
            System.out.println(moto);
        }
        
        // Chama o método final `descrever` que é comum para todas as subclasses
        veiculo.descrever();
    }
}
