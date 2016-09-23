import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by anil on 05/06/2016.
 */
public class Layouts extends Application
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
        window.setTitle( "Title" );

        HBox topMenu = new HBox();
        Button btna = new Button( "File" );
        Button btnb = new Button( "Edit" );
        Button btnc = new Button( "View" );
        topMenu.getChildren().addAll( btna, btnb, btnc );

        VBox leftMenu = new VBox();
        Button btnd = new Button( "d" );
        Button btne = new Button( "e" );
        Button btnf = new Button( "f" );
        leftMenu.getChildren().addAll( btnd, btne, btnf );

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene( borderPane, 250, 250 );

        window.setScene( scene );
        window.show();
    }
}
