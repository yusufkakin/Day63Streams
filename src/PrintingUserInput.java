
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> info = new ArrayList<>();
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.isBlank()){
                break;
            }
            info.add(userInput);
        }
        info.stream().forEach(s -> System.out.println(s));
    }
}
