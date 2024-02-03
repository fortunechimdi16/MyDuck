import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Buttons extends Application {

    private RadioButton redRadioButton, blueRadioButton;
    private VBox root;
    private TextField textField;

    public void start(Stage primaryStage) {
        textField = new TextField();
        textField.setPromptText("Enter text here");
        textField.setMaxWidth(200);

        redRadioButton = createRadioButtonWithImage("Red!", "dog.jpg", Color.RED);
        blueRadioButton = createRadioButtonWithImage("Blue!", "cat.jpg", Color.BLUE);

        ToggleGroup toggleGroup = new ToggleGroup();
        redRadioButton.setToggleGroup(toggleGroup);
        blueRadioButton.setToggleGroup(toggleGroup);

        HBox buttonBox = new HBox(20, redRadioButton, blueRadioButton);
        buttonBox.setAlignment(Pos.CENTER);

        root = new VBox(10, textField, buttonBox);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: beige;");

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Buttons");
        primaryStage.setScene(scene);

        textField.setOnAction(event -> {
            String enteredText = textField.getText();
            System.out.println("Entered Text: " + enteredText);
        });

        primaryStage.show();
    }

    private RadioButton createRadioButtonWithImage(String buttonText, String imagePath, Color bgColor) {
        Image buttonImage = new Image(imagePath);
        ImageView imageView = new ImageView(buttonImage);
        imageView.setFitWidth(120);
        imageView.setPreserveRatio(true);

        RadioButton radioButton = new RadioButton(buttonText);
        radioButton.setOnAction(this::processColorButton);
        radioButton.setStyle("-fx-background-color: " + toHexCode(bgColor) + ";");
        radioButton.setUserData(imageView);
        return radioButton;
    }

    private String toHexCode(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }

    public void processColorButton(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) event.getSource();
        ImageView imageView = (ImageView) selectedRadioButton.getUserData();

        root.getChildren().remove(2, root.getChildren().size());
        root.getChildren().add(imageView);
        root.setStyle(selectedRadioButton.getStyle());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
