package de.hsel.pfw.group2;

public class PlayerFigureView implements IPlayerFigureView {

    IMatchController mc;
    IMatchModel mm;

    PlayerFigureView(IMatchController mc, IMatchModel mm){
        this.mc = mc;
        this.mm = mm;
    }

    public void drawFigure() {
        this.mm.getLocalPlayer().getPosition();
    }

    public void keyDown() {
        this.mm.getLocalPlayer().setMoveVector();
    }

    public void keyUp() {

    }

    public void keyLeft() {

    }

    public void keyRight() {

    }
}
