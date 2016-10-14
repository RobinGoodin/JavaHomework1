package model;

/**
 * Created by Robin on 07.10.2016.
 *
 * Pellets are little dots that spawn randomly. They give 1 mass when eaten.
 */
public class Pellet extends Substance {

    public Pellet(){
        super(DEFAULT_PELLET_MASS);
        if (log.isInfoEnabled()) {
            log.info(toString() + " created");
        }
    }

    @Override
    public String toString() {
        return "Pellet{" +
                "color=" + color +
                " position=(" + (int)position.getX() + ";" + (int)position.getY() +
                ") mass=" + mass +
                "id=" + id +
                '}';
    }
}