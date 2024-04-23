package components;

import java.util.Scanner;

public class MatchRandomNumber {
    int input; // Palpite inserido pelo jogador
    int RandomNumber; // Número aleatório gerado
    int min = 0; // Valor mínimo para o número aleatório
    int max = 0; // Valor máximo para o número aleatório
    boolean isMatch = false; // Indica se o palpite do jogador acertou

    Scanner scanner = new Scanner(System.in);

    public void setRandomNumber() {
        // Gera um novo número aleatório dentro do intervalo especificado
        RandomNumber = new RandomNumber(min, max).getRandomNumber();
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
        return RandomNumber; // Retorna o número aleatório gerado
    }

    private void isMatchedNumber(boolean isMatch) {
        this.isMatch = isMatch; // Define se o palpite acertou ou não
    }

    public boolean isMatchedNumber() {
        return isMatch; // Retorna se o palpite acertou ou não
    }


    public void handleMatchRandomNumber() {

        if (RandomNumber == input) {
            isMatchedNumber(true);
            System.out.println("Parabéns! Você acertou. O número era: " + RandomNumber);
        } 
        // Verifica se o palpite não está dentro do intervalo válido e exibe a mensagem
        else if (input < min || input > max) {
       
            System.out.println("Digite um número entre " + min + " e " + max);
        } 

        else {
         
            System.out.println("Não acertou desta vez. Tente novamente! O número era: " + RandomNumber);
        }

        if (isMatch) {
            scanner.close(); // Fecha o scanner quando o jogo termina
        }
    }

    public void displayMessage(int attempts){

        if(attempts == 1){
            System.out.println("Nossa conseguiu rápido!");
        }
        else if(attempts >= 2 && attempts <= 3){
            System.out.println("Muito bom!");
        }
        if(attempts >= 10){
            System.out.println("Demorou mas conseguiu!");
        }
    }
}
