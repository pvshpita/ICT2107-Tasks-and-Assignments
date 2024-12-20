import java.util.*;
import java.io.*;

public class SumOfSeries {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner readInput = new Scanner(new File("input.txt"));
        PrintWriter printOutput = new PrintWriter(new File("output.txt"));

        while (readInput.hasNextInt()) {
            int n = readInput.nextInt();
            printOutput.print((n * (n + 1)) / 2 + " ");
        }

        readInput.close();
        printOutput.close();
    }
}