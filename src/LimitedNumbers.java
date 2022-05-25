
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        while(true){
            int userInput = scanner.nextInt();
            if(userInput < 0 ){
                break;
            }
            intList.add(userInput);
        }
        intList.stream().filter(s -> s >= 1 && s <= 5).forEach(s -> System.out.println(s));
    }
}
