package com.example.vasilyevd.berserkcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.vasilyevd.berserkcounter.Model.Player;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MyApp";
    Player player = new Player();
    Button newGameButton;
    Button newTurnButton;
    Button dec1;
    Button dec2;
    Button dec3;
    Button inc1;
    Button newCoin;
    TextView coinView;
    byte deltaMana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newGameButton = (Button) (findViewById(R.id.newGameButton));
        newTurnButton = (Button) (findViewById(R.id.turnButton));
        dec1 = (Button) (findViewById(R.id.decOneButton));
        dec2 = (Button) (findViewById(R.id.decTwoButton));
        dec3 = (Button) (findViewById(R.id.decThreeButton));
        inc1 = (Button)(findViewById(R.id.incOneButton));
        newCoin = (Button) findViewById(R.id.addNewCoin);
        coinView = (TextView)(findViewById(R.id.coinView));
        Log.e(TAG, "WORK!");
        newGameButton.setOnClickListener(this);
        newTurnButton.setOnClickListener(this);
        dec1.setOnClickListener(this);
        dec2.setOnClickListener(this);
        dec3.setOnClickListener(this);
        inc1.setOnClickListener(this);
        newCoin.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.newGameButton:
                player.newGame();
                coinView.setText(player.getCoinStatus());
                Log.e(TAG, "NEW GAME!");
                break;
            case R.id.turnButton:
                player.newTurn();
                coinView.setText(player.getCoinStatus());
                Log.e(TAG, "NEW TURN!");
                break;
            case R.id.decOneButton:
                deltaMana = -1;
                player.changeCurrentCoin(deltaMana);
                coinView.setText(player.getCoinStatus());
                Log.e(TAG, "-1!");
                break;
            case R.id.decTwoButton:
                deltaMana = -2;
                player.changeCurrentCoin(deltaMana);
                coinView.setText(player.getCoinStatus());
                Log.e(TAG, "-2!");
                break;
            case R.id.decThreeButton:
                deltaMana = -3;
                player.changeCurrentCoin(deltaMana);
                coinView.setText(player.getCoinStatus());
                Log.e(TAG, "-3!");
                break;
            case R.id.incOneButton:
                deltaMana = 1;
                player.changeCurrentCoin(deltaMana);
                coinView.setText(player.getCoinStatus());
                Log.e(TAG, "+1!");
                break;
            case R.id.addNewCoin:
                player.newCoin();
                coinView.setText(player.getCoinStatus());
                Log.e(TAG, "+1 coin!");
                break;
        }
    }
}
