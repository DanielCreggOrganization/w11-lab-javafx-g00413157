package ie.atu.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Counter extends Application {
    private int count = 0;
    
    @Override
    public void start(Stage primaryStage) {
        // Create display
        Label num1 = new Label("0");
        Label num2 = new Label("0");
        
        // Create buttons
        Button additionButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("x");
        Button divisionButton = new Button("/");
        Button equalButton = new Button("=");
        
        
        // Add event handlers
            additionButton.setOnAction(e -> {
            count++;
            num1.setText(String.valueOf(count));
        });
        
        subtractButton.setOnAction(e -> {
            count--;
            num1.setText(String.valueOf(count));
        });
        multiplyButton.setOnAction(e -> {
            count++;
            num2.setText(String.valueOf(count));
        });
        
        divisionButton.setOnAction(e -> {
            count--;
            num2.setText(String.valueOf(count));
        });
        equalButton.setOnAction(e -> {
           
        });
        
        // Create layout
        HBox layout = new HBox(10);
        layout.getChildren().addAll(subtractButton, 
                                num1, 
                                  additionButton,
                                  multiplyButton,
                                  num2,
                                  divisionButton,
                                  equalButton );
        
        // Show the stage
        Scene scene = new Scene(layout, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

