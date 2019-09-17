package com.dotplays.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.e("DESTROY","DESTROY");
    }

    // su dung phuong thuc nay de thao tac code va cac cau lenh
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // viet code o giua

        Log.e("START","START");


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
