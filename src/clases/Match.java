package clases;

import java.util.Date;

//@formatter:on
public class Match {
    private String location;
    private Date date;
    private Marker marker;
    private boolean playing;

    public Match(String location, Date date, Team local, Team visitant) {
        this.playing = false;
        this.marker = new Marker(local, visitant);
        setDate(date);
        setLocation(location);
        setVisitantGoalCounter(0);
        setLocalGoalCounter(0);
    }

    public Match(Team local, Team visitant) {
        this.playing = false;
        this.marker = new Marker(local, visitant);
    }

    public String getMarker() {
        return this.marker.getMarker();
    }

    public void makeAGoal(Team team, Player player) {
        marker.makeAGoal(team);
        player.makeAGoal();
        System.out.println("GOOOOOOOOOL! Lo hizo " + player.getName() + ". El resultado ahora es: ");
        System.out.println(this.marker.getMarker());
    }

    public void finishMatch() {
        this.playing = false;
    }

    public void startMatch() {
        this.playing = true;
        for (Player player : this.marker.getLocal().getPlayers()) {
            player.countMatch();
        }
        for (Player player : this.marker.getVisitant().getPlayers()) {
            player.countMatch();
        }
    }

    public boolean isPlaying() {
        return this.playing;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getdate() {
        return this.date;
    }

    public void setLocalTeam(Team localTeam) {
        this.marker.setLocal(localTeam);
    }

    public void setVisitantTeam(Team visitantTeam) {
        this.marker.setVisitant(visitantTeam);
    }

    public Team getLocalTeam() {
        return this.marker.getLocal();
    }

    public int getLocalCounter() {
        return this.marker.getLocalCounter();
    }

    public int getVisitantCounter() {
        return this.marker.getVisitantCounter();
    }

    public void setLocalGoalCounter(int localGoalCounter) {
        this.marker.setLocalCounter(localGoalCounter);
    }

    public void setVisitantGoalCounter(int visitantGoalCounter) {
        this.marker.setVisitantCounter(visitantGoalCounter);
    }

    @Override
    public String toString() {
        return "Match{" +
                "location='" + location + '\'' +
                ", date=" + date +
                ", localTeam=" + marker.getLocal() +
                ", visitantTeam=" + marker.getVisitant() +
                ", localGoalCounter=" + marker.getLocalCounter() +
                ", visitantGoalCounter=" + marker.getVisitantCounter() +
                '}';
    }
}
