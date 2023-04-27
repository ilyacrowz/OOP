package Task004.Shield;

import Task004.Defendable;

public abstract class Defend implements Defendable {
    protected int pointOfDefend;

    public Defend(int pointOfDefend) {
        this.pointOfDefend = pointOfDefend;
    }

}