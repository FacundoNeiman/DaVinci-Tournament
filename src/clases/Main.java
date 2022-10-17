package clases;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo de la clase #11");
        Date comienzoDeCursada = new Date();
        comienzoDeCursada.setYear(2022);
        comienzoDeCursada.setMonth(7); //Enero 0, Agosto 7
        comienzoDeCursada.setDate(18);
        Date finDeCursada = new Date();
        finDeCursada.setYear(2022);
        finDeCursada.setMonth(11); //Enero 0, Dic 11
        finDeCursada.setDate(5);
        Season torneoDaVinci = new Season("Torneo DaVinci",comienzoDeCursada, finDeCursada);

        Team profesoresPOO = new Team("Los Objetos");
        Player profeSergio = new Player("Sergio Medina", "Arquero", 0, 0);
        profesoresPOO.addPlayer(profeSergio);

        Team estudiantesFC = new Team("Estudiantes DaVinci");

        Date fechaEstimadaParcial = new Date();
        fechaEstimadaParcial.setYear(2022);
        fechaEstimadaParcial.setMonth(8); // sept
        fechaEstimadaParcial.setDate(29);
        Match primerPartido = new Match("Open Gallo", fechaEstimadaParcial, estudiantesFC, profesoresPOO, 2, 0);

        torneoDaVinci.addMatch(primerPartido);

    }
}
