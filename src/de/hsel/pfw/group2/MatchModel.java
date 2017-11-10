package de.hsel.pfw.group2;

import java.util.ArrayList;

public class MatchModel implements IMatchModel {

    ArrayList<IMatchfieldObserver> matchfieldObserver = new ArrayList<IMatchfieldObserver>();
    ArrayList<IPlayerFigure> remotePlayers = new ArrayList<IPlayerFigure>();

    public void registerObserver(IMatchfieldObserver mo) {
        this.matchfieldObserver.add(mo);
    }

    public void removeObserver() {

    }

    public IPlayerFigure getLocalPlayer() {
        return null;
    }

    public void setRemotePlayers(ArrayList<IPlayerFigure> players) {
        this.remotePlayers = players;
        updateMatchfieldObserver();
    }

    public void updateMatchfieldObserver(){
        for(int i = 0; i < this.matchfieldObserver.size(); i++){
            IMatchfieldObserver mo = this.matchfieldObserver.get(i);
            mo.drawRemotePlayers();
        }
    }

    public ArrayList<IPlayerFigure> getRemotePlayers() {
        return this.remotePlayers;
    }

    public void setTarget() {

    }

    public void getTarget() {

    }

    public void readServerStream() {

    }

    public void setLocalPlayer(IPlayerFigure player) {

    }
}
