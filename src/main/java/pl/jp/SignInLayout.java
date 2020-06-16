package pl.jp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class SignInLayout {

    private Label
            emailLabel = new Label("E-mail"),
            passwordLabel = new Label("Password"),
            sceneLabel = new Label("Sign In");
    private VBox signInBox = new VBox();

    public VBox loadSignInLayout(TextField emailField, PasswordField passwordField, Button singInBtn, Hyperlink linkToSignUp, Label errorLabel) {

        signInBox.setPadding(new Insets(20, 20, 20, 20));
        signInBox.setSpacing(10);
        signInBox.setAlignment(Pos.CENTER);

        sceneLabel.setMaxWidth(Double.MAX_VALUE);
        sceneLabel.setStyle("-fx-font-size: 20px;-fx-font-weight: bold;");
        AnchorPane.setLeftAnchor(sceneLabel, 0.0);
        AnchorPane.setRightAnchor(sceneLabel, 0.0);
        sceneLabel.setAlignment(Pos.CENTER);

        VBox fieldContainer = new VBox();
        fieldContainer.setSpacing(10);
        fieldContainer.setStyle("-fx-padding: 0 0 0 300px");

        emailField.setPromptText("Type the email associated with your account...");
        emailField.setMaxWidth(500);
        passwordField.setPromptText("Type your password...");
        passwordField.setMaxWidth(500);

        fieldContainer.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField);

        singInBtn.setPrefWidth(200);
        AnchorPane.setLeftAnchor(singInBtn, 0.0);
        AnchorPane.setRightAnchor(singInBtn, 0.0);

        signInBox.getChildren().addAll(sceneLabel, fieldContainer, errorLabel, singInBtn, linkToSignUp);

        return signInBox;
    }
}
