package Game.Board;

import Game.Player;

import javax.swing.*;
import java.math.BigDecimal;

/**
 * Created by Zach on 6/1/17.
 */
public class Property extends Tile {

    private Player owner;

    private BigDecimal rent;
    private BigDecimal price;
    private BigDecimal improvementFee;



    Property(String name, int position, JPanel tilePanel){
        super(name,position, tilePanel);
    }
}
