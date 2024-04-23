package components;

public class RandomNumber {
    int number;
    int min;
    int max;

    public RandomNumber(int min, int max) {
        setRandomNumber(min,max);
        
    }

    private void setRandomNumber(int min, int max) {
        number = (int) Math.round(Math.random() * (max-min) + min);
        
    }

    public int getRandomNumber() {
        
       return number;
    }
}
