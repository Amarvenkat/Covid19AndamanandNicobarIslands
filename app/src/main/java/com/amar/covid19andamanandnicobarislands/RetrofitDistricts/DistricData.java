package com.amar.covid19andamanandnicobarislands.RetrofitDistricts;

import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Adilabad;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.BhadradriKothagudem;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Hyderabad;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Jagtial;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Jangaon;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.JayashankarBhupalapally;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.JogulambaGadwal;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Kamareddy;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Karimnagar;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Khammam;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.KomaramBheem;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Mahabubabad;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Mahabubnagar;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Mancherial;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Medak;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.MedchalMalkajgiri;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Mulugu;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Nagarkurnool;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Nalgonda;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Narayanpet;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Nirmal;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Nizamabad;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Peddapalli;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.RajannaSircilla;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.RangaReddy;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Sangareddy;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Siddipet;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Suryapet;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Unknown;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.Vikarabad;
import com.amar.covid19andamanandnicobarislands.RetrofitDistricts.WarangalUrban;
import com.google.gson.annotations.SerializedName;

public class DistricData {

    @SerializedName("Nicobars")
    private Adilabad adilabad;
    @SerializedName("North and Middle Andaman")
    private BhadradriKothagudem bhadradriKothagudem;
    @SerializedName("South Andaman")
    private Hyderabad hyderabad;
    @SerializedName("Unknown")
    private Jagtial jagtial;

    public DistricData(Adilabad adilabad, BhadradriKothagudem bhadradriKothagudem, Hyderabad hyderabad, Jagtial jagtial) {
        this.adilabad = adilabad;
        this.bhadradriKothagudem = bhadradriKothagudem;
        this.hyderabad = hyderabad;
        this.jagtial = jagtial;
    }

    public Adilabad getAdilabad() {
        return adilabad;
    }

    public void setAdilabad(Adilabad adilabad) {
        this.adilabad = adilabad;
    }

    public BhadradriKothagudem getBhadradriKothagudem() {
        return bhadradriKothagudem;
    }

    public void setBhadradriKothagudem(BhadradriKothagudem bhadradriKothagudem) {
        this.bhadradriKothagudem = bhadradriKothagudem;
    }

    public Hyderabad getHyderabad() {
        return hyderabad;
    }

    public void setHyderabad(Hyderabad hyderabad) {
        this.hyderabad = hyderabad;
    }

    public Jagtial getJagtial() {
        return jagtial;
    }

    public void setJagtial(Jagtial jagtial) {
        this.jagtial = jagtial;
    }
}
