package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.BotonCriaderoHandler;
import edu.fiuba.algo3.Controlador.BotonEdificioCriadero;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Juego;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class InterfazJuegoControlador implements Initializable {

    @FXML
    public Button btnAccion1;

    @FXML
    public Button btnAccion10;

    @FXML
    public Button btnAccion11;

    @FXML
    public Button btnAccion12;

    @FXML
    public Button btnAccion2;

    @FXML
    public Button btnAccion3;

    @FXML
    public Button btnAccion4;

    @FXML
    public Button btnAccion5;

    @FXML
    public Button btnAccion6;

    @FXML
    public Button btnAccion7;

    @FXML
    public Button btnAccion8;

    @FXML
    public Button btnAccion9;

    @FXML
    public GridPane grPane;

    @FXML
    public VBox vBoxMenu;

    @FXML
    public void btnTerminarTurno(ActionEvent event) {

    }

    @FXML
    public void onClickTerminarTurno(MouseEvent event) {

    }
    private Juego juego;


    public void setJuego(Juego juego){
        this.juego = juego;
    }

    private void inicializar(){
        grPane.setBackground( new Background(new BackgroundFill( Color.rgb(65, 40, 27, 1) , CornerRadii.EMPTY, Insets.EMPTY) ) );

        final int TAMANIO = 91;
        // Tierra
        File fileFondo = new File("images/tierra.png");
        Image imagenRaza = new Image(fileFondo.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage primerBackGro = new BackgroundImage(
                imagenRaza,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                try {
                    Button btn = new Button();
                    //btn.setGraphic( new ImageView(imagenRaza) );
                    btn.setMinSize(TAMANIO,TAMANIO);
                    //btn.setPrefSize(TAMANIO, TAMANIO);
                    btn.setBackground( new Background(primerBackGro) );
                    btn.setStyle("-fx-border-width: 2; -fx-border-color: white;");

                    grPane.add(btn, i, j);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }


        // Criadero
        File criaderoFile = new File("images/criadero.png");
        Image criaderoImage = new Image(criaderoFile.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage criaderoBackGro = new BackgroundImage(
                criaderoImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        Button btnCriadero = new Button();
        btnCriadero.setMinSize(TAMANIO,TAMANIO);
        btnCriadero.setBackground( new Background(criaderoBackGro) );
        grPane.add(btnCriadero, 0, 0);



        // Mineral
        File mineralFile = new File("images/mineral.png");
        Image mineralImage = new Image(mineralFile.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage mineralBackGro = new BackgroundImage(
                mineralImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        Button btnMineral = new Button();
        btnMineral.setMinSize(TAMANIO,TAMANIO);
        btnMineral.setBackground( new Background(mineralBackGro) );
        grPane.add(btnMineral, 3, 2);

        Button btnMineral2 = new Button();
        btnMineral2.setMinSize(TAMANIO,TAMANIO);
        btnMineral2.setBackground( new Background(mineralBackGro) );
        grPane.add(btnMineral2, 6, 9);


        // Volcan
        File volcanFile = new File("images/Volcan.png");
        Image volcanImage = new Image(volcanFile.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage volcanBackGro = new BackgroundImage(
                volcanImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        Button btnVolcan = new Button();
        btnVolcan.setMinSize(TAMANIO,TAMANIO);
        btnVolcan.setBackground( new Background(volcanBackGro) );
        grPane.add(btnVolcan, 4, 3);

        Button btnVolcan2 = new Button();
        btnVolcan2.setMinSize(TAMANIO,TAMANIO);
        btnVolcan2.setBackground( new Background(volcanBackGro) );
        grPane.add(btnVolcan2, 3, 4);



    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inicializar();
    }
}
