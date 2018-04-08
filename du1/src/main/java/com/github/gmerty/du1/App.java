package com.github.gmerty.du1;

import com.github.gmerty.adventura.ui.HomeController;

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
		          .getResource("Scene3.fxml"));
		Parent root = loader.load();

		HomeController controller = loader.getController();		
	}
}
