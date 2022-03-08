package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.Format;

public class Controller {

    @FXML
    private Button button;

    @FXML
    private Label lblsum;

    @FXML
    private Label mylabel;

    @FXML
    private TextField txtn1;

    @FXML
    private TextField txtn2;

    int a,b,sum;

    @FXML
    void submit(ActionEvent event) {
        try {
            a = Integer.parseInt(txtn1.getText());
            b = Integer.parseInt(txtn2.getText());
            sum = a + b;
            lblsum.setText(Integer.toString(sum));
        }
        catch (NumberFormatException e){
           lblsum.setText("Enter only Numbers plz");
        }
        catch (Exception e){
            System.out.println(e);
        }


    }

}
