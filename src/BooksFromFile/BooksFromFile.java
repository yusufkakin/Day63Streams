package BooksFromFile;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        List<Book> booksList = readBooks(userInput);

    }

    public static List<Book> readBooks(String file){
        List<Book> booksList = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 2)
                    .map(info -> new Book(info[0],
                            Integer.parseInt(info[1]),
                            Integer.parseInt(info[2]),
                            info[3]))
                    .forEach(booksList::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return booksList;
    }

}
