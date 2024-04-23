package components;

import java.util.Scanner;

public class MatchRandomNumber {
    int input = 0;
    int number;
    int min = 0;
    int max = 0;
    boolean isMatch = false;
    
    Scanner scanner = new Scanner(System.in);

    public void setRandomNumber() {
       
        number = new RandomNumber(min,max).getRandomNumber();
    }

    public void setMinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setNumberToMatch(){
       input = scanner.nextInt();
    }

    public int getRandomNumber() {

        return number;
    }

    private void isMatchedNumber(boolean isMatch){
        this.isMatch = isMatch;
    }

    public boolean isMatchedNumber() {
        return isMatch;
    }

    public void handleMatchRandomNumber(){

        if (number == input) {
            isMatchedNumber(true);
            System.out.println("Parabens você acertou! o número foi: " + number);            
        }
        else if (input < min || input > max) {
            isMatchedNumber(false);
           System.out.println("Digite um número entre " + min + " e " + max);
        }
        else{ 
            isMatchedNumber(false);
            System.out.println("Não deu, tente novamente! o número foi: " + number);
        }
        
        if(isMatch == true){
            scanner.close();
        }
        
    }
               
}
