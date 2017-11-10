package de.hsel.pfw.group2;

public interface IPlayerFigure {
    int getLength();
    int getPosition();
    void getMoveVector();
    void setMoveVector();
    void setPosition(int pos);
    void setLength(int length);
}
