/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package windowmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import jfxtras.scene.control.window.CloseIcon;
import jfxtras.scene.control.window.Window;

/**
 *
 * @author jiri
 */
public class WindowManager extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Window w = new Window("JFXtras window");
        CloseIcon ci = new CloseIcon(w);
        w.getLeftIcons().add(ci);
        w.setPrefSize(180, 60);
        
        Group root = new Group();
        root.getChildren().add(w);
        
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
