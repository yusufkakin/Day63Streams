import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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

            System.out.println("Type n for average of negative numbers, p for positive numbers");
            String userInput2 = scanner.nextLine();
            if(userInput2.equals("n")){
                double averageNegative = inputs
                        .stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average is: " + averageNegative);
            }else if(userInput2.equals("p")){
                double averagePositive = inputs
                        .stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average is: " + averagePositive);
            }
        }

    }

