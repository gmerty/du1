package com.github.gmerty.du1.ui;

import com.github.gmerty.du1.logika.*;
import com.github.gmerty.du1.ui.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends javafx.application.Application
{
	public static void main(String[] args) {
		if (args.length == 0) {
            launch(args);
        } else 
                System.out.println("Neplatný parametr");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
		          .getResource("du2scene.fxml"));
		Parent root = loader.load();

		HomeController controller = loader.getController();
		controller.inicializuj(new Hra());
		
		primaryStage.setTitle("du1");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

	}
}
