/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.errorDialog;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author guill
 */
public class ErrorDialogController implements Initializable {

    @FXML
    private JFXButton btnAceptar;

    @FXML
    private Label txtDesc;

    @FXML
    private void aceptarAction(ActionEvent event) throws IOException {
         Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         app_stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
