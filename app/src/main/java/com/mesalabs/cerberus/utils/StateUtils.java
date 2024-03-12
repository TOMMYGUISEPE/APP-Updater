package com.mesalabs.cerberus.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/*
 * Cerberus Core App
 *
 * Coded by BlackMesa @2020
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * ULTRA-MEGA-PRIVATE SOURCE CODE. SHARING TO DEVKINGS TEAM
 * EXTERNALS IS PROHIBITED AND WILL BE PUNISHED WITH ANAL ABUSE.
 */

public class StateUtils {
    public static boolean isNetworkConnected(Context context) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();

        if (networkInfo != null) {
            return networkInfo.isConnected();
        } else {
            return false;
        }
    }

}
