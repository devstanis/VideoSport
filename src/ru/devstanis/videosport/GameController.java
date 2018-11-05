package ru.devstanis.videosport;

import javax.swing.*;

public class GameController
{
    JFrame jf;
    Game game;
    GameMenu gm;

    GameController()
    {
        jf = new JFrame();
        jf.setTitle(Options.TITLE_OF_PROGRAM);
        jf.setSize(Options.FIELD_WIDTH,Options.FIELD_HEGHT);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);//center window

        game = new Game();
        gm = new GameMenu();
    }

    public void Mode1()
    {
        while(true) {
            setScene(game);
            Delay.wait(1500);
            setScene(gm);
            Delay.wait(2500);
        }
    }

    private void setScene(GameScene sc)
    {//Устанавливаем сцену
        if(jf.getComponentCount()>1) jf.remove(1);
        jf.add(sc);
        jf.pack();
        jf.setVisible(true);
    }
}
