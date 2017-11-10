package de.hsel.pfw.group2;

public class MatchfieldView implements IMatchfieldView, IMatchfieldObserver {

    private IMatchController mc;
    private IMatchModel mm;

    MatchfieldView(IMatchController mc, IMatchModel mm){
        this.mc = mc;
        this.mm = mm;
        this.mm.registerObserver(this);
    }

    public void drawField() {

    }

    public void drawTarget() {
        this.mm.getTarget();
    }

    public void drawRemotePlayers() {
        for(int i = 0; i < this.mm.getRemotePlayers().size(); i++){
            IPlayerFigure rp = this.mm.getRemotePlayers().get(i);
            System.out.println("Remote Player " + i + " an Position: " + rp.getPosition());
        }
    }
}
