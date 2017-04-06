package rpuls.yahtzeesheets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int player1Score=0;
    int player2Score=0;
    int player3Score=0;
    int player1UpperScore;
    int player2UpperScore;
    int player3UpperScore;
    TextView p1bonus = (TextView) findViewById(R.id.textBonusP1);
    TextView p2bonus = (TextView) findViewById(R.id.textBonusP2);
    TextView p3bonus = (TextView) findViewById(R.id.textBonusP3);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateBoeard(){
        //reset score counts
        player1Score=0;
        player2Score=0;
        player3Score=0;
        player1UpperScore=0;
        player2UpperScore=0;
        player3UpperScore=0;
        //player 1 upper section count
        player1UpperScore = Integer.parseInt(findViewById(R.id.editTextP1Ones).toString())
                + Integer.parseInt(findViewById(R.id.editTextP1Twos).toString())
                + Integer.parseInt(findViewById(R.id.editTextP1Threes).toString())
                + Integer.parseInt(findViewById(R.id.editTextP1Fours).toString())
                + Integer.parseInt(findViewById(R.id.editTextP1Fives).toString())
                + Integer.parseInt(findViewById(R.id.editTextP1Sixes).toString());

        //player 2 upper section count
        player2UpperScore = Integer.parseInt(findViewById(R.id.editTextP2Ones).toString())
                + Integer.parseInt(findViewById(R.id.editTextP2Twos).toString())
                + Integer.parseInt(findViewById(R.id.editTextP2Threes).toString())
                + Integer.parseInt(findViewById(R.id.editTextP2Fours).toString())
                + Integer.parseInt(findViewById(R.id.editTextP2Fives).toString())
                + Integer.parseInt(findViewById(R.id.editTextP2Sixes).toString());

        //player 3 upper section count
        player3UpperScore = Integer.parseInt(findViewById(R.id.editTextP3Ones).toString())
                + Integer.parseInt(findViewById(R.id.editTextP3Twos).toString())
                + Integer.parseInt(findViewById(R.id.editTextP3Threes).toString())
                + Integer.parseInt(findViewById(R.id.editTextP3Fours).toString())
                + Integer.parseInt(findViewById(R.id.editTextP3Fives).toString())
                + Integer.parseInt(findViewById(R.id.editTextP3Sixes).toString());

        //Checking for bonus on all players
        if(player1UpperScore>63){
            p1bonus.setText("35");
            player1Score += 35;
        }
        if(player2UpperScore>63){
            p2bonus.setText("35");
            player2Score += 35;
        }
        if(player3UpperScore>63){
            p3bonus.setText("35");
            player3Score += 35;
        }


    }
}
