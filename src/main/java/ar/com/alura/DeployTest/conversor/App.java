package ar.com.alura.DeployTest.conversor;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;



public class App extends Application {
	
	@Override
	public void start(Stage primaryStage) 	{
		try {
			
			//IMPORTAMOS LAS FUENTES UTILIZADAS PARA EVITAR PROBLEMAS DE COMPATIBILIDAD
			Font.loadFont(getClass().getResourceAsStream("bank-gothic-medium-bt.ttf"), 45);
			Font.loadFont(getClass().getResourceAsStream("bank-gothic-light-bt.ttf"), 12);
			
			//CREAMOS EL FRAME INTRO
			Parent root = FXMLLoader.load(getClass().getResource("Intro.fxml"));
			root.setId("intro");
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("favico.png")));
			primaryStage.setTitle("Conversor de Divisas y Temperatura");
			primaryStage.setResizable(false);

		} catch(Exception e) {
			e.printStackTrace();
		}
	};
	 
	
	public static void main(String[] args) {
		launch(args);
	
	}
}
