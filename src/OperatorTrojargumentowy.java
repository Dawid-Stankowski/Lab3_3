public class OperatorTrojargumentowy {
    public static void main(String[] args) {
        // Przykładowe zmienne
        int liczba1 = 10;
        int liczba2 = 20;

        // Użycie operatora trójargumentowego do porównania liczb
        String wynikPorownania = (liczba1 > liczba2) ? "Liczba1 jest większa" : "Liczba2 jest większa lub równa";

        // Wyświetlenie wyniku porównania
        System.out.println(wynikPorownania);

        // Przykładowe użycie operatora trójargumentowego dla różnych typów
        int x = 5;
        int y = 8;
        String wynik = (x > y) ? "x jest większe od y" : "x nie jest większe od y";

        // Wyświetlenie wyniku
        System.out.println(wynik);
    }
}
