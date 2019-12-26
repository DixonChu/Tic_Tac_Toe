package sample.view;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import sample.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    /*
     *        [0]       [1]      [2]
     * [0]  [0][0] |  [1][0] |  [2][0]  [0]
     *     --------------------------
     * [1]  [0][1] |  [1][1] |  [2][1]  [1]
     *     --------------------------
     * [2]  [0][2] |  [1][2] |  [2][2]  [2]
     *        [0]      [1]       [2]
     */

    @FXML
    Button field00; //[0][0]

    @FXML
    Button field01; //[0][1]

    @FXML
    Button field02; //[0][2]

    @FXML
    Button field03; //[1][0]

    @FXML
    Button field04; //[1][1]

    @FXML
    Button field05; //[1][2]

    @FXML
    Button field06; //[2][0]

    @FXML
    Button field07; //[2][1]

    @FXML
    Button field08; //[2][2]

    @FXML
    GridPane gridPane;

    @FXML
    Label winner;

    @FXML
    void reset() {
        ObservableList<Node> children = gridPane.getChildren();
            field00.setText("");
            field01.setText("");
            field02.setText("");
            field03.setText("");
            field04.setText("");
            field05.setText("");
            field06.setText("");
            field07.setText("");
            field08.setText("");
        for (Node child : children) {
            child.setDisable(false);
            player = 1;
        }
    }

    private int player = 1;
    private int counter = 0;


    private void playerWins() {
        ObservableList<Node> children = gridPane.getChildren();
        for (Node child : children) {
            child.setDisable(true);
        }
    }

    public void checkState() {
        if ((field00.getText().equals(field03.getText()) && field00.getText().equals(field06.getText()) && field00.getText().length() > 0 ||
                field01.getText().equals(field04.getText()) && field01.getText().equals(field07.getText()) && field01.getText().length() > 0 ||
                field02.getText().equals(field05.getText()) && field02.getText().equals(field08.getText()) && field02.getText().length() > 0 ||

                field00.getText().equals(field01.getText()) && field00.getText().equals(field02.getText()) && field00.getText().length() > 0 ||
                field03.getText().equals(field04.getText()) && field03.getText().equals(field05.getText()) && field03.getText().length() > 0 ||
                field06.getText().equals(field07.getText()) && field06.getText().equals(field08.getText()) && field06.getText().length() > 0 ||

                field00.getText().equals(field04.getText()) && field00.getText().equals(field08.getText()) && field00.getText().length() > 0 ||
                field02.getText().equals(field04.getText()) && field02.getText().equals(field06.getText())) && field02.getText().length() > 0) {

            winner.setText(winner.getText() + " wins the game!");
            playerWins();
        }

    }

    private void currentPlayer() {
        if (player == 1) {
            winner.setText("X");
        } else {
            winner.setText("O");
        }
    }


    @FXML
    public void play(javafx.event.ActionEvent event) {
        Button button = (Button) event.getSource();

        currentPlayer();
        if (player == 1) {
            button.setText("X");
            button.setDisable(true);
            player = 0; // Change player to 0, so it is teh next person turn
        } else if (player == 0) {
            button.setText("O");
            button.setDisable(true);
            player = 1; // Change the player back to 1
        }
        counter++;
        if (counter > 4) {
            checkState();
        }
    }


}
