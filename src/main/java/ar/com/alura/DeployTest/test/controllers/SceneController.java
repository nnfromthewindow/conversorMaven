package ar.com.alura.DeployTest.test.controllers;

import java.io.IOException;

import ar.com.alura.DeployTest.conversor.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController{

	private Stage stage;
	private Scene scene;
	private Parent root;
	 

 	public void switchToDivisas(ActionEvent event) throws IOException {
	  root = FXMLLoader.load(App.class.getResource("Moneda.fxml"));
	  root.setId("moneda");
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  scene.getStylesheets().add(App.class.getResource("application.css").toExternalForm());
	  stage.setTitle("Conversor de Divisas");
	  stage.setScene(scene);
	  stage.setResizable(false);
	  stage.show();
	
	 };
	 
	 public void switchToTemp(ActionEvent event) throws IOException {
		
	  Parent root = FXMLLoader.load(App.class.getResource("Temperatura.fxml"));
	  root.setId("temperatura");
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  scene.getStylesheets().add(App.class.getResource("application.css").toExternalForm());
	  stage.setTitle("Conversor de Temperatura");
	  stage.setScene(scene);
	  stage.setResizable(false);
	  stage.show();

	  };
	 
	  public void switchToHome(ActionEvent event) throws IOException {
		  Parent root = FXMLLoader.load(App.class.getResource("Intro.fxml"));
		  root.setId("intro");
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  scene.getStylesheets().add(App.class.getResource("application.css").toExternalForm());
		  stage.setTitle("Conversor de Divisas y Temperatura");
		  stage.setScene(scene);
		  stage.setResizable(false);
		  stage.show();

	 }


}