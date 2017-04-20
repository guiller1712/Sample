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
import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author guill
 */
public class PantallaPrincipalController implements Initializable {
    
    Stage app_stage;
    
    Stage login_stage;
    URL urlLogin;
    Parent login_page_parent;
    Scene login_page_scene;
    
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
    
    public PantallaPrincipalController() throws IOException{
       initLoginDialog();
    }
    
    @FXML
    private void cerrarSesion(ActionEvent event) throws IOException {
        app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        login_page_parent = FXMLLoader.load(urlLogin);
        login_page_scene = new Scene(login_page_parent);
        app_stage.close();
        app_stage.setScene(login_page_scene);
        app_stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    private void initLoginDialog() throws IOException{
        urlLogin = new File("src/app/login/loginView.fxml").toURL();
    }
    
    
   
    
}
