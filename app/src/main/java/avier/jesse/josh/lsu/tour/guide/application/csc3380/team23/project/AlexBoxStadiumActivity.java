package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class AlexBoxStadiumActivity extends AppCompatActivity {
    private GoogleMap mMap;
    private static final LatLng alexBoxStadiumCoo = new LatLng(30.405652,-91.188047);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alex_box_stadium);
        setUpMapIfNeeded();
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
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.alexBoxStadiumLocation)).getMap();
            //Check if we were successfull in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(alexBoxStadiumCoo).title("ALEX BOX STADIUM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(alexBoxStadiumCoo,10));
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        }
    }
}
