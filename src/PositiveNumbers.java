import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        while(true){
            System.out.println("Enter a number");
            String userInput = scanner.nextLine();
            if(userInput.equals("end")){
                break;
            }
            inputs.add(Integer.valueOf(userInput));
        }

        List<Integer> theList = positive(inputs);
        System.out.println(theList);
    }
    public static List<Integer> positive(List<Integer> numbers){
        System.out.println("Here the positive integers from the list");
        return numbers
                .stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
