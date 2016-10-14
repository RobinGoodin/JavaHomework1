package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.net.URL;

/**
 * Server player avatar
 * <a href="https://atom.mail.ru/blog/topic/update/39/">HOMEWORK 1</a> example game instance
 *
 * @author Alpi
 */
public class Player implements GameConstants {
    @NotNull
    private static final Logger log = LogManager.getLogger(Player.class);
    @NotNull
    private String name;

    private URL skin;

    public Cell[] cells = new Cell[DEFAULT_MAX_CELLS];

    private int cash; //for donaters
    /**
    * Create new Player
    *
    * @param name        visible name
    */
    public Player(@NotNull String name) {
        this.name = name;
        if (log.isInfoEnabled()) {
            log.info(toString() + " created");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
  }
}
