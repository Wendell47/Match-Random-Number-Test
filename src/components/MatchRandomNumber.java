package components;

import java.util.Scanner;

public class MatchRandomNumber {
    int input = 0; // Palpite inserido pelo jogador
    int number; // Número aleatório gerado
    int min = 0; // Valor mínimo para o número aleatório
    int max = 0; // Valor máximo para o número aleatório
    boolean isMatch = false; // Indica se o palpite do jogador acertou

    Scanner scanner = new Scanner(System.in);

    public void setRandomNumber() {
        // Gera um novo número aleatório dentro do intervalo especificado
        number = new RandomNumber(min, max).getRandomNumber();
    }
    //metodo para definir o valor minimo e máximo.
    public void setMinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setNumberToMatch() {
        // Lê o palpite do jogador
        input = scanner.nextInt();
    }

    public int getRandomNumber() {
        return number; // Retorna o número aleatório gerado
    }

    private void isMatchedNumber(boolean isMatch) {
        this.isMatch = isMatch; // Define se o palpite acertou ou não
    }

    public boolean isMatchedNumber() {
        return isMatch; // Retorna se o palpite acertou ou não
    }

    public void handleMatchRandomNumber() {
        if (number == input) {
            isMatchedNumber(true);
            System.out.println("Parabéns! Você acertou. O número era: " + number);
        } else if (input < min || input > max) {
            isMatchedNumber(false);
            System.out.println("Digite um número entre " + min + " e " + max);
        } else {
            isMatchedNumber(false);
            System.out.println("Não acertou desta vez. Tente novamente! O número era: " + number);
        }

        if (isMatch) {
            scanner.close(); // Fecha o scanner quando o jogo termina
        }
    }
}
