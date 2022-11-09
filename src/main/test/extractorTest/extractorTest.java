package extractorTest;

import edu.fiuba.algo3.modelo.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Extractor;
import edu.fiuba.algo3.modelo.Zangano;
import edu.fiuba.algo3.modelo.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class extractorTest {

    @Test
    public void testSeConstruyeUnExtractorNuevoYSeLeQuiereAgregarUnZanganoYLanzaExcepcionEdificioNoOperativoError(){
        //Arrange
        Extractor unExtractor = new Extractor(6);
        Zangano unZangano = new Zangano( new Posicion() );
        //Act
        unExtractor.ejecutarTurno();
        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unExtractor.agregarZangano(new Zangano(new Posicion()));
        });
    }
}
