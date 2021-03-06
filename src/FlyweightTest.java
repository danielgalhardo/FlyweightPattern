import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {

    @Test
    void retornaMesmoHashCode()
    {
       Caneta canetaVermelhaFinaUm = CanetaFactory.getCanetaPontaFina("VERMELHA");
       assertEquals("Escrevendo com a cor: VERMELHA com a caneta fina: Oi!",canetaVermelhaFinaUm.escreve("Oi!"));

        Caneta canetaVermelhaFinaDois = CanetaFactory.getCanetaPontaFina("VERMELHA");
        assertEquals("Escrevendo com a cor: VERMELHA com a caneta fina: Tchau!",canetaVermelhaFinaUm.escreve("Tchau!"));


        assertEquals(canetaVermelhaFinaUm.hashCode(), canetaVermelhaFinaDois.hashCode());

    }

    @Test
    void retornaDiferentesHashCodes()
    {
        Caneta canetaVermelhaFinaUm = CanetaFactory.getCanetaPontaFina("VERMELHA");
        assertEquals("Escrevendo com a cor: VERMELHA com a caneta fina: Oi!",canetaVermelhaFinaUm.escreve("Oi!"));

        Caneta canetaPretaFina = CanetaFactory.getCanetaPontaFina("PRETA");
        assertEquals("Escrevendo com a cor: PRETA com a caneta fina: Oi!",canetaPretaFina.escreve("Oi!"));

        assertNotEquals(canetaVermelhaFinaUm.hashCode(), canetaPretaFina.hashCode());

    }

}
