package de.hsel.pfw.group2;

import java.util.ArrayList;

public interface IMatchModel {
    public void registerObserver(IMatchfieldObserver matchfieldObserver);
    public void removeObserver();
    IPlayerFigure getLocalPlayer();
    void setRemotePlayers(ArrayList<IPlayerFigure> players);
    ArrayList<IPlayerFigure> getRemotePlayers();
    void setLocalPlayer(IPlayerFigure player);
    public void setTarget();
    public void getTarget();
    public void readServerStream();
}
