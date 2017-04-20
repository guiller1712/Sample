/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.login;

import app.loginModel.Authentication;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Modality;

/**
 * FXML Controller class
 *
 * @author guill
 */
public class LoginViewController implements Initializable {
    //Prueba
    Authentication au;
    Stage error_stage;
    Stage app_stage;
    
    URL urlHome;
    URL urlError;
    
    Parent home_page_parent;
    Parent error_page_parent;
    
    Scene home_page_scene;
    Scene error_page_scene;
    
    @FXML
    private JFXPasswordField txtContra;

    @FXML
    private JFXButton btnInicioSesion;

    @FXML
    private JFXTextField txtUsuario;
    
    @FXML
    private Text textError;
    
    public LoginViewController() throws IOException{
        au = new Authentication();
        error_stage = new Stage();
        initHomeDialog();
        initErrorDialog();
    }
    
    @FXML
    private void autenticar(ActionEvent event) throws IOException{ //Conectar con BD
        String name = txtUsuario.getText();
        String contra = txtContra.getText();
        
        app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        if(!au.userExists(name, contra)){
            error_stage.showAndWait();
            textError.setVisible(true);
            System.out.println("Error...()");
            return;
        }
        textError.setVisible(false);
        app_stage.close();
        app_stage.setScene(home_page_scene);
        app_stage.show();
        
    }
    
    private void initErrorDialog() throws IOException{
        urlError = new File("src/app/errorDialog/errorDialog.fxml").toURL();
        error_page_parent = FXMLLoader.load(urlError);
        error_page_scene = new Scene(error_page_parent);
        error_stage.initOwner(app_stage);
        error_stage.setScene(error_page_scene);
        error_stage.initModality(Modality.APPLICATION_MODAL); 
    }
    
    private void initHomeDialog() throws IOException{
        urlHome = new File("src/app/pantallaPrincipal/pantallaPrincipal.fxml").toURL();
        home_page_parent = FXMLLoader.load(urlHome);
        home_page_scene = new Scene(home_page_parent);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
