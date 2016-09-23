
/**
 * Created by anil on 04/06/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application //application is basically the javafx class stuff //implements event handler is like when you click button
{
    Button button;


    public static void main( String[] args )
    {
        launch( args ); //set up the java fx stuff
    }


    @Override
    public void start( Stage primaryStage ) throws Exception //calls start and this is where main code goes
    {
        //primary stage is our window instance
        primaryStage.setTitle( "First Tryyyyyyyyyy" ); //sets title

        button = new Button(); //create a button
        button.setText( "Click me" );

        //button.setOnAction(this);//when they click button, the code to run is in this same class
        //lamda expressions
        //e represents event parameter
        // -> write code after that
        button.setOnAction(e -> {
            System.out.println("Bam");
            System.out.println("Bam!");
        });

        StackPane layout = new StackPane(); //the layout is what you need before you can add things to the scene
        layout.getChildren().add( button );

        Scene scene = new Scene( layout, 300, 250 ); //the scene is where everything sits on your window. Give it your layout and a size
        primaryStage.setScene( scene ); //use this scene for our window.
        primaryStage.show(); //this makes our window visible

    }


//    public void handle( ActionEvent event )
//    {
//        if( event.getSource() == button ) //event.getSource() knows which button was clicked
//        {
//            //do stuff
//            System.out.println( "Bam!" );
//        }
//    }
}
