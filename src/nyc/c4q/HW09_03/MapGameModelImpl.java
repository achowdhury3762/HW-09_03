package nyc.c4q.HW09_03;

import com.sun.istack.internal.NotNull;
import nyc.c4q.HW09_03.enums.Direction;

public class MapGameModelImpl implements BaseMVP.MapGameModel {
    private MapRoom currentMapPosition;
    private BaseMVP.MapGamePresenter presenter;
    private FullMap map;

    public MapGameModelImpl(BaseMVP.MapGamePresenter presenter) {
        this.presenter = presenter;

        createRandomFullMap();
        currentMapPosition = map.getStartPosition();
    }

    @Override
    @NotNull
    public void takeTurn(Direction direction) {
        MapRoom currentMapPositionHolder = currentMapPosition;

        switch (direction) {
            case UP:
                currentMapPosition = currentMapPosition.up;
                break;
            case DOWN:
                currentMapPosition = currentMapPosition.down;
                break;
            case LEFT:
                currentMapPosition = currentMapPosition.left;
                break;
            case RIGHT:
                currentMapPosition = currentMapPosition.right;
                break;
        }
        if (currentMapPosition == null) {
            currentMapPosition = currentMapPositionHolder;

            presenter.invalidDirection();
        } else
            presenter.receiveEvent(currentMapPosition.event);
    }

    @Override
    public void createRandomFullMap() {
        map = new FullMap();
        map.createRandomMap();
    }
}
