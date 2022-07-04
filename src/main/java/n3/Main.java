package n3;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumne> alumnat = new ArrayList<Alumne>();
        alumnat.add(new Alumne("Alba Álvarez", 23, "JAVA", 9.5));
        alumnat.add(new Alumne("Berta Bertí", 20, "Python", 8.5));
        alumnat.add(new Alumne("Carles Cabanes", 23, "JAVA", 6.2));
        alumnat.add(new Alumne("Domingo Domínguez", 17, "PHP", 5));
        alumnat.add(new Alumne("Esther Espart ", 27, "PHP", 7.5));
        alumnat.add(new Alumne("Fèlix Ferrer", 17, "Python", 9));
        alumnat.add(new Alumne("Genís Gener", 20, "PHP", 6.5));
        alumnat.add(new Alumne("Hèctor Herculà", 23, "JAVA", 5.5));
        alumnat.add(new Alumne("Irene Iraburu", 23, "JAVA", 7.9));
        alumnat.add(new Alumne("Arnau Armer", 51, "Python", 4.9));

        // Part 1
        System.out.println("Llistat alumnes");
        alumnat.stream().forEach(a -> System.out.printf("Nom: %s -- Edat: %d\n", a.getNom(), a.getEdat()));

        // Part 2
        System.out.println("Alumnes amb inicial A");
        List<Alumne> alumnatA = alumnat.stream().filter(a -> a.getNom().substring(0,1).equals("A")).collect(Collectors.toList());
        alumnatA.forEach(a -> System.out.println(a.getNom()));

        // Part 3
        System.out.println("Alumnes amb nota >= 5");
        alumnat.stream().filter(a -> a.getNota() > 5).forEach(a -> System.out.println(a.getNom()));

        // Part 4
        System.out.println("Alumnes amb nota >= 5 i NO PHP");
        alumnat.stream().filter(a -> a.getNota() > 5 && !a.getCurs().equals("PHP")).forEach(a -> System.out.println(a.getNom()));

        // Part 5
        System.out.println("Alumnes amb nota >= 5 i edat >= 18");
        alumnat.stream().filter(a -> a.getNota() > 5 && a.getEdat() >= 18).forEach(a -> System.out.println(a.getNom()));

    }
}
