package nyc.c4q.HW09_03;

import java.util.Scanner;

public class Main {
    static StringBuilder mapString = new StringBuilder(
            "\t\t\t\t\t\t\t\t     [ ]--[ ]                         \n" +
            "\t\t\t\t\t\t\t\t      |                               \n" +
            "\t\t\t\t\t\t\t\t[X]--[ ]--[ ]--[ ]--[ ]--[ ]--[ ]--[ ]\n" +
            "\t\t\t\t\t\t\t\t      |                             | \n" +
            "\t\t\t\t\t\t\t\t     [ ]--[ ]--[ ]--[ ]            [ ] ") ;

    public static void main(String[] args) {
        MapGameViewImpl view = new MapGameViewImpl();
        Scanner input = new Scanner(System.in);
        view.startGame(input);
    }
}