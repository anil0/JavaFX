/**
 * Created by anil on 11/06/2016.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by anil on 11/06/2016.
 */
public class css extends Application
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

        javafx.scene.layout.GridPane grid = new javafx.scene.layout.GridPane();
        grid.setPadding( new Insets( 10, 10, 10, 10 ) ); //insets just lets you give 4 values
        grid.setVgap( 8 );
        grid.setHgap( 9 );

        Label nameLabel = new Label( "Username:" );
        javafx.scene.layout.GridPane.setConstraints( nameLabel, 0, 0 ); //item you want to add to grid and position -- first column and row

        //name textbox
        TextField nameInput = new TextField( "Anil" ); //this will be black and have to delete
        javafx.scene.layout.GridPane.setConstraints( nameInput, 1, 0 ); //-- second column and first row

        //pass label
        Label passLabel = new Label( "Password:" );
        javafx.scene.layout.GridPane.setConstraints( passLabel, 0, 1 );

        //pass textbox
        TextField passInput = new TextField();
        passInput.setPromptText( "password" ); //this is hint text inside box
        javafx.scene.layout.GridPane.setConstraints( passInput, 1, 1 );

        Button login = new Button( "login" );
        javafx.scene.layout.GridPane.setConstraints( login, 1, 2 );

        Button signUp = new Button( "Sign Up" );
        signUp.getStyleClass().add("button-blue");
        javafx.scene.layout.GridPane.setConstraints( signUp, 1, 3 );

        // setUserAgentStylesheet(STYLESHEET_CASPIAN);

        grid.getChildren().addAll( nameLabel, nameInput, passLabel, passInput, login, signUp );

        Scene s = new Scene( grid, 300, 200 );
        //add new css stylesheet to ours
        //s.setUserAgentStylesheet("Viper.css");
        //setUserAgentStylesheet("Viper.css");
        s.getStylesheets().add("Viper.css");

        window.setScene( s );
        window.show();
    }
}