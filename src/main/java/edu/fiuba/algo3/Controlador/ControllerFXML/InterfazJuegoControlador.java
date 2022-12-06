package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.modelo.Juego.JuegoVista;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class InterfazJuegoControlador{

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
    public AnchorPane contenedorMapa;

    @FXML
    public VBox vBoxMenu;

    @FXML
    public Button btnTerminarTurno;

    @FXML
    public void btnTerminarTurno(ActionEvent event) {

    }

    @FXML
    public void onClickTerminarTurno(MouseEvent event) {

    }

    private JuegoModelo juegoModelo;


    public void setJuego(JuegoModelo juegoModelo){
        this.juegoModelo = juegoModelo;
    }

    public void inicializar(){

        //setBackground( new Background(new BackgroundFill( Color.rgb(65, 40, 27, 1) , CornerRadii.EMPTY, Insets.EMPTY) ) );
        JuegoVista juegoVista = new JuegoVista(juegoModelo);
        juegoVista.iniciar(vBoxMenu);
        juegoVista.agregarContenedor(contenedorMapa);

        /*

        GridPane grPane = new GridPane();
        final int MAPA_TAMANIO = 18;
        final int TAMANIO = (970/MAPA_TAMANIO) +1;

        // Tierra
        File fileFondo = new File("images/tierra.png");
        Image imagenTierra = new Image(fileFondo.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage fondoTierra = new BackgroundImage(
                imagenTierra,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );


        for(int i = 0; i < MAPA_TAMANIO; i++){
            for(int j = 0; j < MAPA_TAMANIO; j++){
                try {
                    Button btn = new Button();
                    //btn.setGraphic(new ImageView(imagenRaza) );
                    //btn.setGraphic( new ImageView(imagenRaza) );
                    btn.setMinSize(TAMANIO,TAMANIO);
                    btn.setPrefSize(TAMANIO,TAMANIO);
                    btn.setBackground( new Background(fondoTierra) );
                    //btn.setStyle("-fx-border-width: 2; -fx-border-color: white;");
                    grPane.add(btn, i, j);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
        grPane.setPrefSize(1000,950);


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

        // Pilon
        File pilonFile = new File("images/pilon.png");
        Image pilonImage = new Image(pilonFile.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage pilonBackGro = new BackgroundImage(
                pilonImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        Button btnPilon = new Button();
        btnPilon.setMinSize(TAMANIO,TAMANIO);
        btnPilon.setBackground( new Background(pilonBackGro) );
        grPane.add(btnPilon, 9, 9);

        //juegoModelo.agregarContenedor(contenedorMapa);
        contenedorMapa.getChildren().add(grPane);

         */
    }


    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(juegoModelo == null){
            System.out.println("HUBO ERROR juegoModelo == null \n");
        }
    }

}
