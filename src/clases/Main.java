package clases;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo de la clase #11");
        Date comienzoDeCursada = new Date(2022,8,6);
        Date finDeCursada = new Date(2022,12,1);
        Season torneoDaVinci = new Season("Torneo DaVinci",comienzoDeCursada, finDeCursada);

        Team profesoresPOO = new Team("Los Objetos");
        Player profeSergio = new Player("Sergio Medina", "Arquero", 0, 0);
        profesoresPOO.addPlayer(profeSergio);
        profesoresPOO.addPlayer(new Player("Lautaro 'Perk' Chiappero" ,"Lateral Derecho", 1,5));

        Team estudiantesFC = new Team("Estudiantes DaVinci");

        Date fechaEstimadaParcial = new Date(2022, 8, 29);
        Match primerPartido = new Match("Open Gallo", fechaEstimadaParcial, estudiantesFC, profesoresPOO);

        torneoDaVinci.addMatch(primerPartido);


        System.out.println(torneoDaVinci);
    }
}
