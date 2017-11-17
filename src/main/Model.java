package main;

public class Model {

    public float calculate(float number1, float number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "x":
                return number1 * number2;
            case "/":
                if (number2 == 0)
                    return 0;
                return number1 / number2;
            default:
                return 0;
        }
    }
}
