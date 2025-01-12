


import java.io.IOException;
import java.util.Scanner;

public class MyCalc {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("exit")) {
            System.out.println(calc(str));
            str = scanner.nextLine();
        }
    }

    public static String calc(String input) throws IOException {
        int a;
        int b;
        String[] simvol;
        simvol = input.split(" ");
        a = Integer.parseInt(simvol[0]);
        b = Integer.parseInt(simvol[2]);
        String operator = simvol[1];
        if (a < 0 || a>11 || b<0||b>11)  {
            throw new IOException("неверное число");
        }
        int result;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            default -> {
                throw new IllegalArgumentException("throw Exception-неверное действие");
            }
        }
        return new String(String.valueOf(result));
    }
}