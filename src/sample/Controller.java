package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    TextField text;
    @FXML
    Button send;
    @FXML
    TextArea list;
    @FXML
    void clickSend(ActionEvent eventOne){
        String a = list.getText();
        list.setText(a + text.getText() + "\n");
        text.setText("");
    }
    @FXML
    void pressEnter(KeyEvent event) {
        if(event.getCode().equals(KeyCode.ENTER)){
            String a = list.getText();
            list.setText(a + text.getText() + "\n");
            text.setText("");
        }
    }
}
