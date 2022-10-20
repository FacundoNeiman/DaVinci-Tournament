package clases;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo de la clase #11");
        Date comienzoDeCursada = new Date(2022,8,6);
        Date finDeCursada = new Date(2022,12,1);
        Season torneoDaVinci = new Season("Torneo DaVinci",comienzoDeCursada, finDeCursada);

        System.out.println(torneoDaVinci);

        /*Team profesoresPOO = new Team("Los Objetos");
        Player profeSergio = new Player("Sergio Medina", "Arquero", 0, 0);
        profesoresPOO.addPlayer(profeSergio);

        Team estudiantesFC = new Team("Estudiantes DaVinci");

        Date fechaEstimadaParcial = new Date();
        fechaEstimadaParcial.setYear(2022);
        fechaEstimadaParcial.setMonth(8); // sept
        fechaEstimadaParcial.setDate(29);
        Match primerPartido = new Match("Open Gallo", fechaEstimadaParcial, estudiantesFC, profesoresPOO, 2, 0);

        torneoDaVinci.addMatch(primerPartido);*/

    }
}
