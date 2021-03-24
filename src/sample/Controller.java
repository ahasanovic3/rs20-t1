package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;


public class Controller {
    public Label labela;
    public GridPane grid;
    public void Promjena (ActionEvent actionEvent){

        labela.setText("Hello World");
        grid.setStyle("-fx-background-color: #FFB3B3");
    }

}
