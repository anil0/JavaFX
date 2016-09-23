import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by anil on 05/06/2016.
 */
public class ComboBox extends Application
{
    Stage window;
    javafx.scene.control.ComboBox<String> comboBox;


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

        comboBox = new javafx.scene.control.ComboBox<>();
        comboBox.getItems().addAll( "Good will hunting", "st. vincent", "blackhat" );

        comboBox.setPromptText( "What is your favourite movie?" );

        comboBox.setOnAction( e -> System.out.println( comboBox.getValue() ) );

        VBox layout = new VBox( 10 );
        layout.setPadding( new Insets( 10, 10, 10, 10 ) );
        layout.getChildren().addAll( comboBox, btn );

        Scene scene = new Scene( layout, 300, 300 );

        window.setScene( scene );
        window.show();
    }
}
