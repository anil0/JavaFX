import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by anil on 05/06/2016.
 */
public class DropdownListener extends Application
{
    Stage window;


    public static void main( String[] args )
    {
        launch( args );
    }


    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        window = primaryStage;
        window.setTitle( "title" );

        Button btn = new Button( "Click me" );

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getitems gets items from list
        choiceBox.getItems().add( "Apples" );
        choiceBox.getItems().addAll( "bananas" );
        choiceBox.setValue( "Apples" ); //setDefault

        //listen for any selection changes
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v,oldValue,newValue) -> System.out.println(newValue) );

        VBox layout = new VBox( 10 );
        layout.setPadding( new Insets( 10, 10, 10, 10 ) );
        layout.getChildren().addAll( choiceBox, btn );

        Scene scene = new Scene( layout, 210, 210 );

        window.setScene( scene );
        window.show();
    }

}
