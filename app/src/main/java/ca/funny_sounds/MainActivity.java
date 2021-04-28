package ca.funny_sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import ca.funny_sounds.R;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int current = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sound(View view) {
        final int  id = view.getId();
        switch(id) {
            case R.id.Sound_1:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 1){
                        mediaPlayer.pause();


                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.sound_1);
                        mediaPlayer.start();
                        current = 1;
                    }

                }else{
                    mediaPlayer = MediaPlayer.create(this, R.raw.sound_1);
                    mediaPlayer.start();
                    current = 1;
                }
                break;
            case R.id.Sound_2:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 2){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.sound_2);
                        mediaPlayer.start();
                        current = 2;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.sound_2);
                    mediaPlayer.start();
                    current = 2;
                }
                break;
            case R.id.Sound_3:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 3){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.sound_3);
                        mediaPlayer.start();
                        current = 3;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.sound_3);
                    mediaPlayer.start();
                    current = 3;
                }
                break;
            case R.id.Sound_4:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 4){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.sound_4);
                        mediaPlayer.start();
                        current = 4;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.sound_4);
                    mediaPlayer.start();
                    current = 4;
                }
                break;
            case R.id.Sound_5:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 5){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.sound_5);
                        mediaPlayer.start();
                        current = 5;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.sound_5);
                    mediaPlayer.start();
                    current = 5;
                }
                break;
            case R.id.Sound_6:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 6){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.sound_6);
                        mediaPlayer.start();
                        current = 6;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.sound_6);
                    mediaPlayer.start();
                    current = 6;
                }
                break;
            case R.id.Sound_7:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 7){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.whistle);
                        mediaPlayer.start();
                        current = 7;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.whistle);
                    mediaPlayer.start();
                    current = 7;
                }
                break;
            case R.id.Sound_8:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 8){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.shhh);
                        mediaPlayer.start();
                        current = 8;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.shhh);
                    mediaPlayer.start();
                    current = 8;
                }
                break;
            case R.id.Sound_9:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 9){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
                        mediaPlayer.start();
                        current = 9;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
                    mediaPlayer.start();
                    current = 9;
                }
                break;
            case R.id.Sound_10:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 10){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.sneeze);
                        mediaPlayer.start();
                        current = 10;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.sneeze);
                    mediaPlayer.start();
                    current = 10;
                }
                break;
            case R.id.Sound_11:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 11){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.airhorn);
                        mediaPlayer.start();
                        current = 11;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.airhorn);
                    mediaPlayer.start();
                    current = 11;
                }
                break;
            case R.id.Sound_12:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 12){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.awww);
                        mediaPlayer.start();
                        current = 12;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.awww);
                    mediaPlayer.start();
                    current = 12;
                }
                break;
            case R.id.Sound_13:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 13){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
                        mediaPlayer.start();
                        current = 13;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
                    mediaPlayer.start();
                    current = 13;
                }
                break;
            case R.id.Sound_14:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 14){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.telephone);
                        mediaPlayer.start();
                        current = 14;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.telephone);
                    mediaPlayer.start();
                    current = 14;
                }
                break;
            case R.id.Sound_15:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 15){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.bongo);
                        mediaPlayer.start();
                        current = 15;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.bongo);
                    mediaPlayer.start();
                    current = 15;
                }
                break;
            case R.id.Sound_16:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 16){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.piano);
                        mediaPlayer.start();
                        current = 16;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.piano);
                    mediaPlayer.start();
                    current = 16;
                }
                break;
            case R.id.Sound_17:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 17){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.doorbell);
                        mediaPlayer.start();
                        current = 17;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.doorbell);
                    mediaPlayer.start();
                    current = 17;
                }
                break;
            case R.id.Sound_18:
                if(mediaPlayer!=null && mediaPlayer.isPlaying()){
                    if(current == 18){
                        mediaPlayer.pause();
                    }else{
                        mediaPlayer.pause();
                        mediaPlayer = MediaPlayer.create(this, R.raw.loser);
                        mediaPlayer.start();
                        current = 18;
                    }
                }else {
                    mediaPlayer = MediaPlayer.create(this, R.raw.loser);
                    mediaPlayer.start();
                    current = 18;
                }
                break;
            default:
                mediaPlayer.pause();
                current = 0;
                break;
        }

    }
}