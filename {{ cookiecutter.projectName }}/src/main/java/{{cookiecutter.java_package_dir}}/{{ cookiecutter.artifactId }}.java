/**
 * Main class: runs the application
*/

package {{ cookiecutter.groupId }};

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Retrieves "scene.fxml" and "styles.css" files and uses them to show the GUI
*/
public class {{ cookiecutter.artifactId }} extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // create a scene with components defined inside the "scene.fxml" file
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        Scene scene = new Scene(root);

        // set CSS (Cascade Style Sheet) to customize the look of the app
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Add the title to the scene.
        stage.setTitle("JavaFX, JavaFX FXML");

        // Add the scene inside the primary stage and make it visible on the screen.
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Runs the application.
     *
     * @param args Command line arguments.
    */
    public static void main(String[] args) {
        launch(args);
    }
}
