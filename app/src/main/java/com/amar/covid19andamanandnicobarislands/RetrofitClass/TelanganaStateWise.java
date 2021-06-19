package com.amar.covid19andamanandnicobarislands.RetrofitClass;

import com.amar.covid19andamanandnicobarislands.RetrofitClass.Telangana;
import com.google.gson.annotations.SerializedName;

public class TelanganaStateWise {


   @SerializedName("Andaman and Nicobar Islands")
   private Telangana telangana;

   public TelanganaStateWise(Telangana telangana) {
       this.telangana = telangana;
   }

   public Telangana getTelangana() {
       return telangana;
   }

   public void setTelangana(Telangana telangana) {
       this.telangana = telangana;
   }
}
