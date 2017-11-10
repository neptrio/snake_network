package de.hsel.pfw.group2;

public class MatchController implements IMatchController {

    private IMatchModel mm;
    private IMatchfieldView mv;
    private IPlayerFigureView pfv;

    MatchController(IMatchModel mm){
        this.mm = mm;
        this.mv = new MatchfieldView(this, mm);
        this.pfv = new PlayerFigureView(this, mm);
    }


    public void startGame() {
        this.mm.setLocalPlayer(new PlayerFigure());
        run();
    }

    public void run(){
    }

    public void abortGame() {

    }

    public void syncSessionWithServer() {

    }
}
