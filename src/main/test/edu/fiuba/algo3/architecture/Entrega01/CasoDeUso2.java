package edu.fiuba.algo3.architecture.Entrega01;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso2{


    @Test
    public void UnCriaderoRecienConstruidoNoEstaOperativo(){

        Criadero edificio = new Criadero(4);

        assertEquals("Criadero no operativo",edificio.estado());
    }

    @Test
    public void UnCriaderoEstaOperativoLuegoDe4Turnos(){
        Criadero edificio = new Criadero(4);

        for(int i =0; i<4;i++)
            edificio.finDeturno();

        assertEquals("Criadero operativo",edificio.estado());
    }


    @Test
    public void UnaReservaNoEstaOperativaAlConstruirse(){

        ReservaDeProduccion edificio = new ReservaDeProduccion(12);

        assertEquals("Reserva no operativa",edificio.estado());

    }

    @Test
    public void UnaReservaEstaOperativaLuegoDe12TurnosDeConstruirse(){

        ReservaDeProduccion edificio = new ReservaDeProduccion(12);
        for(int i =0; i<12;i++)
            edificio.finDeturno();

        assertEquals("Reserva operativa",edificio.estado());

    }

    @Test
    public void UnExtractorRecienConstruidoNoEstaOperativo(){

        Extractor edificio = new Extractor(6);

        assertEquals("Extractor no operativo",edificio.estado());
    }

    @Test
    public void UnExtractorEstaOperativoLuegoDe6Turnos(){
        Extractor edificio = new Extractor(6);

        for(int i =0; i<6;i++)
            edificio.finDeturno();

        assertEquals("Extractor operativo",edificio.estado());
    }

    @Test
    public void UnaGuaridaNoEstaOperativaAlConstruirse(){

        Guarida edificio = new Guarida(12);

        assertEquals("Guarida no operativa",edificio.estado());

    }

    @Test
    public void UnaGuaridaEstaOperativaLuegoDe12TurnosDeConstruirse(){

        Guarida edificio = new Guarida(12);
        for(int i =0; i<12;i++)
            edificio.finDeturno();

        assertEquals("Guarida operativa",edificio.estado());

    }

    @Test
    public void UnaEspiralNoEstaOperativaAlConstruirse(){

        Espiral edificio = new Espiral(10);

        assertEquals("Espiral no operativa",edificio.estado());

    }

    @Test
    public void UnaEspiralEstaOperativaLuegoDe10TurnosDeConstruirse(){

        Espiral edificio = new Espiral(10);
        for(int i =0; i<10;i++)
            edificio.finDeturno();

        assertEquals("Espiral operativa",edificio.estado());

    }

    @Test
    public void UnNexoRecienConstruidoNoEstaOperativo(){

        NexoMineral edificio = new NexoMineral(4);

        assertEquals("Nexo Mineral no operativo",edificio.estado());
    }

    @Test
    public void UnNexoEstaOperativoLuegoDe4Turnos(){
        NexoMineral edificio = new NexoMineral(4);

        for(int i =0; i<4;i++)
            edificio.finDeturno();

        assertEquals("Nexo Mineral operativo",edificio.estado());
    }

    @Test
    public void UnPilonRecienConstruidoNoEstaOperativo(){

        Pilon edificio = new Pilon(5);

        assertEquals("Pilon no operativo",edificio.estado());
    }

    @Test
    public void UnPilonEstaOperativoLuegoDe5Turnos(){
        Pilon edificio = new Pilon(5);

        for(int i =0; i<5;i++)
            edificio.finDeturno();

        assertEquals("Pilon operativo",edificio.estado());
    }

    @Test
    public void UnAsimiladorRecienConstruidoNoEstaOperativo(){

        Asimilador edificio = new Asimilador(6);

        assertEquals("Asimilador no operativo",edificio.estado());
    }

    @Test
    public void UnAsimiladorEstaOperativoLuegoDe6Turnos(){
        Asimilador edificio = new Asimilador(6);

        for(int i =0; i<6;i++)
            edificio.finDeturno();

        assertEquals("Asimilador operativo",edificio.estado());
    }

    @Test
    public void UnAccesoRecienConstruidoNoEstaOperativo(){

        Acceso edificio = new Acceso(8);

        assertEquals("Acceso no operativo",edificio.estado());
    }

    @Test
    public void UnAccesoEstaOperativoLuegoDe8Turnos(){
        Acceso edificio = new Acceso(8);

        for(int i =0; i<8;i++)
            edificio.finDeturno();

        assertEquals("Acceso operativo",edificio.estado());
    }

    @Test
    public void UnPuertoEstelarRecienConstruidoNoEstaOperativo(){

        PuertoEstelar edificio = new PuertoEstelar(10);

        assertEquals("Puerto Estelar no operativo",edificio.estado());
    }

    @Test
    public void UnPuertoEstelarEstaOperativoLuegoDe10Turnos(){
        PuertoEstelar edificio = new PuertoEstelar(10);

        for(int i =0; i<10;i++)
            edificio.finDeturno();

        assertEquals("Puerto Estelar operativo",edificio.estado());
    }
}