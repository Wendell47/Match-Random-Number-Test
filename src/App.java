import components.MatchRandomNumber;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicialização das variáveis
        boolean gameMatchRandomNumberFinished = false;
        int min = 20;
        int max = 40;
        int attempts = 0;

        // Criação do objeto MatchRandomNumber
        MatchRandomNumber gameMatchRandomNumber = new MatchRandomNumber();
        gameMatchRandomNumber.setMinMax(min, max);

        // Mensagem de boas-vindas
        System.out.println("Tente adivinhar o número aleatório!");
        System.out.println("Digite um número entre " + min + " e " + max + " e veja se acertou.");

        // Loop principal do jogo
        while (!gameMatchRandomNumberFinished) {
            gameMatchRandomNumber.setRandomNumber();
            gameMatchRandomNumber.setNumberToMatch();
            gameMatchRandomNumber.handleMatchRandomNumber();
            gameMatchRandomNumberFinished = gameMatchRandomNumber.isMatchedNumber();
            attempts += 1;
        }

        // Mensagem de encerramento
        if (gameMatchRandomNumberFinished) {
            System.out.println("Você terminou com " + attempts + " tentativas.");
        }
    }
}
