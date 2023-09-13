package classfiles.javafx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;

public class nine3 extends Application{

public static void main(String[]args){
        launch(args);
        }
@Override
public void start(Stage primaryStage){
    Text message = new Text("This Is The Message!!");

    message.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 24));
    message.setFill(Color.MAGENTA);
    message.setStroke(Color.BLACK);
    message.setX(250);
    message.setY(200);

    Button moveLeft = new Button();
    moveLeft.setText("<--  Move_To_Left");
    moveLeft.setMaxSize(300, 100);
    moveLeft.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
    moveLeft.setBorder(Border.stroke(Color.WHITE));
    moveLeft.setLayoutX(200);
    moveLeft.setLayoutY(300);

    Button moveRight = new Button();
    moveRight.setText("Move_To_Right  -->");
    moveRight.setMaxSize(300, 100);
    moveRight.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
    moveLeft.setBorder(Border.stroke(Color.WHITE));
    moveRight.setLayoutX(400);
    moveRight.setLayoutY(300);

    RadioButton changeButton = new RadioButton();
    changeButton.setText("Change_Color_To_Red");
    changeButton.setMaxSize(400, 100);
    changeButton.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
    moveLeft.setBorder(Border.stroke(Color.WHITE));
    changeButton.setLayoutX(275);
    changeButton.setLayoutY(400);

    Pane pane = new Pane(message, moveLeft, moveRight, changeButton);
    pane.setPadding(new Insets(10));
    Scene scene = new Scene(pane, 800, 500);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Move_ChangeColor_In_Text");
    primaryStage.show();

    moveLeft.setOnAction(e->{
        message.setX(message.getX() - 50);
    });
    moveRight.setOnAction(e->{
        message.setX(message.getX() + 50);
    });
    changeButton.setOnMouseClicked(e->{
        message.setFill(Color.RED);
        message.setStroke(Color.GREENYELLOW);
        changeButton.setDisable(true);
    });
}
}
