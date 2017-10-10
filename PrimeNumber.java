/**
 * Created by HP on 10/10/2017.
 */
public class PrimeNumber {
    private static int userinput;
    PrimeNumber() {
        this.userinput = 0;
    }

    PrimeNumber(int input) {
        this.userinput=input;
    }

    public static boolean isPrime(){
        if ( userinput < 1) {
            return false;
        }
        if ( userinput > 2 && userinput%2 == 0 || userinput == 1) {
            return false;
        }
        int top = (int)Math.sqrt(userinput) + 1;
        for(int i = 3; i < top; i+=2) {
            if (userinput % i == 0) {
                return false;
            }
        }
        return true;
    }
}
