package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ChooseActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Landmarks landmarks[] = new Landmarks[]{
                new Landmarks(R.drawable.tgalogo,"Student Union, Memorial Tower, Middleton Library, Foster Hall."),
                new Landmarks(R.drawable.tgalogo,"Pete Maravich Assembly Center, Tiger Stadium, Mike's Habitat, Alex Box Stadium")
        };

        landmarksAdapter adapter = new landmarksAdapter(this,R.layout.list_layout,landmarks);

        listView = (ListView) findViewById(R.id.chooseList);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header,null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView)view.findViewById(R.id.landmarkName);
                if(i == 1){
                    Intent intent1 = new Intent(getApplicationContext(),StudentUnionActivity.class);
                    Intent intent2 = new Intent(getApplicationContext(),MemorialTowerActivity.class);
                    Intent intent3 = new Intent(getApplicationContext(),MiddletonActivity.class);
                    Intent intent4 = new Intent(getApplicationContext(),FosterHallActivity.class);
                    Intent intentSelect = new Intent(getApplicationContext(),SelectActivity.class);
                    startActivity(intentSelect);
                    startActivity(intent1);
                    startActivity(intent2);
                    startActivity(intent3);
                    startActivity(intent4);
                }
                if(i == 2){
                    Intent intent1 = new Intent(getApplicationContext(),PmacActivity.class);
                    Intent intent2 = new Intent(getApplicationContext(),TigerStadiumActivity.class);
                    Intent intent3 = new Intent(getApplicationContext(),MikeHabitatActivity.class);
                    Intent intent4 = new Intent(getApplicationContext(),AlexBoxStadiumActivity.class);
                    Intent intentSelect = new Intent(getApplicationContext(),SelectActivity.class);
                    startActivity(intentSelect);
                    startActivity(intent1);
                    startActivity(intent2);
                    startActivity(intent3);
                    startActivity(intent4);
                }
            }
        });
    }
}
