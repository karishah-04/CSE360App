package CSE360App;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class AdminInterface {

	private Button logoutButton = new Button("Logout");
	private Button OTPGenerator = new Button("OTP Password");
	private Button ResetPassword = new Button ("Reset Password for User");
	private Button DeleteUser = new Button ("Delete User");
	
	
	public AdminInterface(Stage primaryStage){
	VBox layout = new VBox(10);
	layout.setAlignment(Pos.CENTER);
	Scene signUpScene = new Scene(layout, 1000, 800);
	primaryStage.setScene(signUpScene);
	primaryStage.setTitle("Admin Main Page");
	
	logoutButton.setLayoutX(900);
	logoutButton.setLayoutY(250);
	
	OTPGenerator.setLayoutX(900);
	OTPGenerator.setLayoutY(350);
	
	ResetPassword.setLayoutX(900);
	ResetPassword.setLayoutY(350);
	
	DeleteUser.setLayoutX(900);
	DeleteUser.setLayoutY(350);
	
	logoutButton.setOnAction(e -> {
		new LoginInterface(primaryStage);
	});
    Label welcomeLabel = new Label("Welcome! You are logged in!");
    layout.getChildren().addAll(welcomeLabel, logoutButton, OTPGenerator, ResetPassword,DeleteUser);
	}
	
}