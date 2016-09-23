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
public class ClosingProgram extends Application
{
    Stage window;
    static boolean answer;


    public static void main( String[] args )
    {
        launch( args );
    }


    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        window = primaryStage;
        window.setTitle( "new Title" );

        window.setOnCloseRequest(e -> {
            e.consume(); //tell java we will be taking over this event from here so stop doing auto close request
            closeProgram();
        }); //choose what happens on clicking close from menu bar

        Button button = new Button( "Close Program" );
        button.setOnAction( e -> closeProgram() );

        StackPane layout = new StackPane();
        layout.getChildren().add( button );

        Scene scene = new Scene( layout, 250, 250 );

        window.setScene( scene );
        window.show();
    }


    private void closeProgram()
    {
//        System.out.println( "Saved" );
//        window.close();

        boolean result = display("Title","Sure?");
        if(result) //if yes then close
        {
            window.close();
        }
    }

    //display method creates a new window
    public static boolean display( String title, String message )
    {

        Stage window3 = new Stage();

        window3.initModality( Modality.APPLICATION_MODAL ); //focus on this window
        window3.setTitle( title );
        window3.setMinWidth( 310 );

        Label label = new Label();
        label.setText( message );

        //create 2 buttons
        Button yes = new Button("Yes");
        Button no = new Button("No");

        yes.setOnAction(e -> {
            answer = true;
            window3.close(); //close window
        });

        no.setOnAction(e -> {
            answer = false;
            window3.close(); //close window
        });

        VBox layout = new VBox( 10 ); //need layout for button to sit on
        layout.getChildren().addAll( label, yes, no);
        layout.setAlignment( Pos.CENTER ); //center layout

        Scene scene = new Scene( layout );
        window3.setScene( scene );
        window3.showAndWait(); //display window and wait for it to be closed

        return answer;
    }
}
