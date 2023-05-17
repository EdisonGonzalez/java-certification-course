package operationsIO;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        try(var br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter any number between 1 and 10: ");
            /**
             * @Range(from = -1, to = 0xFFFF)
             * public int read()
             * throws java.io.IOException
             */
            var num = br.read(); // Return ASCII with int value
            System.out.println(num); // Print ASCII value of number entered // Example: Enter 2 get 50 // Even you can enter letters like a return 97
        }
    }
}