package com.example.legendarywicho.myapplication;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;

        import java.text.NumberFormat;

public class CourtCounter extends AppCompatActivity {

    int scoreForTeam1=0;
    int scoreForTeam2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
    }


//For team 1
    public void ThreePoints (View view){

        scoreForTeam1= scoreForTeam1+3;
        display(scoreForTeam1);
    }



    public void TwoPoints (View view){

        scoreForTeam1=scoreForTeam1+2;
        display(scoreForTeam1);


    }


    public void OneShot (View view){


        scoreForTeam1=scoreForTeam1+1;
        display(scoreForTeam1);

    }

    // Para el equipo 2



    public void Threeshot2(View view){


        scoreForTeam2=scoreForTeam2+3;
        display2(scoreForTeam2);


    }



    public void TwoCountesShotForTeam2(View view){

        scoreForTeam2=scoreForTeam2+2;
        display2(scoreForTeam2);

    }


    public void OneShotOneKill(View view){
        scoreForTeam2=scoreForTeam2+1;
        display2(scoreForTeam2);

    }




    public void Restart (View view){

        scoreForTeam2=0;
        scoreForTeam1=0;
        display(scoreForTeam1);
        display2(scoreForTeam2);


    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_forTeam1);
        quantityTextView.setText("" + number);
    }

    private void display2 (int number2){
        TextView scoreForTeam2 =(TextView) findViewById(R.id.score_forTeam2);
        scoreForTeam2.setText(""+number2);
    }

}
