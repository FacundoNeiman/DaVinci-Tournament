package clases;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name){
        players = new ArrayList<>();
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player){
        player.setTeam(this);
        this.players.add(player);
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
