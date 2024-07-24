import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testFiltrarMulheres() {
        // Lista original com pessoas e seus sexos
        String input = "Maria,F;João,M;Ana,F;Carlos,M;Beatriz,F";
        List<String> pessoas = Arrays.asList(input.split(";"));

        // Filtrar mulheres
        List<String> mulheres = Main.filtrarMulheres(input);

        // Verificar se todos os nomes na lista de mulheres são realmente femininos
        for (String mulher : mulheres) {
            boolean isWoman = pessoas.stream()
                    .anyMatch(pessoa -> pessoa.startsWith(mulher + ",F"));
            assertTrue("O nome " + mulher + " não é feminino na lista original", isWoman);
        }

        // Verificar se a lista de mulheres tem o tamanho correto
        assertTrue("A lista de mulheres não tem o tamanho esperado", mulheres.size() == 3);
    }
}
