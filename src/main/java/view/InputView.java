package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public static String requestPrice() {
        OutputView.requestPrice();
        return sc.nextLine();
    }
}
