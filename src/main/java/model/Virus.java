package model;

import java.awt.*;

/**
 * Created by Robin on 07.10.2016.
 *
 * A Virus is a green cell that can be used offensively and defensively.
 * If a cell consumes a virus, it will "pop", sending out 15 or less bite-sized bits
 * of the cell in different directions. A cell can eject 7 times to fire a virus,
 * sending another virus into a cell.
 */
public class Virus extends Substance {

    public Virus(){
        super(Color.green, DEFAULT_VIRUS_MASS);
        if (log.isInfoEnabled()) {
            log.info(toString() + " created");
        }
    }

    @Override
    public String toString() {
        return "Virus{" +
                "color=" + color +
                " position=(" + (int)position.getX() + ";" + (int)position.getY() +
                ") mass=" + mass +
                "id=" + id +
                '}';
    }
}
