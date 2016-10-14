package matchmaker;

import java.util.ArrayList;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import model.*;

/**
 * Created by Robin on 07.10.2016.
 */
public class SinglePlayerGameSession implements GameSession, GameConstants {
    @NotNull
    protected static final Logger log = LogManager.getLogger(SinglePlayerGameSession.class);

    private Player player;
    private GameField gameField;
    private ArrayList<Substance> gameSubstances;

    @NotNull
    protected String id = RandomId();

    public SinglePlayerGameSession(){
        if (log.isInfoEnabled()) {
            log.info("SinglePlayerGameSession:"+ '{' + this +'}' + " created");
        }
        gameField = new GameField(DEFAULT_GAME_FIELD_SIZE);
        gameSubstances = createGameSubstances();
    }

    private ArrayList<Substance> createGameSubstances(){
        ArrayList<Substance> gameSubstances = new ArrayList<>();

        for(int i = 0; i < DEFAULT_NUMBER_OF_PELLETS; i++) {
            gameSubstances.add(new Pellet());
        }

        for (int i = 0; i < DEFAULT_NUMBER_OF_VIRUSES; i++) {
            gameSubstances.add(new Virus());
        }

        return gameSubstances;
    }

    public void join(@NotNull Player player)
    {
        this.player = player;
        Cell cell = new Cell();
        this.gameSubstances.add(cell);
        this.player.cells[0] = cell;
        if (log.isInfoEnabled()) {
            log.info("New cell for " + player + " have been created");
        }
    }

    private String RandomId(){
        return UUID.randomUUID().toString();
    }

    public String toString() {
        return "SinglePlayerGameSession{" +
                "id=" + id +
                '}';
    }
}