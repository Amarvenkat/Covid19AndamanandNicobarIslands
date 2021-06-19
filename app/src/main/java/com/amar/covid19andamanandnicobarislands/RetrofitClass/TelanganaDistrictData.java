package com.amar.covid19andamanandnicobarislands.RetrofitClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.amar.covid19andamanandnicobarislands.ApiInterface.ApiDistrictData;
import com.amar.covid19andamanandnicobarislands.Apiclients.ApiClient;
import com.amar.covid19andamanandnicobarislands.DistricRecycler;
import com.amar.covid19andamanandnicobarislands.R;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Telangana;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.TelanganaStateWise;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TelanganaDistrictData extends AppCompatActivity {

    ProgressBar progressBar;
    RecyclerView recyclerView;
    ArrayList<Integer>  districname      = new ArrayList<Integer>();
    ArrayList<Integer> districactive    = new ArrayList<Integer>();
    ArrayList<Integer> districconfirmed = new ArrayList<Integer>();
    ArrayList<Integer> districdeceased  = new ArrayList<Integer>();
    ArrayList<Integer> districrecovered = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana_district_data);

        recyclerView = (RecyclerView) findViewById(R.id.district_recycler);

        progressBar = (ProgressBar) findViewById(R.id.progressbardistrict);


        progressBar.setVisibility(View.INVISIBLE);

        ApiDistrictData apiService =
                ApiClient.getClient().create(ApiDistrictData.class);

        progressBar.setVisibility(View.VISIBLE);

        Call<TelanganaStateWise> call = apiService.getDistrictData();

        call.enqueue(new Callback<TelanganaStateWise>() {
            @Override
            public void onResponse(Response<TelanganaStateWise> response) {

                Telangana result = response.body().getTelangana();

                result.getDistricData();

                Integer adilabadactive =result.getDistricData().getAdilabad().getAdilabadactive();
                Integer bhadradriKothagudemactive =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemactive();
                Integer hyderabadactive =result.getDistricData().getHyderabad().getHyderabadactive();
                Integer jagtialactive =result.getDistricData().getJagtial().getJagtialactive();



                Integer adilabadconfirmed =result.getDistricData().getAdilabad().getAdilabadconfirmed();
                Integer bhadradriKothagudemconfirmed =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemconfirmed();
                Integer hyderabadconfirmed =result.getDistricData().getHyderabad().getHyderabadconfirmed();
                Integer jagtialconfirmed =result.getDistricData().getJagtial().getJagtialconfirmed();
                Integer adilabaddeceased =result.getDistricData().getAdilabad().getAdilabaddeceased();
                Integer bhadradriKothagudemdeceased =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemdeceased();
                Integer hyderabaddeceased =result.getDistricData().getHyderabad().getHyderabaddeceased();
                Integer jagtialdeceased =result.getDistricData().getJagtial().getJagtialdeceased();

                Integer adilabadrecovered =result.getDistricData().getAdilabad().getAdilabadrecovered();
                Integer bhadradriKothagudemrecovered =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemrecovered();
                Integer hyderabadrecovered =result.getDistricData().getHyderabad().getHyderabadrecovered();
                Integer jagtialrecovered =result.getDistricData().getJagtial().getJagtialrecovered();

                districname.add(R.string.adilabad);
                districname.add(R.string.bhadradriKothagudem);
                districname.add(R.string.hyderabad);
                districname.add(R.string.jagtial);


                districactive.add(adilabadactive);
                districactive.add(bhadradriKothagudemactive);
                districactive.add(hyderabadactive);
                districactive.add(jagtialactive);



                districconfirmed.add(adilabadconfirmed);
                districconfirmed.add(bhadradriKothagudemconfirmed);
                districconfirmed.add(hyderabadconfirmed);
                districconfirmed.add(jagtialconfirmed);
                districdeceased.add(adilabaddeceased);
                districdeceased.add(bhadradriKothagudemdeceased);
                districdeceased.add(hyderabaddeceased);
                districdeceased.add(jagtialdeceased);

                districrecovered.add(adilabadrecovered);
                districrecovered.add(bhadradriKothagudemrecovered);
                districrecovered.add(hyderabadrecovered);
                districrecovered.add(jagtialrecovered);

                DistricRecycler districRecycler = new DistricRecycler(getApplicationContext(),districname,districactive,districconfirmed,districdeceased,districrecovered);

                recyclerView.setAdapter(districRecycler);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);


            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}
