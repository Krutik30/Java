package com.example.demo4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class Calculator extends Application {

    private Label displayLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        GridPane gridPane = createGridPane();
        displayLabel = createDisplayLabel();
        displayLabel.setFont(new Font(30));


        gridPane.add(displayLabel, 0, 0, 5, 1);

        String[][] buttonLabels = {
                {"7", "8", "9", "/","("},
                {"4", "5", "6", "*",")"},
                {"1", "2", "3", "-", "%"},
                {"0", ".", "=", "+","C"}

        };

        int row = 1;
        int col = 0;
        for (String[] rowLabels : buttonLabels) {
            for (String label : rowLabels) {

                Button button = createButton(label);
                gridPane.add(button, col, row);
                String buttonText = button.getText();


                if(buttonText=="C"){
                    button.setStyle("-fx-background-color: #87ceeb; -fx-text-fill: black;");

                }
                else if (buttonText=="+"||buttonText=="-"||buttonText=="*"||buttonText=="/"){
                    button.setStyle("-fx-background-color: #f8cc11; -fx-text-fill: black;");

                }
                else if(buttonText=="="){
                    button.setStyle("-fx-background-color: #ff6961; -fx-text-fill: white;");
                }
                else{
                    button.setStyle("-fx-background-color: #808080; -fx-text-fill: white;");
                }
                col++;
            }
            row++;
            col = 0;
        }

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().add(gridPane);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));
        return gridPane;
    }

    private Label createDisplayLabel() {
        Label label = new Label("0");
        label.setMinWidth(295);
        label.setAlignment(Pos.CENTER_RIGHT);
        label.setStyle("-fx-border-color: black; -fx-border-width: 1px;");
        return label;
    }

    private Button createButton(String text) {
        Button button = new Button(text);
        button.setMinWidth(50);
        button.setMinHeight(50);
        button.setFont(new Font(25));
        button.setOnAction(e -> handleButtonClick(text));
        button.setStyle("-fx-font-size: 50px;");
        return button;
    }

    private void handleButtonClick(String text) {
        String currentValue = displayLabel.getText();
        switch (text) {
            case "=":
                try {
                    double result = evaluateExpression(currentValue);
                    displayLabel.setText(String.valueOf(result));
                } catch (Exception ex) {
                    displayLabel.setText("Error");
                }
                break;
            case "C":
                try{
                displayLabel.setText("0");


                }catch (Exception ex) {
                    displayLabel.setText("Error");
                }
                break;
            case "%" :
                try {
                    double result = (evaluateExpression(currentValue))*100;
                    displayLabel.setText(String.valueOf(result+"%"));
                } catch (Exception ex) {
                    displayLabel.setText("Error");
                }
                break;
            default:
                if (currentValue.equals("0")) {
                    displayLabel.setText(text);
                } else {
                    displayLabel.setText(currentValue + text);
                }
                break;
        }
    }

    private double evaluateExpression(String expression) {
        return new Object() {
            int index = -1, ch;

            void nextChar() {
                ch = (++index < expression.length()) ? expression.charAt(index) : -1;
            }

            boolean eat(int charToEat) {
                while (Character.isWhitespace(ch)) {
                    nextChar();
                }
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (index < expression.length()) {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+')) {
                        x += parseTerm();
                    } else if (eat('-')) {
                        x -= parseTerm();
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*')) {
                        x *= parseFactor();
                    } else if (eat('/')) {
                        x /= parseFactor();
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (eat('+')) {
                    return parseFactor();
                }
                if (eat('-')) {
                    return -parseFactor();
                }

                double x;
                int startPos = this.index;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if (Character.isDigit(ch) || ch == '.') {
                    while (Character.isDigit(ch) || ch == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(expression.substring(startPos, this.index));
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                return x;
            }
        }.parse();
    }
}