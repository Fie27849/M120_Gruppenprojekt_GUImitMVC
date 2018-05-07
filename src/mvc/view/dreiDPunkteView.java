package mvc.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class dreiDPunkteView extends view
{
	public dreiDPunkteView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}

	public void start(Stage stage) throws IOException
	{
		 Parent root = FXMLLoader.load(getClass().getResource("3dpunkte.fxml"));
        Scene scene = new Scene(root, 300, 275);
        stage.setTitle("3D Punkte");
        stage.setScene(scene);
        stage.show();
	}
}
