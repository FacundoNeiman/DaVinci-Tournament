package clases;

public class Marker {
    private int localCounter;
    private int visitantCounter;
    private Team local;
    private Team visitant;

    public Marker(Team local, Team visitant) {
        this.local = local;
        this.visitant = visitant;
        this.localCounter = 0;
        this.visitantCounter = 0;
    }

    public String getMarker() {
        return String.format("%s %d - %d %s",
                this.local.getName(), this.localCounter,
                this.visitantCounter, this.visitant.getName());
        //return this.localGoalCounter + " - " + this.visitantGoalCounter;
    }

    public void makeAGoal(Team team) {
        if (team == local) {
            this.localCounter++;
        } else if (team == visitant) {
            this.visitantCounter++;
        }
    }

    public Team getLocal() {
        return this.local;
    }

    public Team getVisitant() {
        return this.visitant;
    }

    public void setLocal(Team team) {
        this.local = team;
    }

    public void setVisitant(Team team) {
        this.visitant = visitant;
    }

    public int getVisitantCounter() {
        return visitantCounter;
    }

    public void setVisitantCounter(int visitantCounter) {
        this.visitantCounter = visitantCounter;
    }

    public int getLocalCounter() {
        return localCounter;
    }

    public void setLocalCounter(int localCounter) {
        this.localCounter = localCounter;
    }

}
