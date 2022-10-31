package clases;

public class Player {
    private String name;
    private String position;
    private int goalCounter;
    private int matchCounter;
    private Team team;

    public Player(String name, String position, int goalCounter, int matchCounter){
        setGoalCounter(goalCounter);
        setMatchCounter(matchCounter);
        setName(name);
        setPosition(position);
        team = null;
    }

    public void setName(String name){
        this.name = name;
        return;
    }

    public void makeAGoal(){
        this.goalCounter++;
    }

    public void countMatch(){
        this.matchCounter++;
    }

    public String getName() {
        return this.name;
    }

    public void setPosition(String position) {
        this.position = position;
        return;
    }

    public String getPosition(){
        return this.position;
    }

    public int getGoalCounter(){
        return this.goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
        return;
    }

    public void setMatchCounter(int matchCounter) {
        this.matchCounter = matchCounter;
        return;
    }

    public Team getTeam(){
        return this.team;
    }

    public void setTeam(Team team){
        this.team = team;
    }

    public void incrementGoalCounter(){
        //this.goalCounter = this.goalCounter + 1;
        //this.goalCounter += 1;
        this.goalCounter++;
    }

    public int getMatchCounter(){
        return this.matchCounter;
    }

    public void incrementMatchCounter(){
        this.matchCounter++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", goalCounter=" + goalCounter +
                ", matchCounter=" + matchCounter +
                '}';
    }
}
