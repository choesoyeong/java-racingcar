package step3;

import java.util.Scanner;
import step3.models.Game;
import step3.ui.InputView;
import step3.ui.OutputView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView(new Scanner(System.in));

        int carNumber = inputView.inputCarNumber();
        int tryNumber = inputView.inputTryNumber();

        Game game = new Game(carNumber, tryNumber);

        OutputView outputView = new OutputView(game.play());

        outputView.printResult();
    }
}
