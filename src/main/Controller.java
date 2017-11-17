package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    private Model model = new Model();
    private float number1 = 0;
    private String operator = "";

    @FXML
    Label result;

    public void executeNumbers(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        result.setText(result.getText() + value);
    }

    public void executeOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!value.equals("=")) {
            operator = value;
            number1 = Float.parseFloat(result.getText());
            result.setText("");
        } else {
            if (operator.isEmpty())
                return;

            float number2 = Float.parseFloat(result.getText());
            float res = model.calculate(number1, number2, operator);
            result.setText(String.valueOf(res));
        }
    }

    public void reset(ActionEvent event) {
        number1 = 0;
        operator = "";
        result.setText("");
    }
}
