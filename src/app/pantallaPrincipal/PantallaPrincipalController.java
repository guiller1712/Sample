/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pantallaPrincipal;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
/**
 * FXML Controller class
 *
 * @author guill
 */
public class PantallaPrincipalController implements Initializable {
   @FXML
    private ImageView img;

    @FXML
    private AnchorPane paneDer;

    @FXML
    private SplitPane splitPane;

    @FXML
    private JFXButton btnAltaCliente;

    @FXML
    private AnchorPane panePrincipal;

    @FXML
    private JFXButton btnInicio;

    @FXML
    private JFXButton btnReporteGen;

    @FXML
    private AnchorPane panIzq;

    @FXML
    private JFXButton btnCatalogoCliente;

    @FXML
    private JFXButton btnReporteAcu;

    @FXML
    private JFXButton config;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
   
    
}
