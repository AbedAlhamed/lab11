package com.example.videoplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    private String path;
    MediaPlayer mediaPlayer;
    @FXML
    private MediaView mediaV ;
    @FXML
    private Slider vol;



    public void chosse(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        path = file.toURI().toString();

        if(path != null){
            mediaPlayer = new MediaPlayer(new Media(path));
            //mediaV= new MediaView(mediaPlayer);
            mediaV.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            mediaPlayer.stop();


        }
    }

    public void runv(ActionEvent actionEvent) {
        mediaPlayer.play();
    }
    public void stopv(ActionEvent actionEvent) {
        mediaPlayer.stop();
    }
    public void pouse(ActionEvent actionEvent) {
        mediaPlayer.pause();

    }


    public void onvol(MouseEvent mouseEvent) {

    }
}