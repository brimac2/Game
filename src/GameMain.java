import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class GameMain {
    public static void main(String[] args) {
        Game game1 = new Game("Uno", "Comedy", 20.99, 27);
        Game game2 = new Game("Alias", "Comedy", 65.49, 63);
        Game game3 = new Game("Cards", "Leisure", 24.29, 52);
        Game game4 = new Game("Fifa", "Sport", 10.35, 10);

        ArrayList<Game> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

// PRINT ARRAY LIST IN TWO METHODS:
//        for (int i = 0; i < games.size(); i++ ) {
//            System.out.println(games.get(i));
//        }

        games.forEach(game -> {
            System.out.println(game.toString());
        });

        System.out.println(" ");
        System.out.println("------------ Remove 2 game");


        games.remove(1);

        games.forEach(game -> {
            game.Printing();
        });

        System.out.println(" ");
        System.out.println("------------ Sort ascending");


        Collections.sort(games, new PriceComparator());

        games.forEach(game -> {
            game.Printing();
        });

        System.out.println(" ");
        System.out.println("------------ Sort descending");


        Collections.sort(games, new PriceComparator().reversed());

        games.forEach(game -> {
            game.Printing();
        });

        System.out.println(" ");
        System.out.println("------------ Sort using Streams by increment price");

        System.out.println("------------ Game Price Increment");

        // padidiname kaina 2 ir susikuriame nauja lista gamenew su naujais price parametrais ir isprintinam

        games.stream().forEach(game -> {
            game.IncrementPrice(2);
            game.Printing();
        });

        System.out.println(" ");
        System.out.println("------------ Using Streams collect to a new gameNew list");

        List<Game> newList = games.stream().collect(Collectors.toList());

        System.out.println(" ");
        System.out.println("------------ Sort using Streams Filter game price more ten 10 eur");
        List<Game> price10 = games.stream().filter(game -> !game.getPrice().equals(10.35)).toList();

        for (Game game : price10) {
            System.out.println(game);
        }

        System.out.println(" ");
        System.out.println("------------ Sort using Streams Filter games have more ten 50 copies");


        List<Game> copies50 = games.stream().filter(game -> (game.getCopiesSold() > 50)).toList();

        for (Game game : copies50) {
            System.out.println(game);
        }

        System.out.println(" ");
        System.out.println("------------ Sort using Streams Sorted sort games by copies sold");


        List<Game> sorted = games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList();
        System.out.println(sorted);
        System.out.println(" ");

        System.out.println("------------ Sort min using Streams Sorted sort games by copies sold");
        Optional<Game> minGamesbyCopies = games.stream().min(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println(minGamesbyCopies.get());
        System.out.println(" ");

        System.out.println("------------ Sort max using Streams Sorted sort games by copies sold");
        Optional<Game> maxGamesbyCopies = games.stream().max(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println(maxGamesbyCopies.get());
        System.out.println(" ");




    }
}

