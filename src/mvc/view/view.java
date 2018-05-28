package mvc.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mvc.template.main;

public class view 
{
	private String linktofxml;
	private String Title;

	public view(String linktofxml, String Title) {
		this.linktofxml = linktofxml;
		this.Title = Title;
	}

	public String getLinktofxml() {
		return linktofxml;
	}

	public String getTitle() {
		return Title;
	}

	public void setLinktofxml(String linktofxml) {
		this.linktofxml = linktofxml;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void changeScene(Stage window) throws IOException {
		Parent MyView = FXMLLoader.load(main.class.getResource(this.linktofxml));
		Scene MyScene = new Scene(MyView);
		window.setScene(MyScene);
		window.setTitle(this.Title);
		window.show();
	}	

}
