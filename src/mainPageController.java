

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import com.diskmanager.*;

import java.io.File;
import java.util.Collections;
import java.util.List;
public class mainPageController {
    @FXML
    Button ScanButton1;
    @FXML 
    ListView<Node> FolderList;
    @FXML
    ScrollPane FolderListSide;

    ScrollBar scroller = new ScrollBar();
    
    

    public void Scan(ActionEvent event) throws Exception, IllegalArgumentException {
        File file = new File("./resoruce/Folder_29922.png");

        FolderManagerWindows fmw = new FolderManagerWindows("D");
        List<Folder> a= fmw.getAllFolder();
        for(Folder f:a){
            FlowPane listItems = new FlowPane();
            ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/resources/Folder_29922.png")));
            ListItem item1 = new  ListItem(f.getFolderName(),f.getFolderSize(), image);
            listItems.getChildren().add(item1.getImage());
            listItems.getChildren().add(new Label(item1.getFolderName()));
            listItems.getChildren().add(new Label(String.valueOf(item1.getFileSize())));
            FolderList.getItems().add(listItems); 
        }
    }




}
