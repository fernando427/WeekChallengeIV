import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Escolha o veículo e defina as características dele.

        System.out.println("Digite o número do veículo que deseja:");
        System.out.println("1 - Moto");
        System.out.println("2 - Bicicleta");
        System.out.println("3 - Charrete");
        System.out.println("4 - Caminhão");
        System.out.println("5 - Carro");
        System.out.print("Opção: ");
        int op = scanner.nextInt();


        try {

            switch (op) {
                case 1 -> {
                    Veiculo moto = criarMoto(scanner);
                    System.out.println(moto);
                }
                case 2 -> {
                    Veiculo bicicleta = criarBicicleta(scanner);
                    System.out.println(bicicleta);
                }
                case 3 -> {
                    Veiculo charrete = criarCharrete(scanner);
                    System.out.println(charrete);
                }
                case 4 -> {
                    Veiculo caminhao = criarCaminhao(scanner);
                    System.out.println(caminhao);
                }
                case 5 -> {
                    Veiculo carro = criarCarro(scanner);
                    System.out.println(carro);
                }
                default -> {
                    System.out.println("Opção inválida.");
                    return;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um valor válido.");
        }

    }

    // Métodos para a criação dos veículos.
    private static Veiculo criarMoto(Scanner scanner) {

        boolean motor = obterEntradaSimOuNao(scanner, "Motor (Sim/Não): ");

        boolean volante = obterEntradaSimOuNao(scanner, "Volante (Sim/Não): ");

        System.out.print("Quantidade de passageiros: ");
        int qntPassageiros = scanner.nextInt();

        System.out.print("Quantidade de portas: ");
        int qntPortas = scanner.nextInt();

        System.out.print("Quantidade de rodas: ");
        int qntRodas = scanner.nextInt();

        boolean carga = obterEntradaSimOuNao(scanner, "É de carga (Sim/Não): ");

        System.out.print("Capacidade de carga: ");
        double capacidadeCarga = scanner.nextDouble();

        boolean partidaEletrica = obterEntradaSimOuNao(scanner, "Tem partida elétrica (Sim/Não): ");

        Combustivel combustivelMoto = obterCombustivel(scanner, "Qual o combustível para o veículo? (Gasolina/Alcool/Diesel/Eletricidade/Humano/Animal): ");

        return new Moto(motor, volante, qntPassageiros, qntPortas, qntRodas, carga, capacidadeCarga, combustivelMoto, partidaEletrica);
    }

    private static Veiculo criarBicicleta(Scanner scanner) {

        boolean motor = obterEntradaSimOuNao(scanner, "Motor (Sim/Não): ");

        boolean volante = obterEntradaSimOuNao(scanner, "Volante (Sim/Não): ");

        System.out.print("Quantidade de passageiros: ");
        int qntPassageiros = scanner.nextInt();

        System.out.print("Quantidade de portas: ");
        int qntPortas = scanner.nextInt();

        System.out.print("Quantidade de rodas: ");
        int qntRodas = scanner.nextInt();

        boolean carga = obterEntradaSimOuNao(scanner, "É de carga (Sim/Não): ");

        System.out.print("Capacidade de carga: ");
        double capacidadeCarga = scanner.nextDouble();

        boolean ehEletrica = obterEntradaSimOuNao(scanner, "É elétrica (Sim/Não): ");

        boolean temBagageiro = obterEntradaSimOuNao(scanner, "Tem bagageiro (Sim/Não): ");

        Combustivel combustivelBicicleta = obterCombustivel(scanner, "Qual o combustível para o veículo? (Gasolina/Alcool/Diesel/Eletricidade/Humano/Animal): ");

        return new Bicicleta(motor, volante, qntPassageiros, qntPortas, qntRodas, carga, capacidadeCarga, combustivelBicicleta, ehEletrica, temBagageiro);
    }

    private static Veiculo criarCharrete(Scanner scanner) {

        boolean motor = obterEntradaSimOuNao(scanner, "Motor (Sim/Não): ");

        boolean volante = obterEntradaSimOuNao(scanner, "Volante (Sim/Não): ");

        System.out.print("Quantidade de passageiros: ");
        int qntPassageiros = scanner.nextInt();

        System.out.print("Quantidade de portas: ");
        int qntPortas = scanner.nextInt();

        System.out.print("Quantidade de rodas: ");
        int qntRodas = scanner.nextInt();

        boolean carga = obterEntradaSimOuNao(scanner, "É de carga (Sim/Não): ");

        System.out.print("Capacidade de carga: ");
        double capacidadeCarga = scanner.nextDouble();

        Combustivel combustivelCharrete = obterCombustivel(scanner, "Qual o combustível para o veículo? (Gasolina/Alcool/Diesel/Eletricidade/Humano/Animal): ");

        return new Charrete(motor, volante, qntPassageiros, qntPortas, qntRodas, carga, capacidadeCarga, combustivelCharrete);
    }

    private static Veiculo criarCaminhao(Scanner scanner) {

        boolean motor = obterEntradaSimOuNao(scanner, "Motor (Sim/Não): ");

        boolean volante = obterEntradaSimOuNao(scanner, "Volante (Sim/Não): ");

        System.out.print("Quantidade de passageiros: ");
        int qntPassageiros = scanner.nextInt();

        System.out.print("Quantidade de portas: ");
        int qntPortas = scanner.nextInt();

        System.out.print("Quantidade de rodas: ");
        int qntRodas = scanner.nextInt();

        boolean carga = obterEntradaSimOuNao(scanner, "É de carga (Sim/Não): ");

        System.out.print("Capacidade de carga: ");
        double capacidadeCarga = scanner.nextDouble();

        System.out.print("Quantidade de eixos: ");
        int qntEixos = scanner.nextInt();

        Combustivel combustivelCaminhao = obterCombustivel(scanner, "Qual o combustível para o veículo? (Gasolina/Alcool/Diesel/Eletricidade/Humano/Animal): ");

        return new Caminhao(motor, volante, qntPassageiros, qntPortas, qntRodas, carga, capacidadeCarga, combustivelCaminhao, qntEixos);
    }

    private static Veiculo criarCarro(Scanner scanner) {

        boolean motor = obterEntradaSimOuNao(scanner, "Motor (Sim/Não): ");

        boolean volante = obterEntradaSimOuNao(scanner, "Volante (Sim/Não): ");

        System.out.print("Quantidade de passageiros: ");
        int qntPassageiros = scanner.nextInt();

        System.out.print("Quantidade de portas: ");
        int qntPortas = scanner.nextInt();

        System.out.print("Quantidade de rodas: ");
        int qntRodas = scanner.nextInt();

        boolean carga = obterEntradaSimOuNao(scanner, "É de carga (Sim/Não): ");

        System.out.print("Capacidade de carga: ");
        double capacidadeCarga = scanner.nextDouble();

        boolean temArcondicionado = obterEntradaSimOuNao(scanner, "Tem arcondicionado (Sim/Não): ");

        boolean temRadio = obterEntradaSimOuNao(scanner, "Tem radio (Sim/Não): ");

        Combustivel combustivelCarro = obterCombustivel(scanner, "Qual o combustível para o veículo? (Gasolina/Alcool/Diesel/Eletricidade/Humano/Animal): ");

        return new Carro(motor, volante, qntPassageiros, qntPortas, qntRodas, carga, capacidadeCarga, combustivelCarro, temArcondicionado, temRadio);
    }

    // Método para validação no scanner dos atributos booleanos.
    private static boolean obterEntradaSimOuNao(Scanner scanner, String mensagem) {
        boolean entradaValida = false;
        boolean resultado = false;

        while (!entradaValida) {
            System.out.print(mensagem);
            String input = scanner.next();

            if (input.equalsIgnoreCase("Sim")) {
                resultado = true;
                entradaValida = true;
            } else if (input.equalsIgnoreCase("Não")) {
                resultado = false;
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite 'Sim' ou 'Não'.");
            }
        }

        return resultado;
    }

    // Método para obtenção do tipo de combustível. (Se não for digitado corretamente irá atribuir 'Desconhecido').
    private static Combustivel obterCombustivel(Scanner scanner, String mensagem) {
        Combustivel resultado;


        System.out.print(mensagem);
        String input = scanner.next();

        if (input.equalsIgnoreCase("Gasolina")) {
            return resultado = new Combustivel(true, false, false, false, false, false);
        } else if (input.equalsIgnoreCase("Alcool")) {
            return resultado = new Combustivel(false, true, false, false, false, false);
        } else if (input.equalsIgnoreCase("Diesel")) {
            return resultado = new Combustivel(false, false, true, false, false, false);
        } else if (input.equalsIgnoreCase("Eletricidade")) {
            return resultado = new Combustivel(false, false, false, true, false, false);
        } else if (input.equalsIgnoreCase("Humano")) {
            return resultado = new Combustivel(false, false, false, false, true, false);
        } else if (input.equalsIgnoreCase("Animal")) {
            return resultado = new Combustivel(false, false, false, false, false, true);
        } else {
            return resultado = new Combustivel(false, false, false, false, false, false);
        }

    }
}