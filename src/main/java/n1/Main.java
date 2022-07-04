package n1;

import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercici 1
        System.out.println("E1");
        List<String> llistaStrings = new ArrayList<>(Arrays.asList("Barcelona", "Girona", "Lleida", "Tarragona", "Terrassa", "Granollers", "Vic", "Olot", "Reus"));
        List<String> resultatFiltre = filtreParaules(llistaStrings, "o");
        resultatFiltre.forEach(System.out::println);

        // Exercici 2
        System.out.println("E2");
        List<String> resultatFiltre2 =  filtreParaulesLlarg(llistaStrings, "o", 5);
        resultatFiltre2.forEach(System.out::println);

        // Exercici 3
        System.out.println("E3");
        List<String> mesosAny = new ArrayList<String>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"));
        mesosAny.forEach(m -> System.out.println(m));

        // Exercici 4
        System.out.println("E4");
        mesosAny.forEach(System.out::println);

        // Exercici 5
        System.out.println("E5");
        FunctionaInterfacePi pi = () -> 3.1415;
        System.out.println(pi.getPiValue());

        // Exercici 6
        System.out.println("E6");
        List<String> potipoti = new ArrayList<>(Arrays.asList("John", "M", "Harrison", "Viriconium", "soundblades", "1971", "1984", "writer", "sci-fi", "fantasy", "Science Fiction"));
        potipoti.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        // Exercici 7
        System.out.println("E7");
        potipoti.stream().sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).forEach(System.out::println);

        // Exercici 8
        System.out.println("E8");
        ModificadorParaules mp = (String s) -> new StringBuilder(s).reverse().toString();
        System.out.println(mp.reverse("a man a plan a canal panama"));




    }

    // Mètode Exercici 1
    public static List<String> filtreParaules(List<String> paraules, String lletra) {
        return paraules.stream()
                .filter(p -> p.contains(lletra))
                .collect(Collectors.toList());
    }

    // Mètode Exercici 2
    public static List<String> filtreParaulesLlarg(List<String> paraules, String lletra, int minLen) {
        return paraules.stream()
                .filter(p -> p.contains(lletra) && p.length() > minLen)
                .collect(Collectors.toList());
    }


}
