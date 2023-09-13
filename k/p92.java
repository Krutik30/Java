package classfiles.javafx;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class nine2 extends Application{

public static void main(String[]args){
        launch(args);
        }

@Override
public void start(Stage primaryStage){

    Circle cir = new Circle(500, 400, 300);
    cir.setFill(Color.MAGENTA);
    cir.setStroke(Color.BLACK);
    cir.setStrokeWidth(4);

    EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent me) {
            cir.setFill(Color.RED);
        }
    };
    EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent me) {
            cir.setFill(Color.BLUE);
        }
    };

    cir.addEventHandler(MouseEvent.MOUSE_PRESSED, event1);
    cir.addEventHandler(MouseEvent.MOUSE_RELEASED, event2);

    Group root = new Group(cir);
    Scene S = new Scene(root, 1000, 800);
    primaryStage.setTitle("Camilion_Circle");
    primaryStage.setScene(S);
    primaryStage.show();
        }
    }
