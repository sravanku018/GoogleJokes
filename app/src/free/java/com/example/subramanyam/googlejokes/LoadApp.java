package com.example.subramanyam.googlejokes;

import android.content.Context;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class LoadApp {
    private static InterstitialAd  interstitialAd;
    public static void getAdView(View view)
    {
        AdView adView=(AdView) view.findViewById(R.id.adView);

        AdRequest adRequest=new AdRequest.Builder().addTestDevice("7E6493C46436C4B3802A658A630C9E3B")
                .build();
        if(adView != null)
        {
            adView.loadAd(adRequest);
        }
    }
public static void getInterstitialAd(Context context)
{
    interstitialAd=new InterstitialAd(context);
    interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
   interstitialAd.setAdListener(new AdListener() {
        @Override
        public void onAdClosed() {
            // Load the next interstitial.

            requestNewInterstitial();
        }

    });

}
private static void requestNewInterstitial(){
        AdRequest adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        interstitialAd.loadAd(adRequest);
}
    public static void showInterstitialAd(){
        if(isAdAvailable())
        {
            interstitialAd.show();
        }
    }
    public static boolean isAdAvailable(){
        return interstitialAd.isLoaded();
    }
}
