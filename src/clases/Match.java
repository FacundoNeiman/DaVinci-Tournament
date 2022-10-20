package clases;

import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;

    public Match(String location, Date date, Team local, Team visitant){
        setDate(date);
        setLocalTeam(local);
        setLocation(location);
        setVisitantGoalCounter(0);
        setLocalGoalCounter(0);
        setVisitantTeam(visitant);
    }

    public Match(Team local, Team visitant){
        setLocalTeam(local);
        setVisitantTeam(visitant);
    }

    public void makeAGoal(Team team, Player player){

    }

    public void finishMatch(){

    }

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public Date getdate(){
        return this.date;
    }
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
    }
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
    }
    public Team getLocalTeam(){
        return this.localTeam;
    }
    public void incrementLocalCounter(){
        this.localGoalCounter++;
    }

    public int getLocalCounter(){
        return this.localGoalCounter;
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.localGoalCounter = localGoalCounter;
    }
    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.visitantGoalCounter = visitantGoalCounter;
    }

    @Override
    public String toString() {
        return "Match{" +
                "location='" + location + '\'' +
                ", date=" + date +
                ", localTeam=" + localTeam +
                ", visitantTeam=" + visitantTeam +
                ", localGoalCounter=" + localGoalCounter +
                ", visitantGoalCounter=" + visitantGoalCounter +
                '}';
    }
}
