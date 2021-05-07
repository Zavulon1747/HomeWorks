package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPi {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the number that will be the number of PI after the dot (from 0 to 15): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        NumberPi numberPi = new NumberPi();
        numberPi.returnPiWithNumberAfterDot(x);
    }

    public void returnPiWithNumberAfterDot(int x) {
        double scale = Math.pow(10, x);
        double result = Math.ceil(Math.PI*scale)/scale;
        System.out.println("Number Pi with "+x+" numbers after dot: "+result);
    }
}
