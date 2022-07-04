package n2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Exercici 1
        List<String> noms = new ArrayList<String>(Arrays.asList("Ona", "Alba", "Ana", "Anna", "Ari", "Art"));
        List<String> nomsFiltrats = filtrarNomsCurts(noms, "A", 3);
        nomsFiltrats.forEach(System.out::println);

        // Exercici 2
        List<Integer> xifres = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 8, 9, 10));
        String concat = concatenarNombres(xifres);
        System.out.println(concat);

        // Exercici 3
        FunctionalInterfaceOperation opaSuma = (x, y) -> (float) (x + y);
        System.out.println(opaSuma.operation(2.7, 3.2));
        FunctionalInterfaceOperation opaResta = (x, y) -> (float) (x - y);
        System.out.println(opaResta.operation(2.5, 3.5));
        FunctionalInterfaceOperation opaMultiplicacio = (x, y) -> (float) (x * y);
        System.out.println(opaMultiplicacio.operation(2.2, 3.1));
        FunctionalInterfaceOperation opaDivisio = (x, y) -> (float) (x / y);
        System.out.println(opaDivisio.operation(2.4, 3));

        // Exercici 4
        List<String> textNombres = new ArrayList<String>(Arrays.asList(
                "-5", "1", "password1", "23jordan", "Albert", "14", "Núria",
                "17", "010", "1.50", "1.", "1000", "password2", ".50", "Remer"));

        // 4.1
        System.out.println("\nE4.1");
        textNombres.stream().sorted(Comparator.comparing(w-> w.charAt(0))).forEach(System.out::println);

        // 4.2
        System.out.println("\nE4.2");
        textNombres.stream().sorted(Comparator.comparing(w-> w.contains("e"), Comparator.reverseOrder())).forEach(System.out::println);

        // 4.3
        System.out.println("\nE4.3");
        textNombres.stream().map(p -> p.replace("a", "4")).forEach(System.out::println);

        // 4.4
        System.out.println("\nE4.4");
        Pattern pattern = Pattern.compile("^-?([0-9]+\\.?[0-9]+|[0-9]+)$");
        textNombres.stream().filter(pattern.asPredicate()).forEach(System.out::println);


    }

    // Exercici 1
    public static List<String> filtrarNomsCurts(List<String> noms, String lletra, int givLen) {
        return noms.stream()
                .filter(p -> p.substring(0, 1).equals(lletra) && p.length() == givLen)
                .collect(Collectors.toList());
    }

    // Exercici 2
    public static String concatenarNombres(List<Integer> llistaNombres) {
        return llistaNombres.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n.toString())
                .collect(Collectors.joining(","));
    }
}
