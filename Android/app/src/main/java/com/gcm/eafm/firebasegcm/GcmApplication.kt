package com.gcm.eafm.firebasegcm

import android.app.Application
import io.fabric.sdk.android.Fabric
import com.crashlytics.android.Crashlytics

/**
 * Created by alanflores on 1/21/18.
 */

class GcmApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val fabric = Fabric.Builder(this)
                .kits(Crashlytics())
                .debuggable(true)
                .build()
        Fabric.with(fabric)
    }

}