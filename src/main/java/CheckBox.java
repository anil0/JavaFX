import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by anil on 05/06/2016.
 */
public class CheckBox extends Application
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
        window.setTitle("title");

        

        //check boxes
        javafx.scene.control.CheckBox box1 = new javafx.scene.control.CheckBox("Chicken"); //the checkbox label
        javafx.scene.control.CheckBox box2 = new javafx.scene.control.CheckBox("tuna");
        box2.setSelected(true); //check by default
        
        Button btn = new Button("Order");
        btn.setOnAction(e -> handleOptions(box1, box2));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(box1,box2,btn);

        Scene scene = new Scene(layout,200,200);

        window.setScene(scene);
        window.show();
    }

    private void handleOptions(javafx.scene.control.CheckBox box1, javafx.scene.control.CheckBox box2) {

        String message = "Your order:\n";

        if(box1.isSelected())
        {
            message += "chicken\n";
        }
        if (box2.isSelected())
        {
            message += "tuna\n";
        }
        if(!box1.isSelected() && !box2.isSelected())
        {
            message += "You didn't choose any items";
        }

        System.out.println(message);
    }
}
