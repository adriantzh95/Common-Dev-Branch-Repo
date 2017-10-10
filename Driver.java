import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by User on 10/10/2017.
 */
public class Driver extends Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.add(new Label("Enter a number: "), 0, 0);
        TextField tfInput = new TextField();
        pane.add(tfInput, 1, 0);

        Button btn = new Button("Calculate");
        pane.add(btn, 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

        Label lblOutput = new Label();
        pane.add(lblOutput, 1, 2);

        btn.setOnAction(event -> {
            String input = tfInput.getText();
            int num = Integer.parseInt(input);

            PrimeNumber primeNumber = new PrimeNumber(num);
            String output;
            boolean isPrime = primeNumber.isPrime();

            if(isPrime)
                output = num + " is a prime number";
            else
                output = num + " is not a prime number";

            lblOutput.setText(output);
            tfInput.clear();
            primaryStage.sizeToScene();
        });
    }


}
