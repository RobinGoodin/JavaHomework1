package model;

/**
 * Created by Robin on 07.10.2016.
 *
 * Cells are the units that you control. They eat pellets. You have to survive with these little guys.
 */
public class Cell extends Substance {

    public Cell(){
        super(DEFAULT_CELL_MASS);
        if (log.isInfoEnabled()) {
            log.info(toString() + " created");
        }
    }

    @Override
    public String toString() {
        return "Cell{" +
                "color=" + color +
                " position=(" + (int)position.getX() + ";" + (int)position.getY() +
                ") mass=" + mass +
                "id=" + id +
                '}';
    }
}
