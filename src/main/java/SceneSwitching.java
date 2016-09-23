import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by anil on 04/06/2016.
 */
public class SceneSwitching extends Application
{

    Stage window; //rename stage to window just for simplicity
    Scene scene1, scene2; //create scenes for switching


    public static void main( String[] args )
    {
        launch( args );
    }


    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        window = primaryStage; //now can reference by window instead.

        //make label and button, to put on scene 1
        Label label1 = new Label("First scene"); //static text like messages and stuff
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2)); //go to another scene

        //Layout 1 - children are laid out in vertical column
        //stack on top of eachother
        VBox layout1 = new VBox(20); //space by 20 pixels
        layout1.getChildren().addAll(label1,button1); //add items to our layout //add all for multiple

        //attatch all those items to scene 1
        scene1 = new Scene(layout1, 200, 200); //give our scene a layout and scene

        //button 2
        Button button2 = new Button("lets go back");
        button2.setOnAction(e -> window.setScene(scene1));

        //layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2); //.add for single item
        //attach all these new items to scene 2
        scene2 = new Scene(layout2, 600 ,300);

        window.setScene(scene1); //set default scene to show
        window.setTitle("title bam");
        window.show();
    }
}
