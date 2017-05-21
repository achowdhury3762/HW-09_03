package nyc.c4q.HW09_03;

import nyc.c4q.HW09_03.enums.Direction;
import nyc.c4q.HW09_03.enums.Event;

public class BaseMVP {
    interface MapGameView {
        void showEvent(Event event);

        void showMapInvalid();

        void showEndGameEvent(Event event);
    }

    interface MapGamePresenter {
        void takeTurn(Direction direction);

        void invalidDirection();

        void receiveEvent(Event event);

        void receiveEndGameEvent(Event event);
    }

    public interface MapGameModel {
        void takeTurn(Direction direction);

        void createRandomFullMap();
    }
}
//Take a turn, callback returns the event. React to event?? presenter??