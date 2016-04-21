package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class createActivity extends AppCompatActivity {
    ListView listView;
    String string = "", intent1 = "", intent2 = "", intent3 = "", intent4 = "";
    int intentCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        final Intent intentSelect = new Intent(getApplicationContext(),SelectActivity.class);

        Landmarks landmarks[] = new Landmarks[]{
                new Landmarks(R.drawable.alexbox,"Alex Box Stadium"),
                new Landmarks(R.drawable.fosterhall,"Foster Hall"),
                new Landmarks(R.drawable.memorialtower,"Memorial Tower"),
                new Landmarks(R.drawable.middleton,"Middleton Library"),
                new Landmarks(R.drawable.mikehabitat,"Mike's Habitat"),
                new Landmarks(R.drawable.pmac,"Pete Maravich Assembly Center"),
                new Landmarks(R.drawable.studentunion,"Student Union"),
                new Landmarks(R.drawable.tigerstadium,"Tiger Stadium")
        };

        landmarksAdapter adapter = new landmarksAdapter(this,R.layout.list_layout,landmarks);

        listView = (ListView) findViewById(R.id.createList);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header,null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView)view.findViewById(R.id.landmarkName);
                string = (String) textView.getText();
                if((string != intent1) && (string != intent2) && (string != intent3) && (string != intent4)) {
                    switch(string){
                        case "Alex Box Stadium":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentABS = new Intent(getApplicationContext(),AlexBoxStadiumActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentABS);
                            break;
                        case "Foster Hall":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentFH = new Intent(getApplicationContext(),FosterHallActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentFH);
                            break;
                        case "Memorial Tower":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentMT = new Intent(getApplicationContext(),MemorialTowerActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentMT);
                            break;
                        case "Middleton Library":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentML = new Intent(getApplicationContext(),MiddletonActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentML);
                            break;
                        case "Mike's Habitat":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentMH = new Intent(getApplicationContext(),MikeHabitatActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentMH);
                            break;
                        case "Pete Maravich Assembly Center":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentPMAC = new Intent(getApplicationContext(),PmacActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentPMAC);
                            break;
                        case "Student Union":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentSU = new Intent(getApplicationContext(),StudentUnionActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentSU);
                            break;
                        case "Tiger Stadium":
                            if (intent1 == "")
                                intent1 = string;
                            else if (intent2 == "")
                                intent2 = string;
                            else if (intent3 == "")
                                intent3 = string;
                            else if (intent4 == "")
                                intent4 = string;
                            intentCounter++;
                            Toast.makeText(getApplicationContext(),"You have " + (4 - intentCounter) + " landmarks left",Toast.LENGTH_SHORT).show();
                            Intent intentTG = new Intent(getApplicationContext(),TigerStadiumActivity.class);
                            if(intentCounter == 4)
                                startActivity(intentSelect);
                            startActivity(intentTG);
                            break;
                        default: break;
                    }
                }
                else
                    Toast.makeText(getApplicationContext(),"This landmark has been already selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}