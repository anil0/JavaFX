import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by anil on 05/06/2016.
 */
public class UserInput extends Application {

    Stage window;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title");

        //form
        TextField text = new TextField();
        Button button = new Button("Click me");
        button.setOnAction(e -> isInt(text, text.getText())); //getText()

        //Layout
        VBox layout = new VBox(10); //add spacing between elements
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(text, button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField text, String text1)
    {
        try
        {
            int age = Integer.parseInt(text.getText()); //try to store number in int
            System.out.println("The user is: " + age);
            return true;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: " + text1 + " is not a number");
        }

        return false;
    }
}
