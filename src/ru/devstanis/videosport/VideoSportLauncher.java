package ru.devstanis.videosport;

import javax.swing.*;
import java.awt.*;

public class VideoSportLauncher
{
    public static void main(String[] args)
    {
        /*
        JFrame jf = new JFrame();
        jf.setTitle(Options.TITLE_OF_PROGRAM);
        jf.setSize(Options.FIELD_WIDTH,Options.FIELD_HEGHT);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);//center window
*/
        GameController gc = new GameController();
        gc.Mode1();
/*
        jf.add(gm);
        jf.pack();
        jf.setVisible(true);

        Delay.wait(5000);

        jf.add(game);
        jf.pack();
        jf.setVisible(true);

*/

        //game.startGame();

    }
}
