package nyc.c4q.HW09_03;

import nyc.c4q.HW09_03.util.Direction;
import nyc.c4q.HW09_03.util.Event;

import java.util.Scanner;
import java.util.jar.Pack200;

import static nyc.c4q.HW09_03.util.Direction.*;

public class MapGameViewImpl implements BaseMVP.MapGameView {
    private BaseMVP.MapGamePresenter presenter;
    private Scanner inputScanner;

    @Override
    public void showEvent(Event event) {
        System.out.println(event);

        promptDirection();
    }

    @Override
    public void showEndGameEvent(Event event) {
        System.out.println(event);
    }

    @Override
    public void showMapInvalid() {
        System.out.println("That direction is invalid");
    }

    public void startGame(Scanner input) {
        presenter = new MapGamePresenterImpl(this);
        this.inputScanner = input;

        promptDirection();
    }

    private void promptDirection() {
        String inputDirection = inputScanner.next();
        Direction direction = convertToDirection(inputDirection);
        while(direction == null) {
            System.out.println("Enter a valid direction please");
            inputDirection = inputScanner.next();
            direction = convertToDirection(inputDirection);
        }
        presenter.takeTurn(direction);
    }

    private Direction convertToDirection(String direction) {
        direction = direction.toLowerCase();
        switch(direction) {
            case "up":
                return UP;
            case "left":
                return LEFT;
            case "right":
                return RIGHT;
            case "down":
                return DOWN;
        }
        return null;
    }
}
