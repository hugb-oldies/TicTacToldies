package is.ru.stringcalculator;

import java.util.*;
import java.util.regex.Matcher;
import java.fx.*;

public class  Tictactoe{

    public static void main(String[] args){
	launch(args);
    } 

    public void start (Stage primaryStage) throws Exception{
	primaryStage.setTitle("asdf");
	button = new Button();
	button.setText("Click me");

	StackPane layout = new StackPane();
	layout.getChildren().add(button);
	
	Scene scene = new Scene(layout, 300, 250);
	primaryStage.setScene(scene);
	primaryStage.show();
    }
}
