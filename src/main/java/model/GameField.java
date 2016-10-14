package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Robin on 07.10.2016.
 */
public class GameField {
    @NotNull
    protected static final Logger log = LogManager.getLogger(GameField.class);
    @NotNull
    public double size;

    public GameField(@NotNull double size){
        this.size = size;
        if (log.isInfoEnabled()) {
            log.info(toString() + " created");
        }
    }
    @Override
    public String toString() {
        return "GameField{" +
                "size=" + (int)size  + '}';
    }
}