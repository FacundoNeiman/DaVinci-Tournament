package clases;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo de la clase #11");
        Season torneoDaVinci = new Season();
        torneoDaVinci.setName("Torneo 2022, 2do cuatri");
        Date comienzoDeCursada = new Date();
        comienzoDeCursada.setYear(2022);
        comienzoDeCursada.setMonth(7); //Enero 0, Agosto 7
        comienzoDeCursada.setDate(18);
        torneoDaVinci.setStartDate(comienzoDeCursada);

        Date finDeCursada = new Date();
        finDeCursada.setYear(2022);
        finDeCursada.setMonth(11); //Enero 0, Dic 11
        finDeCursada.setDate(5);
        torneoDaVinci.setEndDate(finDeCursada);

        Match primerPartido = new Match();
        primerPartido.setLocation("Aula 116, Da Vinci");
        Date fechaEstimadaParcial = new Date();
        fechaEstimadaParcial.setYear(2022);
        fechaEstimadaParcial.setMonth(8); // sept
        fechaEstimadaParcial.setDate(29);
        primerPartido.setDate(fechaEstimadaParcial);

        Player profeSergio = new Player();
        profeSergio.setName("Sergio Medina");
        profeSergio.setPosition("Arquero");
        profeSergio.setMatchCounter(0);
        profeSergio.setGoalCounter(0);

        Team profesoresPOO = new Team();
        profesoresPOO.setName("los objetos");
        profesoresPOO.addPlayer(profeSergio);

        Team estudiantesFC = new Team();
        estudiantesFC.setName("estudiantes FC");


        primerPartido.setLocalTeam(profesoresPOO);
        primerPartido.setVisitantTeam(estudiantesFC);
        primerPartido.setLocalGoalCounter(0);
        primerPartido.setVisitantGoalCounter(0);

        torneoDaVinci.addMatch(primerPartido);

    }
}
