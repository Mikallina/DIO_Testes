import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
        System.out.print("Qual a distância em quilômetros: ");
        double distanciaServidores = scanner.nextDouble();

        System.out.print("Qual a velocidade do plano de internet (em Mbps): ");
        double velocidadePlano = scanner.nextDouble();

        // Calcular a velocidade de download estimada
        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        // Apresentar o resultado
        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

        scanner.close();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        // Fórmula para calcular a velocidade de download estimada
        double velocidadeDownloadEstimada = velocidadePlano / (1 + (distanciaServidores / 100));

        // Verificar se a velocidade estimada é maior do que a velocidade do plano e limitá-la, se necessário
        if (velocidadeDownloadEstimada > velocidadePlano) {
            return velocidadePlano;
        }

        return velocidadeDownloadEstimada;
    }
}