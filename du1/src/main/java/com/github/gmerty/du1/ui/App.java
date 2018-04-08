package com.github.gmerty.du1.ui;

import com.github.gmerty.du1.ui.HomeController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends javafx.application.Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
		          .getResource("du2scene.fxml"));
		Parent root = loader.load();

		HomeController controller = loader.getController();		
	}
}
