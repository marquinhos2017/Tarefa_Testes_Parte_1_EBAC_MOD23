import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos separados por vírgula (ex: Maria,F;João,M;Ana,F):");
        String input = scanner.nextLine();
        scanner.close();

        List<String> mulheres = filtrarMulheres(input);

        System.out.println("Mulheres na lista:");
        mulheres.forEach(System.out::println);
    }

    public static List<String> filtrarMulheres(String input) {
        List<String> pessoas = Arrays.asList(input.split(";"));

        return pessoas.stream()
                .filter(pessoa -> pessoa.split(",")[1].equalsIgnoreCase("F"))
                .map(pessoa -> pessoa.split(",")[0])
                .collect(Collectors.toList());
    }
}
