package components;

import java.util.Scanner;

public class MatchRandomNumber {
    int input; // Armazena o Palpite inserido pelo jogador
    int RandomNumber; // Armazena o Número aleatório gerado
    int min = 0; // Armazena o Valor mínimo para o número aleatório
    int max = 0; // Armazena o Valor máximo para o número aleatório
    boolean isMatch = false; // Indica se o palpite do jogador acertou

    Scanner scanner = new Scanner(System.in);//abre o input para o usuário digitar o valor.

    public void setRandomNumber() {
        // Gera um novo número aleatório dentro do intervalo especificado e retorna o número gerado dentro da variável.
        RandomNumber = new RandomNumber(min, max).getRandomNumber();
    }
    //método para definir o valor minimo e máximo.
    public void setMinMax(int min, int max) {
        // armazena o valor vindo do método nas variáveis locais min e max.
        this.min = min; 
        this.max = max;
    }

    public void setNumberToMatch() {
        // Lê o palpite do jogador
        input = scanner.nextInt();// Scanner para pegar o valor inteiro.
     
    }
    //  método que define se o palpite acertou ou não
    private void isMatchedNumber(boolean isMatch) {
        this.isMatch = isMatch; // define a variável isMatch como verdadeira ou falsa;
    }

    // método que retorna a variável isMatch como verdadeira ou falsa
    public boolean isMatchedNumber() {
        return isMatch; // Retorna se o palpite acertou ou não
    }

    // método que faz a verificação e imprime mensagens condicionais referente  ao acerto do usuário.
    public void handleMatchingRandomNumber() {
        // Verifica se o palpite acertou ou não.
        if (RandomNumber == input) {
            isMatchedNumber(true);
            System.out.println("Parabéns! Você acertou. O número era: " + RandomNumber);
        } 
        // Verifica se o palpite não está dentro do intervalo válido e exibe a mensagem
        else if (input < min || input > max) {
       
            System.out.println("Digite um número entre " + min + " e " + max);
        } 
        // Verifica se o palpite foi próximo do valor aleatorio e exibe a mensagem
        else if(input + 1 == RandomNumber || input - 1 == RandomNumber){
            System.out.println("Passou perto! tente de novo, o número era: " + RandomNumber);
        }
        // Verifica se, em ultimo caso, o usuário não acertou o palpite e exibe a mensagem
        else {
            System.out.println("Não acertou. Tente novamente! O número era: " + RandomNumber);
        }


        // Verifica se a variavel isMatch é verdadeira ou não e fecha o scanner.
        if (isMatch) {
            scanner.close(); // Fecha o scanner quando o jogo termina
        }
    }

    // método que exibe uma mensagem referente ao numero de tentativas do usuário.
    public void displayMessage(int attempts){
        System.out.println("Você terminou com " + attempts + " tentativas.");

        if(attempts == 1){
            System.out.println("Nossa conseguiu rápido!");
        }
        else if(attempts >= 2 && attempts <= 3){
            System.out.println("Muito bom! conseguiu em poucas tentativas.");
        }
        else{
            System.out.println("Demorou mas conseguiu!");
        }
    }
}
