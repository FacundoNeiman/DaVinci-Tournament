package clases;

import java.util.ArrayList;
import java.util.Date;

public class Season {
    private ArrayList<Match> matchs;
    private String name;
    private Date startDate;
    private Date endDate;

    public Season(String name, Date start, Date end){
        matchs = new ArrayList<>();
        setEndDate(end);
        setName(name);
        setStartDate(start);
    }

    /*public ArrayList<Match> getMatchesByDate(Date date){
        return new ArrayList <Match> ();
    }*/
    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return this.name;
    }
    //(Date) -> void
    public void setStartDate (Date startDate){
        this.startDate = startDate;
    }
    public void setEndDate (Date endDate){
        this.endDate = endDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void addMatch(Match match){
        this.matchs.add(match);
    }
    @Override
    public String toString() {
        return "Season{" +
                "matchs=" + matchs +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
