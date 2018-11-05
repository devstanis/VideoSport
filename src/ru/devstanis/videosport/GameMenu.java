package ru.devstanis.videosport;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameMenu extends GameScene
{

    GameMenu()
    {
        setPreferredSize(new Dimension(Options.FIELD_WIDTH, Options.FIELD_HEGHT));
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        super.paint(g2d);
        g.setColor(Color.blue);
        g.fillRect(0,0,300, 300);

        g.setColor(Color.yellow);
        g.drawRect(50, 50, 250, 250);

        g.setColor(Color.green);
        g.drawString("Menu", 100, 100);
    }


    public void move() {

    }
}

