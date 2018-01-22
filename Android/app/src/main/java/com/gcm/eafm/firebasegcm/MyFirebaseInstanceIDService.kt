package com.gcm.eafm.firebasegcm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId



/**
 * Created by alanflores on 1/20/18.
 */

class MyFirebaseInstanceIDService : FirebaseInstanceIdService() {

    private val TAG = "MyFirebaseInstanceID"

    override fun onTokenRefresh() {
        // Get updated InstanceID token.
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Refreshed token: " + refreshedToken!!)
    }


}
