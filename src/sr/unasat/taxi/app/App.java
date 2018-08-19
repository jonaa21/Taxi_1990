package sr.unasat.taxi.app;

import sr.unasat.taxi.libs.Graph;

public class App {
    public static void main(String[] args) {

        Graph theGraph = new Graph();
        theGraph.addVertex("Centrum"); // 0 (start)
        theGraph.addVertex("Maretraite Mall"); // 1
        theGraph.addVertex("Leonsberg"); // 2
        theGraph.addVertex("Ondrobong"); // 3
        theGraph.addVertex("Lyco 1"); // 4
        theGraph.addVertex("NATIN"); // 5
        theGraph.addVertex("Kasabaolo"); // 6
        theGraph.addVertex("Dijkveld"); // 7
        theGraph.addVertex("Ornanibo"); // 8
        theGraph.addVertex("Boxel"); // 9
        theGraph.addVertex("Domburg"); // 10
        theGraph.addVertex("White Beach"); // 11
        theGraph.addVertex("Highway"); // 12
        theGraph.addVertex("Paranam"); // 13
        theGraph.addEdge(0, 1, 120); // Centrum -> Maretraite
        theGraph.addEdge(1, 2, 40); // Maretraite -> Leonsberg
        theGraph.addEdge(0, 3, 20); // Centrum -> Ondrobong
        theGraph.addEdge(3, 4, 10); // Ondrobong -> LYCO1
        theGraph.addEdge(4, 5, 10); // LYCO1 -> NATIN
        theGraph.addEdge(5, 6, 15); // NATIN -> Kasabaolo
        theGraph.addEdge(0, 7, 80); // Centrum -> Dijkveld
        theGraph.addEdge(7, 8, 20); // Dijkveld -> Ornanibo
        theGraph.addEdge(8, 9, 30); // Ornanibo -> Boxel
        theGraph.addEdge(9, 10, 10); // Boxel -> Domburg
        theGraph.addEdge(10, 11, 10); // Domburg -> White beach
        theGraph.addEdge(0, 12, 95); // Centrum -> Highway
        theGraph.addEdge(12, 10, 50); // Highway -> Domburg
        theGraph.addEdge(12, 13, 80); // Highway -> Paranam


        // TODO: de applicatie moet de korste route kunnen detecteren van de Garage naar zijn punt
        // TODO: een vaste bedrag moet aangegeven kunnen worden om te zien hoever de persoon kan gaan
        theGraph.shortestPathToArea("NATIN", 30);

        // TODO: de applicatie moet de langste route kunnen berekenen
        // Dijkstra algoritme gewoon omkeren
        //theGraph.longestPathToArea("NATIN");

        // TODO: zelf toevoegen van een area en edges
        // read user input with a reader

        // TODO: hoeveel zones zitten tussen de centrale en waarnaar je toe wilt
        theGraph.shortestPathToArea("NATIN", 30);

        // TODO: zone dichtbij van de gewenste zone
        // int startingArea = theGraph.dfs("NATIN");
        // System.out.println(startingArea);
        theGraph.bfs();
        // eerst zoeken naar de zone met een dept first search
        // de index gebruiken om verder te gaan met een breath first search

    }
}