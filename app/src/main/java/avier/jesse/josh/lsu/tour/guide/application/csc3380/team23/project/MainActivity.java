package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.welcomeButton);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.welcomeButton:
                Toast.makeText(getApplicationContext(),"ENJOY OUR CAMPUS",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,SelectActivity.class);
                startActivity(intent);
                break;
            default: break;
        }
    }
}
