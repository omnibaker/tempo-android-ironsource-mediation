package com.ironsource.adapters.custom.tempo;

import static com.ironsource.adapters.custom.tempo.BuildConfig.DEBUG;
import static com.tempoplatform.ads.Constants.TEST_LOG;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrors;
import com.tempoplatform.ads.InterstitialAdListener;
import com.tempoplatform.ads.InterstitialView;
import com.tempoplatform.ads.RewardedAdListener;
import com.tempoplatform.ads.RewardedView;
//---------------------------------------------------
import com.ironsource.mediationsdk.adunit.adapter.BaseRewardedVideo;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrors;



@Keep
@SuppressWarnings("unused")
public class TempoCustomAdapter extends BaseAdapter {

    // Version references
    public String dynSdkVersion = "1.0.1";
    public static final String ADAPTER_VERSION = "1.0.0";

    // Log tag for debugging
    private static final String LOG_TAG = TempoCustomAdapter.class.getSimpleName();

    public TempoCustomAdapter() {
        Log.d(TEST_LOG, "TempoCustomAdapter created!");
    }


    @Override
    public void init(@NonNull AdData adData, @NonNull Context context, @Nullable NetworkInitializationListener listener) {
        Log.d(TEST_LOG, "TempoCustomAdapter initialised: " + adData.getConfiguration());

        // TODO: some init-success-condition, or is this enough?
        if (listener != null) {
            // Initialization completed successfully
            listener.onInitSuccess();
        } else {
            // Initialization failed
            Log.e(TEST_LOG, "Initialisation failed!");
        }
    }

    @Override
    public String getNetworkSDKVersion() {
        return "1.0.0";
    }

    @NonNull
    @Override
    public String getAdapterVersion() {
        return ADAPTER_VERSION;
    }
}
