import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by anil on 04/06/2016.
 */
public class AlertBox extends Application
{
    Stage window;


    public static void main( String[] args )
    {
        launch( args );
    }


    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        window = primaryStage; //now can reference by window instead.
        window.setTitle( "title bam" );

        Button button1 = new Button( "Click me" );
        button1.setOnAction(e -> display("box","bam im so good at fx"));

        StackPane layout1 = new StackPane();
        layout1.getChildren().add( button1 ); //add items to our layout
        Scene scene = new Scene( layout1, 200, 200 ); //give our scene a layout and scene

        window.setScene( scene ); //set default scene to show
        window.show();
    }

    //display method creates a new window
    public static void display(String title, String message)
    {
        Stage window2 = new Stage();

        window2.initModality(Modality.APPLICATION_MODAL); //focus on this window
        window2.setTitle(title);
        window2.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        Button closeButton = new Button("close this window");
        closeButton.setOnAction(e -> window2.close()); //.close closes window.

        VBox layout = new VBox(10); //need layout for button to sit on
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER); //center layout

        Scene scene = new Scene(layout);
        window2.setScene(scene);
        window2.showAndWait(); //display window and wait for it to be closed
    }
}
