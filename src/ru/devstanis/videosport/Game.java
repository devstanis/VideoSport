package ru.devstanis.videosport;

import javax.swing.*;
import java.awt.*;

public class Game extends GameScene
{
    //Constructor
    public Game()
    {
        setPreferredSize(new Dimension(Options.FIELD_WIDTH, Options.FIELD_HEGHT));
    }

    // Подготовка игровых данных
    void initGame()
    {
        /*
        ArrayList <GameObject> gameObjects = new ArrayList<GameObject>();
        for(int i = 0; i < Options.START_BALL_COUNT; i++)
            gameObjects.add(game.getRandomBall());

        game.addGameObjects(new Field(game), gameObjects);

        game.setPreferredSize(new Dimension(Options.FIELD_WIDTH, Options.FIELD_HEGHT));
        */
    }


    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        super.paint(g2d);
        g.setColor(Color.black);
        g.fillRect(0,0,300, 300);

        g.setColor(Color.green);
        g.drawRect(50, 50, 250, 250);

        g.setColor(Color.white);
        g.drawString("Game", 100, 100);
    }


    public void move()
    {
        this.repaint();
    }
}
