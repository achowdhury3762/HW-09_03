package nyc.c4q.HW09_03;

import com.sun.istack.internal.NotNull;
import nyc.c4q.HW09_03.util.Direction;
import nyc.c4q.HW09_03.util.Event;

public class MapGamePresenterImpl implements BaseMVP.MapGamePresenter {
    private boolean gameEnded = false;
    private BaseMVP.MapGameModel mapModel;
    private BaseMVP.MapGameView mapView;

    public MapGamePresenterImpl(BaseMVP.MapGameView view) {
        this.mapView = view;
        mapModel = new MapGameModelImpl(this);
    }

    @Override
    @NotNull
    public void takeTurn(Direction direction) {
        mapModel.takeTurn(direction);
    }

    @Override
    public void invalidDirection() {
        mapView.showMapInvalid();
    }

    @Override
    public void receiveEvent(Event event) {
        mapView.showEvent(event);
    }

    @Override
    public void receiveEndGameEvent(Event event) {
        mapView.showEndGameEvent(event);
    }
}
