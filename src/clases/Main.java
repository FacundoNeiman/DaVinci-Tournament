package clases;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo de la clase #11");
        Date comienzoDeCursada = new Date(2022, 8, 6);
        Date finDeCursada = new Date(2022, 12, 1);
        Season torneoDaVinci = new Season("Torneo DaVinci", comienzoDeCursada, finDeCursada);

        Team profesoresPOO = new Team("Los Objetos");
        Player profeSergio = new Player("Sergio Medina", Position.ARQUERO, 0, 0);
        profesoresPOO.addPlayer(profeSergio);
        profesoresPOO.addPlayer(new Player("Lautaro 'Perk' Chiappero", Position.LATERAL_DERECHO, 1, 5));
        profesoresPOO.addPlayer(new Player("Victor 'Emperador' Golemba", Position.VOLANTE_CENTRAL, 0, 2));
        profesoresPOO.addPlayer(new Player("Juan Carloni", Position.LATERAL_IZQUIERDO, 1, 2));
        profesoresPOO.addPlayer(new Player("Elda Montoto", Position.DELANTERO, 10, 20));

        Team estudiantesFC = new Team("Estudiantes DaVinci");
        estudiantesFC.addPlayer(new Player("Facundo Neiman", Position.DELANTERO, 8, 4));
        estudiantesFC.addPlayer(new Player("Lucas Emens", Position.CENTRAL_DERECHO, 1, 8));
        estudiantesFC.addPlayer(new Player("Kevin Colina", Position.LATERAL_IZQUIERDO, 0, 8));
        estudiantesFC.addPlayer(new Player("Facundo Preiss", Position.CENTRAL_IZQUIERDO, 0, 8));
        estudiantesFC.addPlayer(new Player("Sebastian 'El Innombrable'", Position.ARQUERO, 0, 0));

        Date fechaEstimadaParcial = new Date(2022, 8, 29);
        Match primerPartido = new Match("Open Gallo", fechaEstimadaParcial, estudiantesFC, profesoresPOO);
        torneoDaVinci.addMatch(primerPartido);

        System.out.println(torneoDaVinci);
        System.out.println(primerPartido.getMarker());

        primerPartido.makeAGoal(estudiantesFC, estudiantesFC.getPlayers().get(0));
        primerPartido.makeAGoal(estudiantesFC, estudiantesFC.getPlayers().get(3));
        primerPartido.makeAGoal(profesoresPOO, profesoresPOO.getPlayers().get(4));
        primerPartido.makeAGoal(estudiantesFC, estudiantesFC.getPlayers().get(1));
    }
}
