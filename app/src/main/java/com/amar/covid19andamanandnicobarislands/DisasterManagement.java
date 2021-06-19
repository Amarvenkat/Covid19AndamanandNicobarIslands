package com.amar.covid19andamanandnicobarislands;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.amar.covid19andamanandnicobarislands.Adapters.MainRecyclerAdapter;
import com.amar.covid19andamanandnicobarislands.CollectionFood.CollectionFoodMain;
import com.amar.covid19andamanandnicobarislands.HealthWorkerAssigning.HealthWorkerAssigning;
import com.amar.covid19andamanandnicobarislands.MigrantLabour.LabourDetails;
import com.amar.covid19andamanandnicobarislands.Orphan.OrphanHome;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Accommodation;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Ambulance;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Fire;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.FreeFood;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Fundraisers;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.GovHelpline;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Hospital;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Other;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Police;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Testinglab;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Transportation;
import com.amar.covid19andamanandnicobarislands.Unorganizedworker.UnorganizedMain;

import java.util.ArrayList;

public class DisasterManagement extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Integer> titlearray      = new ArrayList<Integer>();
    ArrayList<Integer> decriptionarray = new ArrayList<Integer>();
    ArrayList<Integer> iconarray       = new ArrayList<Integer>();
    CardView travelcard,labour,helpline,unorganized,collectionfood,healthworker,orphan,medicalstore,volentire;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_management);
        recyclerView = (RecyclerView) findViewById(R.id.mainrecycler);

        travelcard = (CardView) findViewById(R.id.travelpasscard);
        labour = (CardView) findViewById(R.id.labourcard);
        helpline = (CardView) findViewById(R.id.helpline);
        unorganized = (CardView) findViewById(R.id.unorganizedworker);
        collectionfood = (CardView) findViewById(R.id.collectionfood);
        healthworker = (CardView) findViewById(R.id.healthworker);
        orphan = (CardView) findViewById(R.id.orphan);
        medicalstore = (CardView) findViewById(R.id.medicalstore);

        titlearray.add(R.string.covid_19_testing_lab);
        titlearray.add(R.string.free_food);
        titlearray.add(R.string.fundraisers);
        titlearray.add(R.string.hospitals_and_centers);
        titlearray.add(R.string.police);
        titlearray.add(R.string.government_helpline);
        titlearray.add(R.string.accommodation_and_shelter_homes);
        titlearray.add(R.string.transportation);
        titlearray.add(R.string.fire_brigade);
        titlearray.add(R.string.ambulance);
        titlearray.add(R.string.other);

        decriptionarray.add(R.string.dec0);
        decriptionarray.add(R.string.dec1);
        decriptionarray.add(R.string.dec2);
        decriptionarray.add(R.string.dec3);
        decriptionarray.add(R.string.dec4);
        decriptionarray.add(R.string.dec5);
        decriptionarray.add(R.string.dec6);
        decriptionarray.add(R.string.dec7);
        decriptionarray.add(R.string.dec8);
        decriptionarray.add(R.string.dec9);
        decriptionarray.add(R.string.dec10);

        iconarray.add(R.drawable.lab);
        iconarray.add(R.drawable.food);
        iconarray.add(R.drawable.fund);
        iconarray.add(R.drawable.hosp);
        iconarray.add(R.drawable.police);
        iconarray.add(R.drawable.govhelp);
        iconarray.add(R.drawable.home);
        iconarray.add(R.drawable.trans);
        iconarray.add(R.drawable.fire);
        iconarray.add(R.drawable.ambu);
        iconarray.add(R.drawable.other);

        MainRecyclerAdapter mainrecycleradapter = new MainRecyclerAdapter(this,titlearray,decriptionarray,iconarray);

        recyclerView.setAdapter(mainrecycleradapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        travelcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://southandaman.nic.in/whos-who/"));
                startActivity(intent);

            }
        });

        labour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DisasterManagement.this, LabourDetails.class);
                startActivity(intent);


            }
        });

        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DisasterManagement.this,Helpline.class);
                startActivity(intent);

            }
        });

        unorganized.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DisasterManagement.this, UnorganizedMain.class);
                startActivity(intent);

            }
        });
        collectionfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(DisasterManagement.this, CollectionFoodMain.class);
                startActivity(intent);

            }
        });

        healthworker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(DisasterManagement.this, HealthWorkerAssigning.class);
                startActivity(intent);

            }
        });
        orphan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(DisasterManagement.this, OrphanHome.class);
                startActivity(intent);

            }
        });

        medicalstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.healthfrog.in/chemists/medical-store/"));
                startActivity(intent);

            }
        });
    }

}
