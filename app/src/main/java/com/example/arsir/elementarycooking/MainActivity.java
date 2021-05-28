package com.example.arsir.elementarycooking;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends AppCompatActivity implements YouTubePlayer.OnInitializedListener{

    private static final int RECOVERY_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerSupportFragment frag =
                (YouTubePlayerSupportFragment) getSupportFragmentManager().findFragmentById(R.id.youtube_fragment);
        frag.initialize(Config.YOUTUBE_API_KEY, this);

    }
    //YouTube фрагмент
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo("z84qLGYP6DQ"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    public void StartOptionalActivity_1(View view) {
        Intent intent = new Intent(this, OptionalActivity.class);
        startActivity(intent);
    }

    public void StartOptionalActivity_2(View view) {
        Intent intent = new Intent(this, OptionalActivity_2.class);
        startActivity(intent);
    }

    public void StartOptionalActivity_3(View view) {
        Intent intent = new Intent(this, OptionalActivity_3.class);
        startActivity(intent);
    }
    //Запуск браузера
    public void blogView(View v)
    {
        Uri address = Uri.parse("https://mylivingfood.ru/25-osnov-kulinarii-kotorye-dolzhen-znat-kazhdyy/");
        Intent openlink = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openlink);
    }

}
