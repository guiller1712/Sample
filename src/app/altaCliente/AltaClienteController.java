/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.altaCliente;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author guill
 */
public class AltaClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private JFXTextField txtNombre;

    @FXML
    private JFXButton btnCan;

    @FXML
    private JFXTextField txtEst;

    @FXML
    private JFXComboBox<?> cmbGen;

    @FXML
    private JFXComboBox<?> cmbRec;

    @FXML
    private JFXTextField txtFec;

    @FXML
    private JFXButton btnGua;

    @FXML
    private JFXTextField txtNumCel;

    @FXML
    private JFXComboBox<?> cmbTipoFec;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
