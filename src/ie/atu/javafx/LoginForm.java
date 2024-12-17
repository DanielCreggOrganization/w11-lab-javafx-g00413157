package ie.atu.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginForm extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a grid layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));
        
        // Add form elements
        Label fnameLabel = new Label("First Name:");
        grid.add(fnameLabel, 0, 0); // column 0, row 0
        
        TextField fnameField = new TextField();
        grid.add(fnameField, 1, 0); // column 1, row 0
        Label lnameLabel = new Label("Last Name:");
        grid.add(lnameLabel, 0, 1); // column 0, row 0
        TextField lnameField = new TextField();
        grid.add(lnameField, 1, 1); // column 1, row 0
        Label emailLabel = new Label("Email:");
        grid.add(emailLabel, 0, 2); // column 0, row 0
        TextField emailField = new TextField();
        grid.add(emailField, 1, 2); // column 1, row 0
        
        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 3); // column 0, row 1
        
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 3); // column 1, row 1

        Label cpasswordLabel = new Label(" Confirm:");
        grid.add(cpasswordLabel, 0, 4); // column 0, row 1
        
        PasswordField cpasswordField = new PasswordField();
        grid.add(cpasswordField, 1, 4); // column 1, row 1
        
        
        Button loginButton = new Button("Register");
        grid.add(loginButton, 1, 5); // column 1, row 2
        
        // Create scene and show
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}