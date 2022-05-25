import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Input numbers, type \"end\" to stop");

            String userInput = scanner.nextLine();

            if(userInput.equals("end")) {
                break;
            }
            inputs.add(userInput);
        }

        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Overall average number: " + average);
    }


}
