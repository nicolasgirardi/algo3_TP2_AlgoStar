package extractorTest;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class extractorTest {

    @Test
    public void testSeConstruyeUnExtractorNuevoYSeLeQuiereAgregarUnZanganoYLanzaExcepcionEdificioNoOperativoError(){
        Esquina posicionConstruir = new Esquina(9, 1);
        //Arrange
        Extractor unExtractor = new Extractor(6, posicionConstruir);
        Zangano unZangano = new Zangano( new Posicion() );
        //Act
        unExtractor.ejecutarTurno();
        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unExtractor.agregarZangano(new Zangano(new Posicion()));
        });
    }
}
