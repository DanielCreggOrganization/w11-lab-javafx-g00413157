package ie.atu.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application{
    private Label display =new Label("0");
    private String currentOperation = "";
    private double result =0;
    @Override
    public void start(Stage primaryStage)  {
      GridPane grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25));
    
      grid.add(display,0,0,4,1);
      String[]buttonLabels={
        "7","8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", " ", "=", "+"
      }; 
      int row =1;
      String label;
          Button button = new Button(label);
        button.setOnAction(e -> handleButtonPress(label));
        int col;
                grid.add(button, col, row);
        col++;
        if (col == 4) {
            col = 0;
            row++;
        }
        
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonPress(String label) {
        // Implement the logic for handling button presses here
    }

    public static void main(String[] args) {
        launch(args);
    }
    }
    
    
    

