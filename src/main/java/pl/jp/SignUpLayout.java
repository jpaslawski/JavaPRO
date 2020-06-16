package pl.jp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class SignUpLayout {

    private Label
            firstNameLabel = new Label("First Name"),
            lastNameLabel = new Label("Last Name"),
            emailLabel = new Label("E-mail"),
            passwordLabel = new Label("Password"),
            passwordConfirmLabel = new Label("Confirm Password"),
            sceneLabel = new Label("Sign Up");

    public VBox loadSignUpLayout(TextField firstNameField,
                                 TextField lastNameField,
                                 TextField emailField,
                                 PasswordField passwordField,
                                 PasswordField passwordConfirmField,
                                 Button singUpBtn,
                                 Hyperlink linkToSignUp,
                                 Label errorLabel) {
        VBox signUpBox = new VBox();
        signUpBox.setPadding(new Insets(20, 20, 20, 20));
        signUpBox.setSpacing(10);
        signUpBox.setAlignment(Pos.CENTER);

        sceneLabel.setMaxWidth(Double.MAX_VALUE);
        sceneLabel.setStyle("-fx-font-size: 20px;-fx-font-weight: bold;");
        AnchorPane.setLeftAnchor(sceneLabel, 0.0);
        AnchorPane.setRightAnchor(sceneLabel, 0.0);
        sceneLabel.setAlignment(Pos.CENTER);

        VBox fieldContainer = new VBox();
        fieldContainer.setSpacing(10);
        fieldContainer.setStyle("-fx-padding: 0 0 0 300px");

        firstNameField.setPromptText("Type your first name...");
        firstNameField.setMaxWidth(500);

        lastNameField.setPromptText("Type your last name...");
        lastNameField.setMaxWidth(500);

        emailField.setPromptText("Type the email associated with your account...");
        emailField.setMaxWidth(500);

        passwordField.setPromptText("Type your password...");
        passwordField.setMaxWidth(500);

        passwordConfirmField.setPromptText("Confirm your password...");
        passwordConfirmField.setMaxWidth(500);

        fieldContainer.getChildren().addAll(firstNameLabel, firstNameField, lastNameLabel,  lastNameField, emailLabel, emailField, passwordLabel, passwordField, passwordConfirmLabel, passwordConfirmField);


        singUpBtn.setPrefWidth(200);
        AnchorPane.setLeftAnchor(singUpBtn, 0.0);
        AnchorPane.setRightAnchor(singUpBtn, 0.0);

        signUpBox.getChildren().addAll(fieldContainer, errorLabel, singUpBtn, linkToSignUp);

        return signUpBox;
    }
}
