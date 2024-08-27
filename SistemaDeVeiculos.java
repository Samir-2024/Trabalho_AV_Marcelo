import java.util.Scanner;

public class SistemaDeVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // CARRO
        System.out.println("Insira as informações do carro:");
        System.out.print("Nome: ");
        String nomeCarro = scanner.nextLine();
        System.out.print("Placa: ");
        String placaCarro = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Número de Portas: ");
        int numeroPortas = scanner.nextInt();
        scanner.nextLine(); 

        Carro carro = new Carro(nomeCarro, placaCarro, anoCarro, numeroPortas);
        // MOTO
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

        // EXIBIR INFOS
        System.out.println("\nInformações do carro:");
        System.out.println(carro);

        System.out.println("\nInformações da moto:");
        System.out.println(moto);

        scanner.close();
    }
}
