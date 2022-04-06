/**
 * FXMLController: connects the UI to actions written as code.
*/

package {{ cookiecutter.groupId }};

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {

    @FXML
    private Label label;  // label defined inside scene.fxml

    /**
     * This method runs when the button with
     * the onAction="#handleButtonAction" attribute is clicked.
     *
     * It shows the "You clicked me!" message in the terminal
     * and sets the <label>'s text to "Hello World!"
     *
     * @param event event object
    */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    public void initialize() {
        // TODO
    }
}
