package de.hsel.pfw.group2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        ArrayList<IPlayerFigure> testPlayers = new ArrayList<IPlayerFigure>();

        IMatchModel matchModel = new MatchModel();
        IMatchController matchController = new MatchController(matchModel);

        matchController.startGame();


        /*Server Simulation*/
        IPlayerFigure p1 = new PlayerFigure();
        testPlayers.add(p1);

        IPlayerFigure p2 = new PlayerFigure();
        testPlayers.add(p2);

        IPlayerFigure p3 = new PlayerFigure();
        testPlayers.add(p3);


        for(int i = 0; i < 100; i++){
            p1.setPosition(ThreadLocalRandom.current().nextInt(0, 10));
            p2.setPosition(ThreadLocalRandom.current().nextInt(0, 10));
            p3.setPosition(ThreadLocalRandom.current().nextInt(0, 10));

            matchModel.setRemotePlayers(testPlayers);
        }





    }
}
