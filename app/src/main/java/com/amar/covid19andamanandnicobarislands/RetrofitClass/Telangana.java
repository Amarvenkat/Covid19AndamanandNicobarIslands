package com.amar.covid19andamanandnicobarislands.RetrofitClass;

import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.DistricData;
import com.google.gson.annotations.SerializedName;

public class Telangana {

@SerializedName("districtData")
    private DistricData districData;

    public Telangana(DistricData districData) {
        this.districData = districData;
    }

    public DistricData getDistricData() {
        return districData;
    }

    public void setDistricData(DistricData districData) {
        this.districData = districData;
    }
}
