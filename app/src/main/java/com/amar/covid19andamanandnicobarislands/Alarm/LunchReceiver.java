package com.amar.covid19andamanandnicobarislands.Alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.view.View;

public class LunchReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Lunch inst = Lunch.instance();
        inst.setAlarmText("Alarm! Wake up! Wake up!");
        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        if (alarmUri == null) {

            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }
        final Ringtone ringtone = RingtoneManager.getRingtone(context, alarmUri);
        ringtone.play();
        inst.off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ringtone.stop();

            }
        });
    }
}
