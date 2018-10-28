package ru.devstanis.videosport;

import javax.swing.*;

public class VideoSportLauncher
{
    public static void main(String[] args)
    {
        //System.out.println("VideoSport is coming!");
        JFrame jf = new JFrame();
        jf.setTitle(Options.TITLE_OF_PROGRAM);
        jf.setSize(Options.FIELD_WIDTH,Options.FIELD_HEGHT);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);//center window

        //Game game = new Game();

        //jf.add(game);
        jf.pack();
        jf.setVisible(true);

        //game.startGame();

    }
}
