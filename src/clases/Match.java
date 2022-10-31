package clases;

import java.util.Date;

public class Match {
    private String location;
    private Date date;
    private Team localTeam;
    private Team visitantTeam;
    private int localGoalCounter;
    private int visitantGoalCounter;
    private boolean playing;

    public Match(String location, Date date, Team local, Team visitant){
        setDate(date);
        setLocalTeam(local);
        setLocation(location);
        setVisitantGoalCounter(0);
        setLocalGoalCounter(0);
        setVisitantTeam(visitant);
        this.playing = false;
    }

    public Match(Team local, Team visitant){
        setLocalTeam(local);
        setVisitantTeam(visitant);
        this.playing = false;
    }

    public void makeAGoal(Team team, Player player){
        if(team == localTeam){
            this.localGoalCounter++;
        }
        else if(team == visitantTeam){
            this.visitantGoalCounter++;
        }
        player.makeAGoal();

        System.out.println("GOOOOOOOOOL! Lo hizo " + player.getName() + ". El resultado ahora es: " );
        System.out.println( this.getMarker());
    }

    public void finishMatch(){
        this.playing= false;
    }

    public void startMatch(){
        this.playing = true;
        for (Player player: this.localTeam.getPlayers()) {
            player.countMatch();
        }
        for (Player player: this.visitantTeam.getPlayers()) {
            player.countMatch();
        }
    }

    public boolean isPlaying(){
        return this.playing;
    }

    public String getMarker(){
        return String.format("%s %d - %d %s",
                this.localTeam.getName() ,this.getLocalCounter(),
                this.getVisitantCounter(), this.visitantTeam.getName());
        //return this.localGoalCounter + " - " + this.visitantGoalCounter;
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
    public int getVisitantCounter(){
        return this.visitantGoalCounter;
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
