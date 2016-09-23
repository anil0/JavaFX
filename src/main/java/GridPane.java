import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by anil on 05/06/2016.
 */
public class GridPane extends Application{
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
        grid.setPadding(new Insets(10,10,10,10)); //insets just lets you give 4 values
        grid.setVgap(8);
        grid.setHgap(10);

        //name label
        Label nameLabel = new Label("Username:");
        javafx.scene.layout.GridPane.setConstraints(nameLabel,0,0); //item you want to add to grid and position -- first column and row

        //name textbox
        TextField nameInput = new TextField("Anil"); //this will be black and have to delete
        javafx.scene.layout.GridPane.setConstraints(nameInput,1,0); //-- second column and first row

        //pass label
        Label passLabel = new Label("Password:");
        javafx.scene.layout.GridPane.setConstraints(passLabel,0,1);

        //pass textbox
        TextField passInput = new TextField();
        passInput.setPromptText("password"); //this is hint text inside box
        javafx.scene.layout.GridPane.setConstraints(passInput,1,1);

        Button login = new Button("login");
        javafx.scene.layout.GridPane.setConstraints(login,1,2);

        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,login);

        Scene scene = new Scene(grid,300,200);
        window.setScene( scene );
        window.show();
    }
}
