import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by anil on 11/06/2016.
 */
public class Menu extends Application
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
        window.setTitle("Menu");

        //file menu
        javafx.scene.control.Menu fileMenu = new javafx.scene.control.Menu("_File"); //creates the menu icon such as File
        //file menu items
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("new file"));//way to add click functionality
        fileMenu.getItems().add(newFile);

        //fileMenu.getItems().add(new MenuItem("New...")); //creates the items within that menu option
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new SeparatorMenuItem()); //separating line
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit"));

        //add menus to a menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu); //add all menus to the bar

        //layout
        BorderPane layout = new BorderPane();
        layout.setTop(menuBar); //add bar to top of layout

        Scene scene = new Scene(layout,300,300);

        window.setScene(scene);
        window.show();
    }
}
