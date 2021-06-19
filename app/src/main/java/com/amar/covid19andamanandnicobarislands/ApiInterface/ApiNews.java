package com.amar.covid19andamanandnicobarislands.ApiInterface;

import com.amar.covid19andamanandnicobarislands.RetrofitClass.DailyNews;

import retrofit2.Call;
import retrofit2.http.GET;

public  interface ApiNews {

        @GET("v2/top-headlines?country=in&apiKey=2551941e9b534175992c1e2273286a28")
        Call<DailyNews> getResourse();


    }
