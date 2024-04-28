import components.MatchRandomNumber;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicialização das variáveis
        int min = 1;
        int max = 10;
        int attempts = 0;

        // Criação do objeto MatchRandomNumberGame
        MatchRandomNumber MatchRandomNumberGame = new MatchRandomNumber();
       
        MatchRandomNumberGame.setMinMax(min, max);// definição dos valores min e max no objeto.

        // Mensagem de boas-vindas
        System.out.println("Tente adivinhar o número aleatório!");
        System.out.println("Digite um número entre " + min + " e " + max + " e veja se acertou.");

        // Loop principal do jogo - enquanto o método retornar falso o jogo continua até que retorne verdadeiro.
        while (!MatchRandomNumberGame.isMatchedNumber()) { // método para verificar se o número é igual ao do usuario , retornado verdadeiro ou falso.
            MatchRandomNumberGame.setRandomNumber();//Método para gerar o número aleatório com base nos valores informados em min e max. 
            MatchRandomNumberGame.setNumberToMatch(); // Método para o usuario informar o o palpite, ou seja, o número.
            MatchRandomNumberGame.handleMatchingRandomNumber(); // Método para verificar se os números são iguais e mostrar mensagem se acertou ou não.
            attempts += 1; //contador de tentativas;
        }

        // Mensagem de encerramento - Verifica se o método retornar verdadeiro e executa o bloco de código.
        if (MatchRandomNumberGame.isMatchedNumber()) {
            MatchRandomNumberGame.displayMessage(attempts); // mostra o número de tentativas após acerta o número aleatório.
        } 
    }
}
