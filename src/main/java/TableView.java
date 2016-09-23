import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by anil on 11/06/2016.
 */
public class TableView extends Application
{
    Stage window;
    javafx.scene.control.TableView<Product> table;
    TextField nameInput,priceInput,quantityInput;

    public static void main( String[] args )
    {
        launch( args );
    }


    @Override
    public void start( Stage primaryStage ) throws Exception
    {
        window = primaryStage;
        window.setTitle("tablessssss");

        //making columns
        //name column
        TableColumn<Product,String> nameColumn = new TableColumn<>("Name"); //The "Name" is the column header can be anything
        nameColumn.setMinWidth(200); //keep columns orgnanised
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name")); //set the value of this column items to the vlaue from out product names, "name" is the variable

        //price column
        TableColumn<Product,Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100); //keep columns orgnanised
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //price column
        TableColumn<Product,Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100); //keep columns orgnanised
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        //make bottom bar textfields
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("Price");

        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");

        Button btnAdd = new Button("Add");
        Button btnDelete = new Button("Delete");

        //make Horizontal layout at bottom for button and text fields
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, btnAdd, btnDelete);

        //make table
        table = new javafx.scene.control.TableView<>();
        table.setItems(getProducts()); //the data to use for the table which is from our list
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table,hBox);

        Scene scene = new Scene(vBox,600,300);

        window.setScene(scene);
        window.show();
    }

    //get all products and put them in an observable list so fx can use it
    public ObservableList<Product> getProducts()
    {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop",859.99,20));
        products.add(new Product("Gigabyte Graphics Card",600.00,50));
        products.add(new Product("i7 Processors",300.00,30));
        products.add(new Product("Wireless Mouse",70.00,10));

        return products;
    }
}
