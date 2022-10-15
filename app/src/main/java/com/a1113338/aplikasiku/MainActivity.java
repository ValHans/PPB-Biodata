package com.a1113338.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private  Button btnWebs, btnMaps, btnCall, btnMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bagian_awal);
        btnWebs = (Button) findViewById(R.id.webs);
        btnCall = (Button) findViewById(R.id.call);
        btnMaps = (Button) findViewById(R.id.maps);
        btnMail = (Button) findViewById(R.id.mail);
    }
    public void bagianAwal(View view){setContentView(R.layout.bagian_awal);}
    public void bagianAlamat(View view){setContentView(R.layout.bagian_alamat);}
    public void bagianKontak(View view){setContentView(R.layout.bagian_kontak);}
    public void bagianEmail(View view){setContentView(R.layout.bagian_email);}

    public void openWeb(View view) {
        Uri webpage = Uri.parse("https://hnsvl03.blogspot.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFound){
            Log.d("implicitintent", "Can't Handle This");
        }
    }
    public void openCall(View view){
        String number = "088239924577";
        Intent call = new Intent(Intent.ACTION_DIAL);
        call.setData(Uri.fromParts("tel", number, null));
        startActivity(call);
    }
    public void openMaps(View view){
        Uri webpage = Uri.parse("https://goo.gl/maps/kwczs2kb8oyzdKs57");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException){
            Log.d("implicitintent", "Can't Handle This");
        }
    }
    public void openMail(View view){
        String email = "111202113338@mhs.dinus.ac.id";
        Intent kirim_mail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+ email));
        startActivity(kirim_mail);
    }
}