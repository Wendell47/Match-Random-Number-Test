
import components.MatchRandomNumber;

public class App {
    public static void main(String[] args) throws Exception {

       boolean gameMatchRandomNumberFinished=false;
        int min=20;
        int max=40;
        int attempts = 0;

        MatchRandomNumber gameMatchRandomNumber =  new MatchRandomNumber();
        gameMatchRandomNumber.setMinMax(min, max);

        System.out.println("Tente Adivinhar o número aleatório!!!!");
        System.out.println("Digite um numero entre " + min + " e " + max + " e veja se acertou. ✨" );
        
        while(gameMatchRandomNumberFinished != true){
            gameMatchRandomNumber.setRandomNumber();
            gameMatchRandomNumber.setNumberToMatch();
            gameMatchRandomNumber.handleMatchRandomNumber();
            gameMatchRandomNumberFinished = gameMatchRandomNumber.isMatchedNumber();
            attempts += 1;
           
        }
        
        if(gameMatchRandomNumberFinished){
            System.out.println("você terminou com " + attempts + " tentativas.");
        }
    }
}
    