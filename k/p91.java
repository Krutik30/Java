package classfiles.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class nine1 extends Application{

public static void main(String[]args){
        launch(args);
        }
    Circle cir = new Circle(500, 350, 200);
    Label label = new Label("CENTER");
@Override
public void start(Stage primaryStage){

    cir.setFill(Color.MAGENTA);
    cir.setStroke(Color.BLACK);

    label.setLayoutX(400);
    label.setLayoutY(325);
    label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 50));
    label.setTextFill(Color.BLUE);
    label.setBorder(Border.stroke(Color.BLACK));
    label.setTextAlignment(TextAlignment.CENTER);
    label.setAlignment(Pos.CENTER);
    label.setMaxSize(250, 75);

    Pane pane = new Pane(cir, label);
    pane.setOnKeyPressed(e-> {
        switch (e.getCode()) {

            case UP:
                cir.setFill(Color.MAGENTA);
                cir.setCenterY(cir.getCenterY() - 100);
                label.setLayoutY(label.getLayoutY() - 100);
                label.setText("FRONT");
                break;

            case DOWN:
                cir.setFill(Color.YELLOW);
                cir.setCenterY(cir.getCenterY() + 100);
                label.setLayoutY(label.getLayoutY() + 100);
                label.setText("BACK");
                break;

            case LEFT:
                cir.setFill(Color.LIME);
                cir.setCenterX(cir.getCenterX() - 100);
                label.setLayoutX(label.getLayoutX() - 100);
                label.setText("LEFT");
                break;

            case RIGHT:
                cir.setFill(Color.RED);
                cir.setCenterX(cir.getCenterX() + 100);
                label.setLayoutX(label.getLayoutX() + 100);
                label.setText("RIGHT");
                break;
        }
    });

    Scene scene = new Scene(pane, 1000, 700);
    scene.setFill(Color.HOTPINK);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Move_Circle_With_ArrowKeys");
    primaryStage.show();
    pane.requestFocus();
    }
}
