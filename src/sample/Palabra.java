
package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.lang.String;

public class Palabra {
   
    @FXML
    Button btn_mostrar;
    @FXML
    public TextArea numero_en_letras;


    private int recibir;

    public void setRecibir(int recibir) {
        this.recibir = recibir;
    }

    @FXML
    public void mostrar(ActionEvent actionEvent) {
        Convertidor numer = new Convertidor(recibir);
        String res = numer.convertirLetras(recibir);

        if (res == ""){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicación");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }else {
            numero_en_letras.appendText(res);
        }
    }

}
