package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SelectActivity extends FragmentActivity implements View.OnClickListener {
    Button createButton, chooseButton;

    private GoogleMap mMap;
    private static final LatLng lsuCoo = new LatLng(30.413258,-91.180002);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        setUpMapIfNeeded();
        createButton = (Button) findViewById(R.id.createButton);
        createButton.setOnClickListener(this);
        chooseButton = (Button) findViewById(R.id.chooseButton);
        chooseButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        //Do a null check to coonfirm that we have not already instantiated the map.
        if (mMap == null) {
            //Try to obtain the map from the support map fragment in API.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.personalMap)).getMap();
            //Check if we were successfull in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(lsuCoo).title("Me"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lsuCoo,15));
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.createButton:
                Intent intentCreate = new Intent(this,createActivity.class);
                startActivity(intentCreate);
                break;
            case R.id.chooseButton:
                Intent intentChoose = new Intent(this,ChooseActivity.class);
                startActivity(intentChoose);
                break;
            default: break;
        }
    }
}