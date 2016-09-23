import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Created by anil on 11/06/2016.
 */
public class TreeView extends Application
{
    Stage window;
    javafx.scene.control.TreeView<String> tree;


    public static void main( String[] args )
    {
        launch( args );
    }


    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        window = primaryStage;
        window.setTitle( "TreeView" );

        TreeItem<String> root, anil, tom;

        //root
        root = new TreeItem<>();
        root.setExpanded( true ); //expand out tree by default

        //anil branch
        anil = makeBranch( "Anil", root ); //first param, is the title of the branch, second param, is the parent
        makeBranch( "Stoke", anil );

        //tom
        tom = makeBranch( "Tom", root ); //first param, is the title of the branch, second param, is the parent
        makeBranch( "Germany", tom );

        //make tree
        tree = new javafx.scene.control.TreeView<>( root );//root meaning main trunk
        tree.setShowRoot( false ); //this hides the top root collapsable item from the tree
        tree.getSelectionModel().selectedItemProperty().addListener( ( v, oldValue, newValue ) -> {
            if( newValue != null )
            {
                System.out.println( newValue.getValue() );
            }
        } );

        StackPane layout = new StackPane();
        layout.getChildren().add( tree );
        Scene scene = new Scene( layout, 300, 300 );

        window.setScene( scene );
        window.show();
    }


    private TreeItem<String> makeBranch( String title, TreeItem<String> parent )
    {
        TreeItem<String> item = new TreeItem<>( title ); //make the item sttruucture
        item.setExpanded( true );
        parent.getChildren().add( item ); //add items to tree parent
        return item;
    }
}
