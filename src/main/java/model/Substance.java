package model;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Robin on 07.10.2016.
 */
public abstract class Substance implements GameConstants {
    @NotNull
    protected static final Logger log = LogManager.getLogger(Substance.class);

    @NotNull
    protected String id = RandomId();
    @NotNull
    protected Point2D position = RandomPosition();
    @NotNull
    protected  Color color = RandomColor();
    @NotNull
    protected int mass;

    public Substance(int mass){
        this.mass = mass;
    }

    public Substance(Color color, int mass){
        this.color = color;
        this.mass = mass;
    }

    private Point2D RandomPosition(){
        Random rand = new Random();
        return new Point2D.Double(rand.nextDouble() * DEFAULT_GAME_FIELD_SIZE,
                rand.nextDouble() * DEFAULT_GAME_FIELD_SIZE);
    }

    private String RandomId(){
        return UUID.randomUUID().toString();
    }

    private Color RandomColor(){
        Random rand = new Random();
        return new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
    }
}
