package com.sundxin.noloadermodle;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.bumptech.glide.Glide;
import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;


public class BappClaass {
    private static final String TAG = "BappClaass";
    public static Activity activity;
    public static int app_ApplovinBannerSize;
    public static int app_UnityBannerHeight;
    public static int app_UnityBannerWidth;
    public static boolean app_UnityTestMode;
    public static BappClaass bappClaass;
    static MyCallback myCallback;
    static OnAdListner onAdListner;
    public Dialog dialog;

    public static int app_AllAdShowStatus = 0;
    public static int Dialog_Show = 0;
    public static int app_redirectOtherAppStatus = 0;
    public static String app_newPackageName = "";
    public static int app_updateAppDialogStatus = 0;
    public static String app_versionCode = "";
    public static String app_UpdatePackageName = "";
    public static String app_Extra_Data1 = "";
    public static String app_Extra_Data2 = "";
    public static String app_Extra_Data3 = "";
    public static String app_Extra_Data4 = "";
    public static String app_Extra_Data5 = "";
    public static String app_Extra_Data6 = "";
    public static String app_Extra_Data7 = "";
    public static String app_Extra_Data8 = "";
    public static String app_Extra_Data9 = "";
    public static String app_Extra_Data10 = "";
    public static String True_Video_Show = "";
    public static String False_Video_Show = "";
    public static String Both_video_show = "";
    public static int maxvidcount = 0;
    public static String app_failData = "";
    public static String app_DataIOSocketFail = "";
    public static String app_DeveloperOption_Check_Mode = "";
    public static String Privacy_Policy = "";
    public static String app_onesingle_appid = "";
    public static String app_AdsPriority = "";
    public static String app_Banner_AdsPriority = "";
    public static String app_Native_AdsPriority = "";
    public static String app_NativeAdCodeType = "";
    public static String app_BannerPeriority = "";
    public static String AD_MOB_STATUS = "";
    public static String AD_MOB_APP_ID_Banner1 = "";
    public static String AD_MOB_APP_ID_Banner2 = "";
    public static String AD_MOB_APP_ID_Banner3 = "";
    public static String AD_MOB_APP_ID_NativeBanner1 = "";
    public static String AD_MOB_APP_ID_NativeBanner2 = "";
    public static String AD_MOB_APP_ID_NativeBanner3 = "";
    public static String AD_MOB_APP_ID_Inter1 = "";
    public static String AD_MOB_APP_ID_Inter2 = "";
    public static String AD_MOB_APP_ID_Inter3 = "";
    public static String AD_MOB_APP_ID_Native1 = "";
    public static String AD_MOB_APP_ID_Native2 = "";
    public static String AD_MOB_APP_ID_Native3 = "";
    public static String AD_MOB_APP_ID_Native4 = "";
    public static String AD_MOB_OpenAd_STATUS = "";
    public static String AD_MOB_APP_ID_OpenAd1 = "";
    public static String AD_MOB_APP_ID_OpenAd2 = "";
    public static String AD_MOB_APP_ID_OpenAd3 = "";
    public static String FACEBOOK_AD_STATUS = "";
    public static String FB_Banner_ID1 = "";
    public static String FB_Banner_ID2 = "";
    public static String FB_Banner_ID3 = "";
    public static String FB_BannerNative_ID1 = "";
    public static String FB_BannerNative_ID2 = "";
    public static String FB_BannerNative_ID3 = "";
    public static String FB_Inter_ID1 = "";
    public static String FB_Inter_ID2 = "";
    public static String FB_Inter_ID3 = "";
    public static String FB_Native_ID1 = "";
    public static String FB_Native_ID2 = "";
    public static String FB_Native_ID3 = "";
    public static String FB_Native_ID4 = "";
    public static String Native_Btn_Color = "";
    public static String Native_Btn_text = "";
    public static String Native_Btn_Text_Size = "";
    public static String Native_Btn_Text_Color = "";
    public static String Native_Ad_Shape_Square_Corner = "";
    public static String Native_Ad_Shape_Round_Corner = "";
    public static String Native_Ad_Small_Size = "";
    public static String Native_Ad_Shape_Normal_Round_Btn = "";
    public static String Banner_Ads_On = "";
    public static String Native_Ads_On = "";
    public static String NativeBanner_Ads_On = "";
    public static int app_MainClickCntSwAd = 0;
    public static int app_InnerClickCntSwAd = 0;
    public static String app_OnlyInterstitalADShow = "";
    public static String app_OnlyNativeADShow = "";
    public static String app_OnlyBannerADShow = "";
    public static int app_CustClickCntSAd = 0;
    public static String app_CustomeADText = "";
    public static String app_CustomeAdInterstitialLink = "";
    public static String app_CustomeAdInterFullscreenImg = "";
    public static String app_CustomeAdQurekaLink = "";
    public static String app_CustomeAdNativeLargeImage = "";
    public static String app_CustomeAdNativeIconImage = "";
    public static String app_CustomeAdNativeTitle = "";
    public static String app_CustomeAdNativesubHander = "";
    public static String app_CustomeAdNativesubHander2 = "";
    public static String app_CustomeAdNativeInstallText = "";
    public static String app_CustomeADNativeLink = "";
    public static String app_CustomeAdBannerIcon = "";
    public static String app_CustomeAdBannerInstallText = "";
    public static String app_CustomeAdBannerHanderText = "";
    public static String app_CustomeAdBannerSubHanderText = "";
    public static String app_CustomeADBannerLink = "";
    public static String app_OnlyQurekaStatusShow = "";
    public static String app_OnlyQurekaLink = "";
    public static String UNITY_ADS_STATUS = "";
    public static String app_UnityAppId = "";
    public static String app_UnityBannerId = "";
    public static String app_UnityInterstitialId1 = "";
    public static String app_UnityInterstitialId2 = "";
    public static String app_UnityInterstitialId3 = "";
    public static String APPLOVIN_ADS_STATUS = "";
    public static String app_ApplovinInterstitialId1 = "";
    public static String app_ApplovinInterstitialId2 = "";
    public static String app_ApplovinInterstitialId3 = "";
    public static String app_ApplovinBanner1 = "";
    public static String app_ApplovinNative1 = "";
    static RelativeLayout admobBanerLayout = null;
    static RelativeLayout admobBanerLayout2 = null;
    static RelativeLayout admobBanerLayout3 = null;
    static RelativeLayout fbBanerLayout = null;
    static RelativeLayout fbBanerLayout2 = null;
    static RelativeLayout fbBanerLayout3 = null;
    static RelativeLayout admobNativeBanerLayout = null;
    static RelativeLayout admobNativeBanerLayout2 = null;
    static RelativeLayout admobNativeBanerLayout3 = null;
    static RelativeLayout fbNativeBanerLayout = null;
    static RelativeLayout fbNativeBanerLayout2 = null;
    static RelativeLayout fbNativeBanerLayout3 = null;
    static LinearLayout admobNativeNewLayout = null;
    static LinearLayout admobNativeNewLayout2 = null;
    static LinearLayout admobNativeNewLayout3 = null;
    static LinearLayout admobNativeNewLayout4 = null;
    static LinearLayout fbNativeNewLayout = null;
    static LinearLayout fbNativeNewLayout2 = null;
    static LinearLayout fbNativeNewLayout3 = null;
    static LinearLayout fbNativeNewLayout4 = null;
    public static boolean preloadNative_AdStatus = true;
    public static String state_admobNative = "Start";
    public static String state_fbNative = "Start";
    public static int count_click = -1;
    public static int Custcadscnt_click = -1;
    public static int ad_dialog_time_in_second = 2;
    MaxAdView adViewBanner = null;
    public MaxNativeAdLoader nativeAdLoader = null;
    public MaxAd nativeAd = null;
    AdView mAdView = null;
    NativeAd admobNativeAd_preLoad = null;
    NativeAd admobBannerNativeAd = null;
    com.facebook.ads.NativeAd fbNativeAd_preLoad = null;
    com.facebook.ads.AdView fbadView = null;
    NativeBannerAd nativeAd1 = null;

    public InterstitialAd fbinterstitialAd1;
    public String facebook_i_pre = "";

    public com.google.android.gms.ads.interstitial.InterstitialAd mInterstitialAd;
    public String google_i_pre = "";

    public MaxInterstitialAd maxInterstitialAd;
    public String maxapplovin_i_pre = "";

    public IUnityAdsShowListener showListener;
    public String unity_i_pre = "";


    public interface MyCallback {
        void callbackCall();
    }


    public interface OnAdListner {
        void OnClose();
    }

    public BappClaass(Activity activity1) {
        activity = activity1;
    }

    public static BappClaass getInstance(Activity activity1) {
        activity = activity1;
        if (bappClaass == null) {
            bappClaass = new BappClaass(activity);
        }
        return bappClaass;
    }

    public static void appOpenFailLoadeds(OnAdListner onAdListner1) {
        onAdListner = onAdListner1;
        onAdListner1.OnClose();
    }

    public void configDatas(JSONObject jsonObject) throws JSONException {
        app_AllAdShowStatus = jsonObject.getInt("app_AllAdShowStatus");

        Dialog_Show = jsonObject.getInt("Dialog_Show");

        app_redirectOtherAppStatus = jsonObject.getInt("app_redirectOtherAppStatus");
        app_newPackageName = jsonObject.getString("app_newPackageName");

        app_updateAppDialogStatus = jsonObject.getInt("app_updateAppDialogStatus");
        app_versionCode = jsonObject.getString("app_versionCode");
        app_UpdatePackageName = jsonObject.getString("app_UpdatePackageName");

        app_Extra_Data1 = jsonObject.getString("app_Extra_Data1");
        app_Extra_Data2 = jsonObject.getString("app_Extra_Data2");
        app_Extra_Data3 = jsonObject.getString("app_Extra_Data3");
        app_Extra_Data4 = jsonObject.getString("app_Extra_Data4");
        app_Extra_Data5 = jsonObject.getString("app_Extra_Data5");
        app_Extra_Data6 = jsonObject.getString("app_Extra_Data6");
        app_Extra_Data7 = jsonObject.getString("app_Extra_Data7");
        app_Extra_Data8 = jsonObject.getString("app_Extra_Data8");
        app_Extra_Data9 = jsonObject.getString("app_Extra_Data9");
        app_Extra_Data10 = jsonObject.getString("app_Extra_Data10");

        True_Video_Show = jsonObject.getString("True_Video_Show");
        False_Video_Show = jsonObject.getString("False_Video_Show");
        Both_video_show = jsonObject.getString("Both_video_show");
        maxvidcount = jsonObject.getInt("maxvidcount");

        app_failData = jsonObject.getString("app_failData");
        app_DataIOSocketFail = jsonObject.getString("app_DataIOSocketFail");

        app_DeveloperOption_Check_Mode = jsonObject.getString("app_DeveloperOption_Check_Mode");

        Privacy_Policy = jsonObject.getString("Privacy_Policy");
        app_onesingle_appid = jsonObject.getString("app_OneSingleID");

        app_AdsPriority = jsonObject.getString("app_AdsPriority");
        app_Banner_AdsPriority = jsonObject.getString("app_Banner_AdsPriority");
        app_Native_AdsPriority = jsonObject.getString("app_Native_AdsPriority");
        app_NativeAdCodeType = jsonObject.getString("app_NativeAdCodeType");
        app_BannerPeriority = jsonObject.getString("app_BannerPeriority");

        AD_MOB_STATUS = jsonObject.getString("AD_MOB_STATUS");

        AD_MOB_APP_ID_Banner1 = jsonObject.getString("AD_MOB_APP_ID_Banner1");
        AD_MOB_APP_ID_Banner2 = jsonObject.getString("AD_MOB_APP_ID_Banner2");
        AD_MOB_APP_ID_Banner3 = jsonObject.getString("AD_MOB_APP_ID_Banner3");

        AD_MOB_APP_ID_NativeBanner1 = jsonObject.getString("AD_MOB_APP_ID_NativeBanner1");
        AD_MOB_APP_ID_NativeBanner2 = jsonObject.getString("AD_MOB_APP_ID_NativeBanner2");
        AD_MOB_APP_ID_NativeBanner3 = jsonObject.getString("AD_MOB_APP_ID_NativeBanner3");

        AD_MOB_APP_ID_Inter1 = jsonObject.getString("AD_MOB_APP_ID_Inter1");
        AD_MOB_APP_ID_Inter2 = jsonObject.getString("AD_MOB_APP_ID_Inter2");
        AD_MOB_APP_ID_Inter3 = jsonObject.getString("AD_MOB_APP_ID_Inter3");

        AD_MOB_APP_ID_Native1 = jsonObject.getString("AD_MOB_APP_ID_Native1");
        AD_MOB_APP_ID_Native2 = jsonObject.getString("AD_MOB_APP_ID_Native2");
        AD_MOB_APP_ID_Native3 = jsonObject.getString("AD_MOB_APP_ID_Native3");
        AD_MOB_APP_ID_Native4 = jsonObject.getString("AD_MOB_APP_ID_Native4");

        AD_MOB_OpenAd_STATUS = jsonObject.getString("AD_MOB_OpenAd_STATUS");
        AD_MOB_APP_ID_OpenAd1 = jsonObject.getString("AD_MOB_APP_ID_OpenAd1");
        AD_MOB_APP_ID_OpenAd2 = jsonObject.getString("AD_MOB_APP_ID_OpenAd2");
        AD_MOB_APP_ID_OpenAd3 = jsonObject.getString("AD_MOB_APP_ID_OpenAd3");

        FACEBOOK_AD_STATUS = jsonObject.getString("FACEBOOK_AD_STATUS");

        FB_Banner_ID1 = jsonObject.getString("FB_Banner_ID1");
        FB_Banner_ID2 = jsonObject.getString("FB_Banner_ID2");
        FB_Banner_ID3 = jsonObject.getString("FB_Banner_ID3");

        FB_BannerNative_ID1 = jsonObject.getString("FB_BannerNative_ID1");
        FB_BannerNative_ID2 = jsonObject.getString("FB_BannerNative_ID2");
        FB_BannerNative_ID3 = jsonObject.getString("FB_BannerNative_ID3");

        FB_Inter_ID1 = jsonObject.getString("FB_Inter_ID1");
        FB_Inter_ID2 = jsonObject.getString("FB_Inter_ID2");
        FB_Inter_ID3 = jsonObject.getString("FB_Inter_ID3");

        FB_Native_ID1 = jsonObject.getString("FB_Native_ID1");
        FB_Native_ID2 = jsonObject.getString("FB_Native_ID2");
        FB_Native_ID3 = jsonObject.getString("FB_Native_ID3");
        FB_Native_ID4 = jsonObject.getString("FB_Native_ID4");

        APPLOVIN_ADS_STATUS = jsonObject.getString("APPLOVIN_ADS_STATUS");

        app_ApplovinInterstitialId1 = jsonObject.getString("app_ApplovinInterstitialId1");
        app_ApplovinInterstitialId2 = jsonObject.getString("app_ApplovinInterstitialId2");
        app_ApplovinInterstitialId3 = jsonObject.getString("app_ApplovinInterstitialId3");

        app_ApplovinNative1 = jsonObject.getString("app_ApplovinNative1");

        app_ApplovinBanner1 = jsonObject.getString("app_ApplovinBanner1");
        app_ApplovinBannerSize = jsonObject.getInt("app_ApplovinBannerSize");

        UNITY_ADS_STATUS = jsonObject.getString("UNITY_ADS_STATUS");

        app_UnityAppId = jsonObject.getString("app_UnityAppId");
        app_UnityTestMode = jsonObject.getBoolean("app_UnityTestMode");

        app_UnityBannerId = jsonObject.getString("app_UnityBannerId");
        app_UnityBannerWidth = jsonObject.getInt("app_UnityBannerWidth");
        app_UnityBannerHeight = jsonObject.getInt("app_UnityBannerHeight");

        app_UnityInterstitialId1 = jsonObject.getString("app_UnityInterstitialId1");
        app_UnityInterstitialId2 = jsonObject.getString("app_UnityInterstitialId2");
        app_UnityInterstitialId3 = jsonObject.getString("app_UnityInterstitialId3");

        Native_Btn_Color = jsonObject.getString("Native_Btn_Color");
        Native_Btn_text = jsonObject.getString("Native_Btn_Ads_Text");
        Native_Btn_Text_Size = jsonObject.getString("Native_Btn_Text_Size");
        Native_Btn_Text_Color = jsonObject.getString("Native_Btn_Text_Color");

        Native_Ad_Shape_Square_Corner = jsonObject.getString("Native_Ad_Shape_Square_Corner");
        Native_Ad_Shape_Round_Corner = jsonObject.getString("Native_Ad_Shape_Round_Corner");
        Native_Ad_Small_Size = jsonObject.getString("Native_Ad_Small_Size");
        Native_Ad_Shape_Normal_Round_Btn = jsonObject.getString("Native_Ad_Shape_Normal_Round_Btn");

        Banner_Ads_On = jsonObject.getString("Banner_Ads_On");
        Native_Ads_On = jsonObject.getString("Native_Ads_On");
        NativeBanner_Ads_On = jsonObject.getString("NativeBanner_Ads_On");

        app_MainClickCntSwAd = jsonObject.getInt("app_MainClickCntSwAd");
        app_InnerClickCntSwAd = jsonObject.getInt("app_InnerClickCntSwAd");

        app_OnlyInterstitalADShow = jsonObject.getString("app_OnlyInterstitalADShow");
        app_OnlyNativeADShow = jsonObject.getString("app_OnlyNativeADShow");
        app_OnlyBannerADShow = jsonObject.getString("app_OnlyBannerADShow");

        app_CustClickCntSAd = jsonObject.getInt("app_CustClickCntSAd");

        app_CustomeADText = jsonObject.getString("app_CustomeADText");

        app_CustomeAdInterstitialLink = jsonObject.getString("app_CustomeAdInterstitialLink");
        app_CustomeAdInterFullscreenImg = jsonObject.getString("app_CustomeAdInterFullscreenImg");
        app_CustomeAdQurekaLink = jsonObject.getString("app_CustomeAdQurekaLink");

        app_CustomeAdNativeLargeImage = jsonObject.getString("app_CustomeAdNativeLargeImage");
        app_CustomeAdNativeIconImage = jsonObject.getString("app_CustomeAdNativeIconImage");
        app_CustomeAdNativeTitle = jsonObject.getString("app_CustomeAdNativeTitle");
        app_CustomeAdNativesubHander = jsonObject.getString("app_CustomeAdNativesubHander");
        app_CustomeAdNativesubHander2 = jsonObject.getString("app_CustomeAdNativesubHander2");
        app_CustomeAdNativeInstallText = jsonObject.getString("app_CustomeAdNativeInstallText");
        app_CustomeADNativeLink = jsonObject.getString("app_CustomeADNativeLink");

        app_CustomeAdBannerIcon = jsonObject.getString("app_CustomeAdBannerIcon");
        app_CustomeAdBannerInstallText = jsonObject.getString("app_CustomeAdBannerInstallText");
        app_CustomeAdBannerHanderText = jsonObject.getString("app_CustomeAdBannerHanderText");
        app_CustomeAdBannerSubHanderText = jsonObject.getString("app_CustomeAdBannerSubHanderText");
        app_CustomeADBannerLink = jsonObject.getString("app_CustomeADBannerLink");

        app_OnlyQurekaStatusShow = jsonObject.getString("app_OnlyQurekaStatusShow");
        app_OnlyQurekaLink = jsonObject.getString("app_OnlyQurekaLink");


    }

    public void Load_BannerAds() {
        if (app_AllAdShowStatus == 0) {
            return;
        }

        if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true")) {
            if (app_Banner_AdsPriority.equalsIgnoreCase("google")) {
                showAdmobBanner();
            } else if (app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
                showFacebookBanner();
            }
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("google")) {
            LoadGoogleNativeSmall();
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
            showFacebookBanner();
        }
    }

    public void showBanner(RelativeLayout banner_container) {
        if (app_AllAdShowStatus == 0) {
            if (app_OnlyBannerADShow.equalsIgnoreCase("true")) {
                banner_container.setVisibility(View.GONE);
                onlyCustBannerCallAD(activity);
            } else {
                banner_container.setVisibility(View.GONE);
                return;
            }
        }
        if ((app_BannerPeriority.equalsIgnoreCase("native") && app_Banner_AdsPriority.equalsIgnoreCase("google")) || app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
            if (NativeBanner_Ads_On.equalsIgnoreCase("true")) {
                showNativeBanner(banner_container);
            }
        } else if ((app_BannerPeriority.equalsIgnoreCase("banner") && app_Banner_AdsPriority.equalsIgnoreCase("google")) || app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
            if (Banner_Ads_On.equalsIgnoreCase("true")) {
                displayBanner(banner_container);
            }
        } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("unity")) {
            unityBannerDisplay(banner_container);
        } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("applovin")) {
            applovinBannerDisplay(banner_container);
        } else {
            banner_container.setVisibility(View.GONE);
        }
    }

    public void displayBanner(RelativeLayout Adlayout) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
            RelativeLayout relativeLayout = fbBanerLayout;
            if (relativeLayout != null) {
                if (relativeLayout.getParent() != null) {
                    ((ViewGroup) fbBanerLayout.getParent()).removeView(fbBanerLayout);
                }
                Adlayout.addView(fbBanerLayout);
                return;
            }
            RelativeLayout relativeLayout2 = fbBanerLayout2;
            if (relativeLayout2 != null) {
                if (relativeLayout2.getParent() != null) {
                    ((ViewGroup) fbBanerLayout2.getParent()).removeView(fbBanerLayout2);
                }
                Adlayout.addView(fbBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout3 = fbBanerLayout3;
            if (relativeLayout3 != null) {
                if (relativeLayout3.getParent() != null) {
                    ((ViewGroup) fbBanerLayout3.getParent()).removeView(fbBanerLayout3);
                }
                Adlayout.addView(fbBanerLayout3);
                return;
            }
            RelativeLayout relativeLayout4 = admobBanerLayout;
            if (relativeLayout4 != null) {
                if (relativeLayout4.getParent() != null) {
                    ((ViewGroup) admobBanerLayout.getParent()).removeView(admobBanerLayout);
                }
                Adlayout.addView(admobBanerLayout);
                return;
            }
            RelativeLayout relativeLayout5 = admobBanerLayout2;
            if (relativeLayout5 != null) {
                if (relativeLayout5.getParent() != null) {
                    ((ViewGroup) admobBanerLayout2.getParent()).removeView(admobBanerLayout2);
                }
                Adlayout.addView(admobBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout6 = admobBanerLayout3;
            if (relativeLayout6 != null) {
                if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) admobBanerLayout3.getParent()).removeView(admobBanerLayout3);
                }
                Adlayout.addView(admobBanerLayout3);
                showFacebookBanner();
                return;
            }
            onlyCustBannerCallAD(activity);
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("google")) {
            RelativeLayout relativeLayout7 = admobBanerLayout;
            if (relativeLayout7 != null) {
                if (relativeLayout7.getParent() != null) {
                    ((ViewGroup) admobBanerLayout.getParent()).removeView(admobBanerLayout);
                }
                Adlayout.addView(admobBanerLayout);
                return;
            }
            RelativeLayout relativeLayout8 = admobBanerLayout2;
            if (relativeLayout8 != null) {
                if (relativeLayout8.getParent() != null) {
                    ((ViewGroup) admobBanerLayout2.getParent()).removeView(admobBanerLayout2);
                }
                Adlayout.addView(admobBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout9 = admobBanerLayout3;
            if (relativeLayout9 != null) {
                if (relativeLayout9.getParent() != null) {
                    ((ViewGroup) admobBanerLayout3.getParent()).removeView(admobBanerLayout3);
                }
                Adlayout.addView(admobBanerLayout3);
                return;
            }
            RelativeLayout relativeLayout10 = fbBanerLayout;
            if (relativeLayout10 != null) {
                if (relativeLayout10.getParent() != null) {
                    ((ViewGroup) fbBanerLayout.getParent()).removeView(fbBanerLayout);
                }
                Adlayout.addView(fbBanerLayout);
                return;
            }
            RelativeLayout relativeLayout11 = fbBanerLayout2;
            if (relativeLayout11 != null) {
                if (relativeLayout11.getParent() != null) {
                    ((ViewGroup) fbBanerLayout2.getParent()).removeView(fbBanerLayout2);
                }
                Adlayout.addView(fbBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout12 = fbBanerLayout3;
            if (relativeLayout12 != null) {
                if (relativeLayout12.getParent() != null) {
                    ((ViewGroup) fbBanerLayout3.getParent()).removeView(fbBanerLayout3);
                }
                Adlayout.addView(fbBanerLayout3);
                showAdmobBanner();
            }
        } else {
            onlyCustBannerCallAD(activity);
        }
    }

    public void showFacebookBanner() {
        Log.e(TAG, "showFacebookBanner1: ");
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobBanner();
            return;
        }
        fbBanerLayout = new RelativeLayout(activity);
        fbadView = new com.facebook.ads.AdView(activity, FB_Banner_ID1, AdSize.BANNER_HEIGHT_50);
        fbBanerLayout.addView(fbadView);
        AdListener adListener = new AdListener() { // from class: com.luciada.modids.1
            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorbner1: ");
                fbBanerLayout.removeAllViews();
                fbBanerLayout = null;
                showFacebookBanner2();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedbner1: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClicked1: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionbner1: ");
            }
        };
        fbadView.loadAd(fbadView.buildLoadAdConfig().withAdListener(adListener).build());
    }

    public void showFacebookBanner2() {
        Log.e(TAG, "showFacebookBanner2: ");
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobBanner();
            return;
        }
        fbBanerLayout2 = new RelativeLayout(activity);
        fbadView = new com.facebook.ads.AdView(activity, FB_Banner_ID2, AdSize.BANNER_HEIGHT_50);
        fbBanerLayout2.addView(fbadView);
        AdListener adListener = new AdListener() { // from class: com.luciada.modids.2
            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorbner2: ");
                fbBanerLayout2.removeAllViews();
                fbBanerLayout2 = null;
                showFacebookBanner3();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedbner2: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedbner2: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionbner2: ");
            }
        };
        fbadView.loadAd(fbadView.buildLoadAdConfig().withAdListener(adListener).build());
    }

    public void showFacebookBanner3() {
        Log.e(TAG, "showFacebookBanner3: ");
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobBanner();
            return;
        }
        fbBanerLayout3 = new RelativeLayout(activity);
        fbadView = new com.facebook.ads.AdView(activity, FB_Banner_ID3, AdSize.BANNER_HEIGHT_50);
        fbBanerLayout3.addView(fbadView);
        AdListener adListener = new AdListener() { // from class: com.luciada.modids.3
            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorbner3: ");
                fbBanerLayout3.removeAllViews();
                fbBanerLayout3 = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
                    showAdmobBanner();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedbner3: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedbner3: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionbner3: ");
            }
        };
        fbadView.loadAd(fbadView.buildLoadAdConfig().withAdListener(adListener).build());
    }

    public void showAdmobBanner() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobBanerLayout = new RelativeLayout(activity);
        mAdView = new AdView(activity);
        mAdView.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
        mAdView.setAdUnitId(AD_MOB_APP_ID_Banner1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.4
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                Log.e(TAG, "onAdClosedggb1: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggb1: ");
                admobBanerLayout.removeAllViews();
                admobBanerLayout = null;
                showAdmobBanner2();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                Log.e(TAG, "onAdOpenedggb1: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Log.e(TAG, "onAdLoadedggb1: ");
                admobBanerLayout.removeAllViews();
                admobBanerLayout.addView(mAdView);
            }

            @Override
            // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public void onAdClicked() {
                Log.e(TAG, "onAdClickedggb1: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                Log.e(TAG, "onAdImpressionggb1: ");
            }
        });
    }

    public void showAdmobBanner2() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobBanerLayout2 = new RelativeLayout(activity);
        mAdView = new AdView(activity);
        mAdView.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
        mAdView.setAdUnitId(AD_MOB_APP_ID_Banner2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.5
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                Log.e(TAG, "onAdClosedggb2: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggb2: ");
                admobBanerLayout2.removeAllViews();
                admobBanerLayout2 = null;
                showAdmobBanner3();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                Log.e(TAG, "onAdOpenedggb2: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Log.e(TAG, "onAdLoadedggb2: ");
                admobBanerLayout2.removeAllViews();
                admobBanerLayout2.addView(mAdView);
            }

            @Override
            // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public void onAdClicked() {
                Log.e(TAG, "onAdClickedggb2: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                Log.e(TAG, "onAdImpressionggb2: ");
            }
        });
    }

    public void showAdmobBanner3() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobBanerLayout3 = new RelativeLayout(activity);
        mAdView = new AdView(activity);
        mAdView.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
        mAdView.setAdUnitId(AD_MOB_APP_ID_Banner3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.6
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                Log.e(TAG, "onAdClosedggb3: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggb3: ");
                admobBanerLayout3.removeAllViews();
                admobBanerLayout3 = null;
                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("google")) {
                    showFacebookBanner();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                Log.e(TAG, "onAdOpenedggb3: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Log.e(TAG, "onAdLoadedggb3: ");
                admobBanerLayout3.removeAllViews();
                admobBanerLayout3.addView(mAdView);
            }

            @Override
            // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public void onAdClicked() {
                Log.e(TAG, "onAdClickedggb3: ");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                Log.e(TAG, "onAdImpressionggb3: ");
            }
        });
    }

    public void Load_NativeBannerAds() {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true")) {
            if (app_Banner_AdsPriority.equalsIgnoreCase("google")) {
                LoadGoogleNativeSmall();
            } else if (app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
                showNativeFacebookBanner();
            }
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("google")) {
            LoadGoogleNativeSmall();
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
            showNativeFacebookBanner();
        }
    }

    public void showNativeBanner(RelativeLayout banner_container) {
        if (app_AllAdShowStatus != 0 && NativeBanner_Ads_On.equalsIgnoreCase("true")) {
            displayNativeBanner(banner_container);
        }
    }

    public void displayNativeBanner(RelativeLayout Adlayout) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
            RelativeLayout relativeLayout = fbNativeBanerLayout;
            if (relativeLayout != null) {
                if (relativeLayout.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout.getParent()).removeView(fbNativeBanerLayout);
                }
                Adlayout.addView(fbNativeBanerLayout);
                return;
            }
            RelativeLayout relativeLayout2 = fbNativeBanerLayout2;
            if (relativeLayout2 != null) {
                if (relativeLayout2.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout2.getParent()).removeView(fbNativeBanerLayout2);
                }
                Adlayout.addView(fbNativeBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout3 = fbNativeBanerLayout3;
            if (relativeLayout3 != null) {
                if (relativeLayout3.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout3.getParent()).removeView(fbNativeBanerLayout3);
                }
                Adlayout.addView(fbNativeBanerLayout3);
                return;
            }
            RelativeLayout relativeLayout4 = admobNativeBanerLayout;
            if (relativeLayout4 != null) {
                if (relativeLayout4.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout.getParent()).removeView(admobNativeBanerLayout);
                }
                Adlayout.addView(admobNativeBanerLayout);
                return;
            }
            RelativeLayout relativeLayout5 = admobNativeBanerLayout2;
            if (relativeLayout5 != null) {
                if (relativeLayout5.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout2.getParent()).removeView(admobNativeBanerLayout2);
                }
                Adlayout.addView(admobNativeBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout6 = admobNativeBanerLayout3;
            if (relativeLayout6 != null) {
                if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout3.getParent()).removeView(admobNativeBanerLayout3);
                }
                Adlayout.addView(admobNativeBanerLayout3);
                showNativeFacebookBanner();
                return;
            }
            onlyCustBannerCallAD(activity);
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("google")) {
            RelativeLayout relativeLayout7 = admobNativeBanerLayout;
            if (relativeLayout7 != null) {
                if (relativeLayout7.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout.getParent()).removeView(admobNativeBanerLayout);
                }
                Adlayout.addView(admobNativeBanerLayout);
                return;
            }
            RelativeLayout relativeLayout8 = admobNativeBanerLayout2;
            if (relativeLayout8 != null) {
                if (relativeLayout8.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout2.getParent()).removeView(admobNativeBanerLayout2);
                }
                Adlayout.addView(admobNativeBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout9 = admobNativeBanerLayout3;
            if (relativeLayout9 != null) {
                if (relativeLayout9.getParent() != null) {
                    ((ViewGroup) admobNativeBanerLayout3.getParent()).removeView(admobNativeBanerLayout3);
                }
                Adlayout.addView(admobNativeBanerLayout3);
                return;
            }
            RelativeLayout relativeLayout10 = fbNativeBanerLayout;
            if (relativeLayout10 != null) {
                if (relativeLayout10.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout.getParent()).removeView(fbNativeBanerLayout);
                }
                Adlayout.addView(fbNativeBanerLayout);
                return;
            }
            RelativeLayout relativeLayout11 = fbNativeBanerLayout2;
            if (relativeLayout11 != null) {
                if (relativeLayout11.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout2.getParent()).removeView(fbNativeBanerLayout2);
                }
                Adlayout.addView(fbNativeBanerLayout2);
                return;
            }
            RelativeLayout relativeLayout12 = fbNativeBanerLayout3;
            if (relativeLayout12 != null) {
                if (relativeLayout12.getParent() != null) {
                    ((ViewGroup) fbNativeBanerLayout3.getParent()).removeView(fbNativeBanerLayout3);
                }
                Adlayout.addView(fbNativeBanerLayout3);
                LoadGoogleNativeSmall();
            }
        } else {
            onlyCustBannerCallAD(activity);
        }
    }

    public void showNativeFacebookBanner() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadGoogleNativeSmall();
            return;
        }
        fbNativeBanerLayout = new RelativeLayout(activity);
        nativeAd1 = new NativeBannerAd(activity, FB_BannerNative_ID1);

        nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.luciada.modids.7
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e(TAG, "onMediaDownloadedfbnb1: ");
                fbNativeBanerLayout.removeAllViews();
                Inflate_FBNativeBannerADS(nativeAd1, fbNativeBanerLayout);
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorfbnb1: ");
                fbNativeBanerLayout.removeAllViews();
                fbNativeBanerLayout = null;
                showNativeFacebookBanner2();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedfbnb1: ");
                if (nativeAd1 == null || nativeAd1 != ad) {
                    return;
                }
                nativeAd1.downloadMedia();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedfbnb1: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionfbnb1: ");
            }
        }).build());
    }

    public void showNativeFacebookBanner2() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadGoogleNativeSmall();
            return;
        }

        fbNativeBanerLayout2 = new RelativeLayout(activity);
        nativeAd1 = new NativeBannerAd(activity, FB_BannerNative_ID2);
        nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.luciada.modids.8
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e(TAG, "onMediaDownloadedfbnb2: ");
                fbNativeBanerLayout2.removeAllViews();
                Inflate_FBNativeBannerADS(nativeAd1, fbNativeBanerLayout2);
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorfbnb2: ");
                fbNativeBanerLayout2.removeAllViews();
                fbNativeBanerLayout2 = null;
                showNativeFacebookBanner3();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoadedfbnb2: ");
                if (nativeAd1 == null || nativeAd1 != ad) {
                    return;
                }
                nativeAd1.downloadMedia();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
                Log.e(TAG, "onAdClickedfbnb2: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
                Log.e(TAG, "onLoggingImpressionfbnb2: ");
            }
        }).build());
    }

    public void showNativeFacebookBanner3() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            LoadGoogleNativeSmall();
            return;
        }
        fbNativeBanerLayout3 = new RelativeLayout(activity);
        nativeAd1 = new NativeBannerAd(activity, FB_BannerNative_ID3);

        nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.luciada.modids.9
            @Override
            public void onMediaDownloaded(Ad ad) {
                fbNativeBanerLayout3.removeAllViews();
                Inflate_FBNativeBannerADS(nativeAd1, fbNativeBanerLayout3);
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                Log.e(TAG, "onErrorfbnb3: ");
                fbNativeBanerLayout3.removeAllViews();
                fbNativeBanerLayout3 = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("facebook")) {
                    LoadGoogleNativeSmall();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                if (nativeAd1 == null || nativeAd1 != ad) {
                    return;
                }
                nativeAd1.downloadMedia();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
            }
        }).build());
    }

    public void Inflate_FBNativeBannerADS(NativeBannerAd nativeBannerAd, ViewGroup cardView) {
        nativeBannerAd.unregisterView();
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = inflater.inflate(R.layout.ads_nb_fb, (ViewGroup) null);
        cardView.addView(view);
        NativeAdLayout nativeAdLayout = (NativeAdLayout) view.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = (LinearLayout) view.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeBannerAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);
        TextView nativeAdTitle = (TextView) view.findViewById(R.id.native_ad_title);
        TextView nativeAdSocialContext = (TextView) view.findViewById(R.id.native_ad_social_context);
        MediaView nativeAdIconView = (MediaView) view.findViewById(R.id.native_icon_view);
        TextView nativeAdCallToAction = (TextView) view.findViewById(R.id.b_name);
        nativeAdCallToAction.setText(nativeBannerAd.getAdCallToAction());
        nativeAdCallToAction.setVisibility(nativeBannerAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdTitle.setText(nativeBannerAd.getAdvertiserName());
        nativeAdSocialContext.setText(nativeBannerAd.getAdBodyText());
        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdCallToAction);
        clickableViews.add(nativeAdIconView);
        clickableViews.add(nativeAdSocialContext);
        nativeBannerAd.registerViewForInteraction(view, nativeAdIconView, clickableViews);
    }


    public void LoadGoogleNativeSmall() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobNativeBanerLayout = new RelativeLayout(activity);
        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_NativeBanner1);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public void onNativeAdLoaded(NativeAd NativeAd) {
                if (admobBannerNativeAd != null) {
                    admobBannerNativeAd.destroy();
                }
                admobBannerNativeAd = NativeAd;
                populateUnifiedNativeBannerAdView(NativeAd, admobNativeBanerLayout);
            }
        });
        AdLoader adLoader = builder.withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.11
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggnb1: ");
                admobNativeBanerLayout.removeAllViews();
                admobNativeBanerLayout = null;
                LoadGoogleNativeSmall2();
            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }


    public void LoadGoogleNativeSmall2() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobNativeBanerLayout2 = new RelativeLayout(activity);
        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_NativeBanner2);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.12
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public void onNativeAdLoaded(NativeAd NativeAd) {
                if (admobBannerNativeAd != null) {
                    admobBannerNativeAd.destroy();
                }
                admobBannerNativeAd = NativeAd;
                populateUnifiedNativeBannerAdView(NativeAd, admobNativeBanerLayout2);
            }
        });
        AdLoader adLoader = builder.withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.13
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadggnb2: ");
                admobNativeBanerLayout2.removeAllViews();
                admobNativeBanerLayout2 = null;
                LoadGoogleNativeSmall3();
            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }


    public void LoadGoogleNativeSmall3() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustBannerCallAD(activity);
            return;
        }
        admobNativeBanerLayout3 = new RelativeLayout(activity);
        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_NativeBanner3);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.14
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public void onNativeAdLoaded(NativeAd NativeAd) {
                if (admobBannerNativeAd != null) {
                    admobBannerNativeAd.destroy();
                }
                admobBannerNativeAd = NativeAd;
                populateUnifiedNativeBannerAdView(NativeAd, admobNativeBanerLayout3);
            }
        });
        AdLoader adLoader = builder.withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.15
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                admobNativeBanerLayout3.removeAllViews();
                admobNativeBanerLayout3 = null;
                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Banner_AdsPriority.equalsIgnoreCase("google")) {
                    showNativeFacebookBanner();
                }
            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void populateUnifiedNativeBannerAdView(NativeAd nativeAd, ViewGroup nativeAdContainer) {
        LayoutInflater inflater = LayoutInflater.from(activity);
        View view = inflater.inflate(R.layout.google_small_native_banner, (ViewGroup) null);
        nativeAdContainer.removeAllViews();
        nativeAdContainer.addView(view);
        NativeAdView adView = (NativeAdView) view.findViewById(R.id.ntbnradview);
        adView.setMediaView((com.google.android.gms.ads.nativead.MediaView) adView.findViewById(R.id.ad_medianb));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headlinenb));
        adView.setBodyView(adView.findViewById(R.id.ad_bodynb));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_actionnb));
        adView.setIconView(adView.findViewById(R.id.ad_app_iconnb));
        adView.setStarRatingView(adView.findViewById(R.id.ad_starsnb));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertisernb));
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }
        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }
        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }
        adView.setNativeAd(nativeAd);
    }

    public void ads_NativeCall(ViewGroup native_container) {
        if (app_AllAdShowStatus == 0) {
            if (app_OnlyNativeADShow.equalsIgnoreCase("true")) {
                native_container.setVisibility(View.GONE);
                onlyCustNativeCallAD(activity);
            } else {
                native_container.setVisibility(View.GONE);
                return;
            }
        }
        if (app_Native_AdsPriority.equalsIgnoreCase("google") || app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
            if (app_NativeAdCodeType.equalsIgnoreCase("new")) {
                showNativeNew(native_container);
            } else {
                showNative(native_container);
            }
        } else if (app_Native_AdsPriority.equalsIgnoreCase("applovin")) {
            applovinNativeDisplay(native_container);
        } else if (app_OnlyNativeADShow.equalsIgnoreCase("true")) {
            native_container.setVisibility(View.GONE);
            onlyCustNativeCallAD(activity);
        } else {
            native_container.setVisibility(View.GONE);
        }
    }

    public void Load_NativeNewAds() {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true")) {
            if (app_Native_AdsPriority.equalsIgnoreCase("google")) {
                LoadAdNativeNew();
            } else if (app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
                showFacebookNativeNew();
            }
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("google")) {
            LoadAdNativeNew();
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
            showFacebookNativeNew();
        }
    }

    public void showNativeNew(ViewGroup banner_container) {
        if (app_AllAdShowStatus != 0 && Native_Ads_On.equalsIgnoreCase("true")) {
            displayNativeNew(banner_container);
        }
    }

    public void displayNativeNew(ViewGroup Adlayout) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
            LinearLayout linearLayout = fbNativeNewLayout;
            if (linearLayout != null) {
                if (linearLayout.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout.getParent()).removeView(fbNativeNewLayout);
                }
                Adlayout.addView(fbNativeNewLayout);
                return;
            }
            LinearLayout linearLayout2 = fbNativeNewLayout2;
            if (linearLayout2 != null) {
                if (linearLayout2.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout2.getParent()).removeView(fbNativeNewLayout2);
                }
                Adlayout.addView(fbNativeNewLayout2);
                return;
            }
            LinearLayout linearLayout3 = fbNativeNewLayout3;
            if (linearLayout3 != null) {
                if (linearLayout3.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout3.getParent()).removeView(fbNativeNewLayout3);
                }
                Adlayout.addView(fbNativeNewLayout3);
                return;
            }
            LinearLayout linearLayout4 = fbNativeNewLayout4;
            if (linearLayout4 != null) {
                if (linearLayout4.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout4.getParent()).removeView(fbNativeNewLayout4);
                }
                Adlayout.addView(fbNativeNewLayout4);
                return;
            }
            LinearLayout linearLayout5 = admobNativeNewLayout;
            if (linearLayout5 != null) {
                if (linearLayout5.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout.getParent()).removeView(admobNativeNewLayout);
                }
                Adlayout.addView(admobNativeNewLayout);
                return;
            }
            LinearLayout linearLayout6 = admobNativeNewLayout2;
            if (linearLayout6 != null) {
                if (linearLayout6.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout2.getParent()).removeView(admobNativeNewLayout2);
                }
                Adlayout.addView(admobNativeNewLayout2);
                return;
            }
            LinearLayout linearLayout7 = admobNativeNewLayout3;
            if (linearLayout7 != null) {
                if (linearLayout7.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout3.getParent()).removeView(admobNativeNewLayout3);
                }
                Adlayout.addView(admobNativeNewLayout3);
                return;
            }
            LinearLayout linearLayout8 = admobNativeNewLayout4;
            if (linearLayout8 != null) {
                if (linearLayout8.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout4.getParent()).removeView(admobNativeNewLayout4);
                }
                Adlayout.addView(admobNativeNewLayout4);
                showFacebookNativeNew();
                return;
            }
            onlyCustNativeCallAD(activity);
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("google")) {
            LinearLayout linearLayout9 = admobNativeNewLayout;
            if (linearLayout9 != null) {
                if (linearLayout9.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout.getParent()).removeView(admobNativeNewLayout);
                }
                Adlayout.addView(admobNativeNewLayout);
                return;
            }
            LinearLayout linearLayout10 = admobNativeNewLayout2;
            if (linearLayout10 != null) {
                if (linearLayout10.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout2.getParent()).removeView(admobNativeNewLayout2);
                }
                Adlayout.addView(admobNativeNewLayout2);
                return;
            }
            LinearLayout linearLayout11 = admobNativeNewLayout3;
            if (linearLayout11 != null) {
                if (linearLayout11.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout3.getParent()).removeView(admobNativeNewLayout3);
                }
                Adlayout.addView(admobNativeNewLayout3);
                return;
            }
            LinearLayout linearLayout12 = admobNativeNewLayout4;
            if (linearLayout12 != null) {
                if (linearLayout12.getParent() != null) {
                    ((ViewGroup) admobNativeNewLayout4.getParent()).removeView(admobNativeNewLayout4);
                }
                Adlayout.addView(admobNativeNewLayout4);
                return;
            }
            LinearLayout linearLayout13 = fbNativeNewLayout;
            if (linearLayout13 != null) {
                if (linearLayout13.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout.getParent()).removeView(fbNativeNewLayout);
                }
                Adlayout.addView(fbNativeNewLayout);
                return;
            }
            LinearLayout linearLayout14 = fbNativeNewLayout2;
            if (linearLayout14 != null) {
                if (linearLayout14.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout2.getParent()).removeView(fbNativeNewLayout2);
                }
                Adlayout.addView(fbNativeNewLayout2);
                return;
            }
            LinearLayout linearLayout15 = fbNativeNewLayout3;
            if (linearLayout15 != null) {
                if (linearLayout15.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout3.getParent()).removeView(fbNativeNewLayout3);
                }
                Adlayout.addView(fbNativeNewLayout3);
                return;
            }
            LinearLayout linearLayout16 = fbNativeNewLayout4;
            if (linearLayout16 != null) {
                if (linearLayout16.getParent() != null) {
                    ((ViewGroup) fbNativeNewLayout4.getParent()).removeView(fbNativeNewLayout4);
                }
                Adlayout.addView(fbNativeNewLayout4);
                LoadAdNativeNew();
            }
        } else {
            onlyCustNativeCallAD(activity);
        }
    }

    public void showFacebookNativeNew() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }
        fbNativeNewLayout = new LinearLayout(activity);
        fbNativeNewLayout.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID1);
        NativeAdListener nativeAdListener = new NativeAdListener() { // from class: com.luciada.modids.16
            @Override // com.facebook.ads.NativeAdListener
            public void onMediaDownloaded(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                fbNativeNewLayout = null;
                showFacebookNativeNew2();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                inflateFBNativeAd(nativeAd, fbNativeNewLayout);
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
            }
        };
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(nativeAdListener).build());
    }

    public void showFacebookNativeNew2() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        fbNativeNewLayout2 = new LinearLayout(activity);
        fbNativeNewLayout2.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID2);
        NativeAdListener nativeAdListener = new NativeAdListener() { // from class: com.luciada.modids.17
            @Override // com.facebook.ads.NativeAdListener
            public void onMediaDownloaded(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                fbNativeNewLayout2 = null;
                showFacebookNativeNew3();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {

                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                inflateFBNativeAd(nativeAd, fbNativeNewLayout2);
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
            }
        };
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(nativeAdListener).build());
    }

    public void showFacebookNativeNew3() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        fbNativeNewLayout3 = new LinearLayout(activity);
        fbNativeNewLayout3.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID3);
        NativeAdListener nativeAdListener = new NativeAdListener() { // from class: com.luciada.modids.18
            @Override // com.facebook.ads.NativeAdListener
            public void onMediaDownloaded(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                fbNativeNewLayout3 = null;
                showFacebookNativeNew4();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                inflateFBNativeAd(nativeAd, fbNativeNewLayout3);
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
            }
        };
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(nativeAdListener).build());
    }

    public void showFacebookNativeNew4() {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        fbNativeNewLayout4 = new LinearLayout(activity);
        fbNativeNewLayout4.setOrientation(LinearLayout.VERTICAL);
        fbNativeNewLayout4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        final com.facebook.ads.NativeAd nativeAd = new com.facebook.ads.NativeAd(activity, FB_Native_ID4);
        NativeAdListener nativeAdListener = new NativeAdListener() { // from class: com.luciada.modids.19
            @Override
            public void onMediaDownloaded(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                fbNativeNewLayout4 = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
                    LoadAdNativeNew();
                }
            }

            @Override
            public void onAdLoaded(Ad ad) {

                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                inflateFBNativeAd(nativeAd, fbNativeNewLayout4);
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
            }
        };
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(nativeAdListener).build());
    }

    public void inflateFBNativeAd(com.facebook.ads.NativeAd nativeAd, ViewGroup card) {
        nativeAd.unregisterView();
        LayoutInflater inflater = LayoutInflater.from(activity);
        View adView = inflater.inflate(R.layout.fb_native_layout, (ViewGroup) null);
        card.removeAllViews();
        card.addView(adView);
        NativeAdLayout nativeAdLayout = (NativeAdLayout) adView.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = (LinearLayout) adView.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);
        MediaView nativeAdIcon = (MediaView) adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = (TextView) adView.findViewById(R.id.native_ad_title);
        MediaView nativeAdMedia = (MediaView) adView.findViewById(R.id.native_ad_media);
        TextView nativeAdSocialContext = (TextView) adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdBody = (TextView) adView.findViewById(R.id.native_ad_body);
        TextView sponsoredLabel = (TextView) adView.findViewById(R.id.native_ad_sponsored_label);
        TextView nativeAdCallToAction = (TextView) adView.findViewById(R.id.native_ad_call_to_action);
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        if (!Native_Btn_Text_Size.isEmpty()) {
            nativeAdCallToAction.setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }
        if (!Native_Btn_text.isEmpty()) {
            nativeAdCallToAction.setText(Native_Btn_text);
        } else {
            nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        }
        if (!Native_Btn_Text_Color.isEmpty()) {
            nativeAdCallToAction.setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }
        if (!Native_Btn_Color.isEmpty()) {
            nativeAdCallToAction.setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());
        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdBody);
        clickableViews.add(nativeAdCallToAction);
        clickableViews.add(nativeAdIcon);
        clickableViews.add(nativeAdSocialContext);
        nativeAd.registerViewForInteraction(adView, nativeAdMedia, nativeAdIcon, clickableViews);
    }

    public void LoadAdNativeNew() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }
        admobNativeNewLayout = new LinearLayout(activity);
        admobNativeNewLayout.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native1);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.20
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;
                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout);
            }
        });
        AdLoader adLoader = builder.withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.21
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                admobNativeNewLayout.removeAllViews();
                admobNativeNewLayout = null;
                LoadAdNativeNew2();
            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void LoadAdNativeNew2() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }
        admobNativeNewLayout2 = new LinearLayout(activity);
        admobNativeNewLayout2.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native2);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.22
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public void onNativeAdLoaded(NativeAd NativeAd) {
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;
                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout2);
            }
        });
        AdLoader adLoader = builder.withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.23
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                admobNativeNewLayout2.removeAllViews();
                admobNativeNewLayout2 = null;
                LoadAdNativeNew3();
            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void LoadAdNativeNew3() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }
        admobNativeNewLayout3 = new LinearLayout(activity);
        admobNativeNewLayout3.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native3);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd NativeAd) {
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;
                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout3);
            }
        });
        AdLoader adLoader = builder.withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.25
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                admobNativeNewLayout3.removeAllViews();
                admobNativeNewLayout3 = null;
                LoadAdNativeNew4();
            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void LoadAdNativeNew4() {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }
        admobNativeNewLayout4 = new LinearLayout(activity);
        admobNativeNewLayout4.setOrientation(LinearLayout.VERTICAL);
        admobNativeNewLayout4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        AdLoader.Builder builder = new AdLoader.Builder(activity, AD_MOB_APP_ID_Native4);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.26
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public void onNativeAdLoaded(NativeAd NativeAd) {
                if (admobNativeAd_preLoad != null) {
                    admobNativeAd_preLoad.destroy();
                }
                admobNativeAd_preLoad = NativeAd;
                populateUnifiedNativeAdView(NativeAd, admobNativeNewLayout4);
            }
        });
        AdLoader adLoader = builder.withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.27
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                admobNativeNewLayout4.removeAllViews();
                admobNativeNewLayout4 = null;
                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("google")) {
                    showFacebookNativeNew();
                }
            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }

    public void populateUnifiedNativeAdView(NativeAd nativeAd, ViewGroup nativeAdContainer) {
        View view;
        nativeAdContainer.setVisibility(View.VISIBLE);
        LayoutInflater inflater = LayoutInflater.from(activity);
        if (Native_Ad_Shape_Round_Corner.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_round, (ViewGroup) null);
        } else if (Native_Ad_Shape_Square_Corner.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_square, (ViewGroup) null);
        } else if (Native_Ad_Shape_Normal_Round_Btn.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_normal_round_btn, (ViewGroup) null);
        } else if (Native_Ad_Small_Size.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_small_size, (ViewGroup) null);
        } else {
            view = inflater.inflate(R.layout.native_admob_square, (ViewGroup) null);
        }
        nativeAdContainer.removeAllViews();
        nativeAdContainer.addView(view);
        NativeAdView adView = (NativeAdView) view.findViewById(R.id.uadview);
        adView.setMediaView((com.google.android.gms.ads.nativead.MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        if (!Native_Btn_Color.isEmpty()) {
            adView.findViewById(R.id.ad_call_to_action).setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        if (nativeAd.getBody() != null) {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        } else {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        }
        if (!Native_Btn_Text_Size.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }
        if (!Native_Btn_Text_Color.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }
        if (nativeAd.getCallToAction() != null) {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (!Native_Btn_text.isEmpty()) {
                ((TextView) adView.getCallToActionView()).setText(Native_Btn_text);
            } else {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        } else {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        }
        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }
        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }
        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }
        adView.setNativeAd(nativeAd);
    }

    public void showNative(ViewGroup nativeAdContainer) {
        if (app_AllAdShowStatus != 0 && Native_Ads_On.equalsIgnoreCase("true")) {
            displayNative(nativeAdContainer);
        }
    }

    public void displayNative(ViewGroup nativeAdContainer) {
        if (AD_MOB_STATUS.equalsIgnoreCase("true") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true")) {
            if (app_Native_AdsPriority.equalsIgnoreCase("google")) {
                showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            } else if (app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
                showFacebookNative(nativeAdContainer, FB_Native_ID1);
            }
        } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("google")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
            showFacebookNative(nativeAdContainer, FB_Native_ID1);
        }
    }

    public void showFacebookNative(final ViewGroup nativeAdContainer, final String facebook_n1) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }

        if (fbNativeAd_preLoad == null) {
            final com.facebook.ads.NativeAd nativeAd2 = new com.facebook.ads.NativeAd(activity, facebook_n1);
            nativeAd2.loadAd(nativeAd2.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.luciada.modids.28
                @Override // com.facebook.ads.NativeAdListener
                public void onMediaDownloaded(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    showFacebookNative2(nativeAdContainer, FB_Native_ID2);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    if (nativeAd2 == null || nativeAd2 != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd2, nativeAdContainer, facebook_n1);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                }
            }).build());
            return;
        }
        state_fbNative = "Start";
        inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n1);
    }

    public void showFacebookNative2(final ViewGroup nativeAdContainer, final String facebook_n2) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }

        if (fbNativeAd_preLoad == null) {
            final com.facebook.ads.NativeAd nativeAd2 = new com.facebook.ads.NativeAd(activity, facebook_n2);
            nativeAd2.loadAd(nativeAd2.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                @Override // com.facebook.ads.NativeAdListener
                public void onMediaDownloaded(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    showFacebookNative3(nativeAdContainer, FB_Native_ID3);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    if (nativeAd2 == null || nativeAd2 != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd2, nativeAdContainer, facebook_n2);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                }
            }).build());
            return;
        }
        state_fbNative = "Start";
        inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n2);
    }

    public void showFacebookNative3(final ViewGroup nativeAdContainer, final String facebook_n3) {
        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }

        if (fbNativeAd_preLoad == null) {
            final com.facebook.ads.NativeAd nativeAd2 = new com.facebook.ads.NativeAd(activity, facebook_n3);
            nativeAd2.loadAd(nativeAd2.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.luciada.modids.30
                @Override // com.facebook.ads.NativeAdListener
                public void onMediaDownloaded(Ad ad) {
                    Log.e(TAG, "onMediaDownloaded: ");
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    Log.e(TAG, "onError: ");
                    showFacebookNative4(nativeAdContainer, FB_Native_ID4);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    Log.e(TAG, "onAdLoaded: ");
                    if (nativeAd2 == null || nativeAd2 != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd2, nativeAdContainer, facebook_n3);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                    Log.e(TAG, "onAdClicked: ");
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                    Log.e(TAG, "onLoggingImpression: ");
                }
            }).build());
        } else {
            state_fbNative = "Start";
            inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n3);
        }
    }

    public void showFacebookNative4(final ViewGroup nativeAdContainer, final String facebook_n4) {

        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false")) {
            showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
            return;
        }


        if (fbNativeAd_preLoad == null) {
            final com.facebook.ads.NativeAd nativeAd2 = new com.facebook.ads.NativeAd(activity, facebook_n4);
            nativeAd2.loadAd(nativeAd2.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.luciada.modids.31
                @Override // com.facebook.ads.NativeAdListener
                public void onMediaDownloaded(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("facebook")) {
                        showAdmobNative(nativeAdContainer, AD_MOB_APP_ID_Native1);
                    }
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    if (nativeAd2 == null || nativeAd2 != ad) {
                        return;
                    }
                    inflate_NATIV_FB(nativeAd2, nativeAdContainer, facebook_n4);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                }
            }).build());
            return;
        }
        state_fbNative = "Start";
        inflate_NATIV_FB(fbNativeAd_preLoad, nativeAdContainer, facebook_n4);
    }

    public void inflate_NATIV_FB(com.facebook.ads.NativeAd nativeAd, final ViewGroup card, final String facebook_n) {
        nativeAd.unregisterView();
        LayoutInflater inflater = LayoutInflater.from(activity);
        View adView = inflater.inflate(R.layout.fb_native_layout, (ViewGroup) null);
        card.removeAllViews();
        card.addView(adView);
        NativeAdLayout nativeAdLayout = (NativeAdLayout) adView.findViewById(R.id.nativview);
        LinearLayout adChoicesContainer = (LinearLayout) adView.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(activity, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);
        MediaView nativeAdIcon = (MediaView) adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = (TextView) adView.findViewById(R.id.native_ad_title);
        MediaView nativeAdMedia = (MediaView) adView.findViewById(R.id.native_ad_media);
        TextView nativeAdSocialContext = (TextView) adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdBody = (TextView) adView.findViewById(R.id.native_ad_body);
        TextView sponsoredLabel = (TextView) adView.findViewById(R.id.native_ad_sponsored_label);
        TextView nativeAdCallToAction = (TextView) adView.findViewById(R.id.native_ad_call_to_action);
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        if (!Native_Btn_Text_Size.isEmpty()) {
            nativeAdCallToAction.setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }
        if (!Native_Btn_text.isEmpty()) {
            nativeAdCallToAction.setText(Native_Btn_text);
        } else {
            nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        }
        if (!Native_Btn_Text_Color.isEmpty()) {
            nativeAdCallToAction.setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }
        if (!Native_Btn_Color.isEmpty()) {
            nativeAdCallToAction.setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());
        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdBody);
        clickableViews.add(nativeAdCallToAction);
        clickableViews.add(nativeAdIcon);
        clickableViews.add(nativeAdSocialContext);
        nativeAd.registerViewForInteraction(adView, nativeAdMedia, nativeAdIcon, clickableViews);
        if ((preloadNative_AdStatus && state_fbNative.equals("Start")) || state_fbNative.equals("Fail")) {
            if (facebook_n.isEmpty()) {
                return;
            }
            state_fbNative = "Loading";
            final com.facebook.ads.NativeAd nativeAd1 = new com.facebook.ads.NativeAd(activity, facebook_n);
            nativeAd1.loadAd(nativeAd1.buildLoadAdConfig().withAdListener(new NativeAdListener() { // from class: com.luciada.modids.32
                @Override // com.facebook.ads.NativeAdListener
                public void onMediaDownloaded(Ad ad) {
                    Log.e(TAG, "onMediaDownloadedinflate: ");
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    Log.e(TAG, "onErrorinflate: ");
                    state_fbNative = "Fail";
                    fbNativeAd_preLoad = null;
                    showFacebookNative(card, facebook_n);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    Log.e(TAG, "onAdLoadedinflate: ");
                    if (nativeAd1 == null || nativeAd1 != ad) {
                        Log.e(TAG, "onAdLoadedIFinflate: ");
                        return;
                    }
                    fbNativeAd_preLoad = null;
                    fbNativeAd_preLoad = nativeAd1;
                    state_fbNative = "Loaded";
                }

                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                    Log.e(TAG, "onAdClickedinflate: ");
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                    Log.e(TAG, "onLoggingImpressioninflate: ");
                }
            }).build());
            return;
        }
        Log.e("fb_stateinflate", "proccess");
    }

    public void showAdmobNative(final ViewGroup nativeAdContainer, final String admob_native1) {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            Log.e(TAG, "showAdmobNativePreloadIF: ");
            AdLoader adLoader = new AdLoader.Builder(activity, admob_native1).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.34
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd2) {
                    Log.e(TAG, "onNativeAdLoaded0condition::");
                    inflate_NATIV_ADMOB(nativeAd2, nativeAdContainer, admob_native1);
                }
            }).withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.33
                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError adError) {
                    Log.e(TAG, "onAdFailedToLoad0condition:: ");
                    showAdmobNative2(nativeAdContainer, AD_MOB_APP_ID_Native2);
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
            adLoader.loadAd(new AdRequest.Builder().build());
            return;
        }
        state_admobNative = "Start";
        inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native1);
    }

    public void showAdmobNative2(final ViewGroup nativeAdContainer, final String admob_native2) {
        Log.e(TAG, "showAdmobNative2: ");
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            AdLoader adLoader = new AdLoader.Builder(activity, admob_native2).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.36
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd2) {
                    Log.e(TAG, "onNativeAdLoaded0condition2::");
                    inflate_NATIV_ADMOB(nativeAd2, nativeAdContainer, admob_native2);
                }
            }).withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.35
                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError adError) {
                    Log.e(TAG, "onAdFailedToLoad0condition2:: ");
                    showAdmobNative3(nativeAdContainer, AD_MOB_APP_ID_Native3);
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
            adLoader.loadAd(new AdRequest.Builder().build());
            return;
        }
        state_admobNative = "Start";
        inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native2);
    }

    public void showAdmobNative3(final ViewGroup nativeAdContainer, final String admob_native3) {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            Log.e(TAG, "showAdmobNative3PreloadIF3: ");
            AdLoader adLoader = new AdLoader.Builder(activity, admob_native3).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.38
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd2) {
                    Log.e(TAG, "onNativeAdLoaded0condition3::");
                    inflate_NATIV_ADMOB(nativeAd2, nativeAdContainer, admob_native3);
                }
            }).withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.37
                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError adError) {
                    Log.e(TAG, "onAdFailedToLoad0condition3:: ");
                    showAdmobNative4(nativeAdContainer, AD_MOB_APP_ID_Native4);
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
            adLoader.loadAd(new AdRequest.Builder().build());
            return;
        }
        state_admobNative = "Start";
        inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native3);
    }

    public void showAdmobNative4(final ViewGroup nativeAdContainer, final String admob_native4) {
        if (AD_MOB_STATUS.equalsIgnoreCase("false")) {
            onlyCustNativeCallAD(activity);
            return;
        }

        if (admobNativeAd_preLoad == null) {
            Log.e(TAG, "showAdmobNative4PreloadIF4: ");
            AdLoader adLoader = new AdLoader.Builder(activity, admob_native4).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.40
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd2) {
                    Log.e(TAG, "3onNativeAdLoaded0condition4::");
                    inflate_NATIV_ADMOB(nativeAd2, nativeAdContainer, admob_native4);
                }
            }).withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.39
                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError adError) {
                    Log.e(TAG, "onAdFailedToLoad0condition4:: ");
                    if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_Native_AdsPriority.equalsIgnoreCase("google")) {
                        showFacebookNative(nativeAdContainer, FB_Native_ID1);
                    }
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
            adLoader.loadAd(new AdRequest.Builder().build());
            return;
        }
        state_admobNative = "Start";
        inflate_NATIV_ADMOB(admobNativeAd_preLoad, nativeAdContainer, admob_native4);
    }

    public void inflate_NATIV_ADMOB(NativeAd nativeAd, final ViewGroup nativeAdContainer, final String admob_native) {
        View view;
        nativeAdContainer.setVisibility(View.VISIBLE);
        LayoutInflater inflater = LayoutInflater.from(activity);
        if (Native_Ad_Shape_Round_Corner.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_round, (ViewGroup) null);
        } else if (Native_Ad_Shape_Square_Corner.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_square, (ViewGroup) null);
        } else if (Native_Ad_Shape_Normal_Round_Btn.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_normal_round_btn, (ViewGroup) null);
        } else if (Native_Ad_Small_Size.equals("true")) {
            view = inflater.inflate(R.layout.native_admob_small_size, (ViewGroup) null);
        } else {
            view = inflater.inflate(R.layout.native_admob_square, (ViewGroup) null);
        }
        nativeAdContainer.removeAllViews();
        nativeAdContainer.addView(view);
        NativeAdView adView = (NativeAdView) view.findViewById(R.id.uadview);
        adView.setMediaView((com.google.android.gms.ads.nativead.MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        if (!Native_Btn_Color.isEmpty()) {
            adView.findViewById(R.id.ad_call_to_action).setBackgroundColor(Color.parseColor(Native_Btn_Color));
        }
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));
        adView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());
        if (nativeAd.getBody() != null) {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        } else {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        }
        if (!Native_Btn_Text_Size.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextSize(Float.parseFloat(Native_Btn_Text_Size));
        }
        if (!Native_Btn_Text_Color.isEmpty()) {
            ((TextView) adView.getCallToActionView()).setTextColor(Color.parseColor(Native_Btn_Text_Color));
        }
        if (nativeAd.getCallToAction() != null) {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            if (!Native_Btn_text.isEmpty()) {
                ((TextView) adView.getCallToActionView()).setText(Native_Btn_text);
            } else {
                ((TextView) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        } else {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        }
        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }
        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }
        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }
        adView.setNativeAd(nativeAd);
        if ((preloadNative_AdStatus && state_admobNative.equals("Start")) || state_admobNative.equals("Fail")) {
            Log.e(TAG, "inflate_NATIV_ADMOBIFTruePreload: " + preloadNative_AdStatus);
            if (admob_native.isEmpty()) {
                Log.e(TAG, "inflate_NATIV_ADMOBadmob_dbEmityConditomnif: ");
                return;
            }
            state_admobNative = "Loading";
            AdLoader adLoader = new AdLoader.Builder(activity, admob_native).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.luciada.modids.42
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd2) {
                    Log.e(TAG, "MainonNativeAdLoaded: ");
                    admobNativeAd_preLoad = null;
                    admobNativeAd_preLoad = nativeAd2;
                    state_admobNative = "Loaded";
                }
            }).withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.luciada.modids.41
                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError adError) {
                    admobNativeAd_preLoad = null;
                    state_admobNative = "Fail";
                    showAdmobNative(nativeAdContainer, admob_native);
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().build()).build();
            adLoader.loadAd(new AdRequest.Builder().build());
            return;
        }
        Log.e("admob_state", "proccess");
    }

    public void loadInterstitialAd(Activity activity2) {
        turnLoadInterstitialAd(activity2, AD_MOB_APP_ID_Inter1, FB_Inter_ID1, app_UnityInterstitialId1, app_ApplovinInterstitialId1);
    }

    public void turnLoadInterstitialAd(Activity activity2, String google_i, String facebook_i, String unity_i, String applovin_i) {
        if (app_AllAdShowStatus == 0) {
            return;
        }
        if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google") && !google_i.isEmpty() && !this.google_i_pre.equals(google_i)) {
            loadAdmobInterstitial(activity2, google_i);
        } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook") && !facebook_i.isEmpty() && !this.facebook_i_pre.equals(facebook_i)) {
            loadFacebookInterstitial(activity2, facebook_i);
        } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin") && !applovin_i.isEmpty() && !this.maxapplovin_i_pre.equals(applovin_i)) {
            loadApplovinInterstital1(activity2, applovin_i);
        } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity") && !unity_i.isEmpty() && !this.unity_i_pre.equals(unity_i)) {
            loadUnityInterstital1(activity2, unity_i);
        }
    }

    public void showInterstitialAd(Activity context, MyCallback myCallback2, int how_many_clicks) {
        turnInterstitialAd(context, myCallback2, how_many_clicks);
    }

    public void turnInterstitialAd(Activity context, MyCallback myCallback2, int how_many_clicks) {
        myCallback = myCallback2;
        int i = count_click + 1;
        count_click = i;
        if (app_AllAdShowStatus == 0) {
            if (myCallback2 != null) {
                myCallback2.callbackCall();
                myCallback = null;
            }
        } else if (how_many_clicks != 0 && i % how_many_clicks != 0) {
            if (myCallback2 != null) {
                myCallback2.callbackCall();
                myCallback = null;
            }
        } else {
            displayInterstitialAd(context);
        }
    }


    public void displayInterstitialAd(final Activity context) {

        this.dialog = new Dialog(context);
        View view = LayoutInflater.from(context).inflate(R.layout.ad_loading_progress_dialog, null);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(view);
        dialog.setCancelable(false);
        //  dialog.getWindow();
        Window window = dialog.getWindow();

        if (app_AdsPriority.equalsIgnoreCase("google")) {
            if (AD_MOB_STATUS.equalsIgnoreCase("true") && mInterstitialAd != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) {
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            mInterstitialAd.show((Activity) context);
                        }
                    }.start();
                    //  return;
                } else {
                    mInterstitialAd.show((Activity) context);
                }
            } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && fbinterstitialAd1.isAdLoaded()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.44
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            fbinterstitialAd1.show();
                        }
                    }.start();
                    // return;
                } else {
                    fbinterstitialAd1.show();
                }

            } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && maxInterstitialAd.isReady()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.45
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            maxInterstitialAd.showAd();
                        }
                    }.start();
                    // return;
                } else {
                    maxInterstitialAd.showAd();
                }

            } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && showListener != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.46
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            UnityAds.show(activity, unity_i_pre, showListener);
                        }
                    }.start();
                    //  return;
                } else {
                    UnityAds.show(activity, unity_i_pre, showListener);
                }
            } else {
                if (!google_i_pre.isEmpty()) {
                    loadAdmobInterstitial(context, google_i_pre);
                }
                nextInterstitialPlatform();
            }
        } else if (app_AdsPriority.equalsIgnoreCase("facebook")) {
            if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && fbinterstitialAd1.isAdLoaded()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.47
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            fbinterstitialAd1.show();
                        }
                    }.start();
                    //  return;
                } else {
                    fbinterstitialAd1.show();
                }

            } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && mInterstitialAd != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.48
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            mInterstitialAd.show(context);
                        }
                    }.start();
                    // return;
                } else {
                    mInterstitialAd.show(context);
                }

            } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && maxInterstitialAd.isReady()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.49
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            maxInterstitialAd.showAd();
                        }
                    }.start();
                    //  return;
                } else {
                    maxInterstitialAd.showAd();
                }
            } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && showListener != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.50
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            UnityAds.show(activity, unity_i_pre, showListener);
                        }
                    }.start();
                    // return;
                } else {
                    UnityAds.show(activity, unity_i_pre, showListener);
                }
            } else {
                if (!facebook_i_pre.isEmpty()) {
                    loadFacebookInterstitial(context, facebook_i_pre);
                }
                nextInterstitialPlatform();
            }
        } else if (app_AdsPriority.equalsIgnoreCase("applovin")) {
            if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && maxInterstitialAd.isReady()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.51
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            maxInterstitialAd.showAd();
                        }
                    }.start();
                    // return;
                } else {
                    maxInterstitialAd.showAd();
                }
            } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && mInterstitialAd != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.52
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            mInterstitialAd.show(context);
                        }
                    }.start();
                    //  return;
                } else {
                    mInterstitialAd.show(context);
                }
            } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && fbinterstitialAd1.isAdLoaded()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.53
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            fbinterstitialAd1.show();
                        }
                    }.start();
                    //   return;
                } else {
                    fbinterstitialAd1.show();

                }
            } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && showListener != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.54
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            UnityAds.show(activity, unity_i_pre, showListener);
                        }
                    }.start();
                    // return;
                } else {
                    UnityAds.show(activity, unity_i_pre, showListener);
                }

            } else {
                if (!this.maxapplovin_i_pre.isEmpty()) {
                    loadApplovinInterstital1(context, maxapplovin_i_pre);
                }
                nextInterstitialPlatform();
            }
        } else if (app_AdsPriority.equalsIgnoreCase("unity")) {
            if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && showListener != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.55
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            UnityAds.show(activity, unity_i_pre, showListener);
                        }
                    }.start();
                    //   return;
                } else {
                    UnityAds.show(activity, unity_i_pre, showListener);
                }

            } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && mInterstitialAd != null) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.56
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            mInterstitialAd.show(context);
                        }
                    }.start();
                    // return;
                } else {
                    mInterstitialAd.show(context);
                }
            } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && fbinterstitialAd1.isAdLoaded()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.57
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            fbinterstitialAd1.show();
                        }
                    }.start();
                    //  return;
                } else {
                    fbinterstitialAd1.show();
                }

            } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && maxInterstitialAd.isReady()) {
                if (Dialog_Show == 1) {
                    dialog.show();
                    new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.58
                        @Override // android.os.CountDownTimer
                        public void onTick(long millisUntilFinished) {
                            double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            dialog.dismiss();
                            maxInterstitialAd.showAd();
                        }
                    }.start();
                    //  return;
                } else {
                    maxInterstitialAd.showAd();
                }

            } else {
                if (!unity_i_pre.isEmpty()) {
                    loadUnityInterstital1(context, unity_i_pre);
                }
                nextInterstitialPlatform();
            }
        } else {
            nextInterstitialPlatform();
        }

    }

    public void loadAdmobInterstitial(final Activity activity2, String google_i) {
        google_i_pre = google_i;
        AdRequest adRequest = new AdRequest.Builder().build();
        com.google.android.gms.ads.interstitial.InterstitialAd.load(activity2, google_i, adRequest, new InterstitialAdLoadCallback() { // from class: com.luciada.modids.59
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                Log.e(TAG, "onAdLoadedgg1");
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.luciada.modids.59.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        Log.e("TAG", "onAdDismissedFullScreenContentgg1");
                        google_i_pre = AD_MOB_APP_ID_Inter1;
                        if (!google_i_pre.isEmpty()) {
                            loadAdmobInterstitial(activity2, google_i_pre);
                        }
                        interstitialCallBack();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        Log.e("TAG", "onAdFailedToShowFullScreenContentgg1");
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        mInterstitialAd = null;
                        Log.e("TAG", "onAdShowedFullScreenContentgg1");
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadgg1");
                mInterstitialAd = null;
                google_i_pre = AD_MOB_APP_ID_Inter2;
                if (!google_i_pre.isEmpty()) {

                    loadAdmobInterstitial2(activity2, google_i_pre);
                }
            }
        });
    }

    public void loadAdmobInterstitial2(final Activity activity2, String google_i) {
        this.google_i_pre = google_i;
        AdRequest adRequest = new AdRequest.Builder().build();
        com.google.android.gms.ads.interstitial.InterstitialAd.load(activity2, google_i, adRequest, new InterstitialAdLoadCallback() { // from class: com.luciada.modids.60
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                Log.e(TAG, "onAdLoadedgg2");
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.luciada.modids.60.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        Log.e("TAG", "onAdDismissedFullScreenContentgg2");
                        google_i_pre = AD_MOB_APP_ID_Inter2;
                        if (!google_i_pre.isEmpty()) {
                            loadAdmobInterstitial2(activity2, google_i_pre);
                        }
                        interstitialCallBack();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        Log.e("TAG", "onAdFailedToShowFullScreenContentgg2");
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        mInterstitialAd = null;
                        Log.e("TAG", "onAdShowedFullScreenContentgg2");
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadgg2");
                mInterstitialAd = null;
                google_i_pre = AD_MOB_APP_ID_Inter3;
                if (!google_i_pre.isEmpty()) {
                    loadAdmobInterstitial3(activity2, google_i_pre);
                }
            }
        });
    }

    public void loadAdmobInterstitial3(final Activity activity2, String google_i) {
        this.google_i_pre = google_i;
        AdRequest adRequest = new AdRequest.Builder().build();
        com.google.android.gms.ads.interstitial.InterstitialAd.load(activity2, google_i, adRequest, new InterstitialAdLoadCallback() { // from class: com.luciada.modids.61
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                Log.e(TAG, "onAdLoadedgg3");
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.luciada.modids.61.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        Log.e("TAG", "onAdDismissedFullScreenContentgg3");
                        google_i_pre = AD_MOB_APP_ID_Inter3;
                        if (!google_i_pre.isEmpty()) {
                            loadAdmobInterstitial3(activity2, google_i_pre);
                        }
                        interstitialCallBack();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                        Log.e("TAG", "onAdFailedToShowFullScreenContentgg3");
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        mInterstitialAd = null;
                        Log.e("TAG", "onAdShowedFullScreenContentgg3");
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.e(TAG, "onAdFailedToLoadgg3");
                mInterstitialAd = null;
                if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false") && APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("false") && UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false") && APPLOVIN_ADS_STATUS.equalsIgnoreCase("false") && UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false") && UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("false") && APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else {
                    nextInterstitialPlatform();
                }
            }
        });
    }

    public void loadFacebookInterstitial(final Activity activity2, String facebook_i) {
        this.facebook_i_pre = facebook_i;
        fbinterstitialAd1 = new InterstitialAd(activity2, facebook_i);
        fbinterstitialAd1.loadAd(fbinterstitialAd1.buildLoadAdConfig().withAdListener(new AbstractAdListener() { // from class: com.luciada.modids.62
            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
            public void onError(Ad ad, AdError error) {
                super.onError(ad, error);
                Log.e(TAG, "onError1: ");
                if (!facebook_i_pre.isEmpty()) {
                    loadFacebookInterstitial2(activity2, FB_Inter_ID2);
                }
            }

            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoaded1: ");
                super.onAdLoaded(ad);
            }

            @Override
            // com.facebook.ads.AbstractAdListener, com.facebook.ads.InterstitialAdListener
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "onInterstitialDismissed1: ");
                super.onInterstitialDismissed(ad);
                loadFacebookInterstitial(activity2, facebook_i_pre);
                interstitialCallBack();
            }
        }).build());
    }

    public void loadFacebookInterstitial2(final Activity activity2, String facebook_i) {
        this.facebook_i_pre = facebook_i;
        fbinterstitialAd1 = new InterstitialAd(activity2, facebook_i);

        fbinterstitialAd1.loadAd(fbinterstitialAd1.buildLoadAdConfig().withAdListener(new AbstractAdListener() { // from class: com.luciada.modids.63
            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
            public void onError(Ad ad, AdError error) {
                Log.e(TAG, "onError2: ");
                super.onError(ad, error);
                if (!facebook_i_pre.isEmpty()) {
                    loadFacebookInterstitial3(activity2, FB_Inter_ID3);
                }
            }

            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                Log.e(TAG, "onAdLoaded2: ");
                super.onAdLoaded(ad);
            }

            @Override
            // com.facebook.ads.AbstractAdListener, com.facebook.ads.InterstitialAdListener
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "onInterstitialDismissed2: ");
                super.onInterstitialDismissed(ad);
                loadFacebookInterstitial(activity2, facebook_i_pre);
                interstitialCallBack();
            }
        }).build());
    }

    public void loadFacebookInterstitial3(final Activity activity2, String facebook_i) {
        this.facebook_i_pre = facebook_i;
        fbinterstitialAd1 = new InterstitialAd(activity2, facebook_i);

        fbinterstitialAd1.loadAd(fbinterstitialAd1.buildLoadAdConfig().withAdListener(new AbstractAdListener() { // from class: com.luciada.modids.64
            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
            public void onError(Ad ad, AdError error) {
                super.onError(ad, error);
                Log.e(TAG, "onErrorinter3: ");
                if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadAdmobInterstitial(activity2, AD_MOB_APP_ID_Inter1);
                } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("false") && UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && APPLOVIN_ADS_STATUS.equalsIgnoreCase("false") && UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else {
                    nextInterstitialPlatform();
                }
            }

            @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                super.onAdLoaded(ad);
                Log.e(TAG, "onAdLoaded3: ");
            }

            @Override
            // com.facebook.ads.AbstractAdListener, com.facebook.ads.InterstitialAdListener
            public void onInterstitialDismissed(Ad ad) {
                Log.e(TAG, "onInterstitialDismissed3: ");
                super.onInterstitialDismissed(ad);
                loadFacebookInterstitial(activity2, facebook_i_pre);
                interstitialCallBack();
            }
        }).build());
    }

    public void interstitialCallBack() {
        MyCallback myCallback2 = myCallback;
        if (myCallback2 != null) {
            myCallback2.callbackCall();
            myCallback = null;
        }
    }

    public void nextInterstitialPlatform() {
        interstitialCallBack();
    }

    public void onlyCustBannerCallAD(final Activity activity2) {
        if (app_OnlyBannerADShow.equalsIgnoreCase("true")) {
            LinearLayout iv_qurekabanner = (LinearLayout) activity2.findViewById(R.id.iv_qurekabanner);
            ImageView nbanner_icon_view = (ImageView) activity2.findViewById(R.id.nbanner_icon_view);
            TextView banner_ad_title = (TextView) activity2.findViewById(R.id.banner_ad_title);
            TextView banner_subhander = (TextView) activity2.findViewById(R.id.banner_subhander);
            TextView bner_install = (TextView) activity2.findViewById(R.id.bner_install);
            iv_qurekabanner.setVisibility(View.VISIBLE);
            Glide.with(activity2).load(app_CustomeAdBannerIcon).into(nbanner_icon_view);
            banner_ad_title.setText(app_CustomeAdBannerHanderText);
            banner_subhander.setText(app_CustomeAdBannerSubHanderText);
            bner_install.setText(app_CustomeAdBannerInstallText);
            iv_qurekabanner.setOnClickListener(new View.OnClickListener() { // from class: com.luciada.modids..65
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    openChromeCustomTabUrl(activity2, app_CustomeADBannerLink);
                }
            });
        }
    }

    public void onlyCustNativeCallAD(final Activity activity2) {
        if (app_OnlyNativeADShow.equalsIgnoreCase("true")) {
            LinearLayout iv_qurekanative = (LinearLayout) activity2.findViewById(R.id.iv_qurekanative);
            ImageView ad_app_icon = (ImageView) activity2.findViewById(R.id.ad_app_icon);
            ImageView ad_image = (ImageView) activity2.findViewById(R.id.ad_image);
            TextView ad_headline = (TextView) activity2.findViewById(R.id.ad_headline);
            TextView ad_subheadline = (TextView) activity2.findViewById(R.id.ad_subheadline);
            TextView ad_subheadline2 = (TextView) activity2.findViewById(R.id.ad_subheadline2);
            TextView ad_call_to_action = (TextView) activity2.findViewById(R.id.ad_call_to_action);
            iv_qurekanative.setVisibility(View.VISIBLE);
            Glide.with(activity2).load(app_CustomeAdNativeLargeImage).into(ad_image);
            Glide.with(activity2).load(app_CustomeAdNativeIconImage).into(ad_app_icon);
            ad_headline.setText(app_CustomeAdNativeTitle);
            ad_subheadline.setText(app_CustomeAdNativesubHander);
            ad_subheadline2.setText(app_CustomeAdNativesubHander2);
            ad_call_to_action.setText(app_CustomeAdNativeInstallText);
            iv_qurekanative.setOnClickListener(new View.OnClickListener() { // from class: com.luciada.modids.66
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    openChromeCustomTabUrl(activity2, app_CustomeADNativeLink);
                }
            });
        }
    }

    public void onlyCustInterstitialCallAD(final Activity activity2) {
        if (app_OnlyInterstitalADShow.equalsIgnoreCase("true")) {
            int i = Custcadscnt_click + 1;
            Custcadscnt_click = i;
            int i2 = app_CustClickCntSAd;
            if (i2 != 0 && i % i2 != 0) {
                return;
            } else {
                if (app_CustomeADText.equalsIgnoreCase("Qureka")) {
                    displayQurekaInterstitialAd(activity2, app_CustomeAdQurekaLink);
                } else if (app_CustomeADText.equalsIgnoreCase("Custome")) {
                    Rect displayRectangle = new Rect();
                    Window window = activity2.getWindow();
                    window.getDecorView().getWindowVisibleDisplayFrame(displayRectangle);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                    ViewGroup viewGroup = (ViewGroup) activity2.findViewById(android.R.id.content);
                    View dialogView = LayoutInflater.from(activity2).inflate(R.layout.cust_ad_interstitial, viewGroup, false);
                    dialogView.setMinimumWidth((int) (displayRectangle.width() * 1.0f));
                    dialogView.setMinimumHeight((int) (displayRectangle.height() * 1.0f));
                    builder.setView(dialogView);
                    final AlertDialog alertDialog = builder.create();
                    LinearLayout intest_layout = (LinearLayout) dialogView.findViewById(R.id.intest_layout);
                    intest_layout.setVisibility(View.VISIBLE);
                    ImageView iv_intersFullImage = (ImageView) dialogView.findViewById(R.id.iv_intersFullImage);
                    ImageView iv_intersFullImageCancel = (ImageView) dialogView.findViewById(R.id.iv_intersFullImageCancel);
                    Glide.with(activity2).load(app_CustomeAdInterFullscreenImg).into(iv_intersFullImage);
                    iv_intersFullImage.setOnClickListener(new View.OnClickListener() { // from class: com.luciada.modids.67
                        @Override // android.view.View.OnClickListener
                        public void onClick(View v) {
                            alertDialog.dismiss();
                            try {
                                activity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(app_CustomeAdInterstitialLink)));
                            } catch (ActivityNotFoundException e) {
                                activity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(app_CustomeAdInterstitialLink)));
                            }
                        }
                    });
                    iv_intersFullImageCancel.setOnClickListener(new View.OnClickListener() { // from class: com.luciada.modids.68
                        @Override // android.view.View.OnClickListener
                        public void onClick(View v) {
                            alertDialog.dismiss();
                        }
                    });
                    alertDialog.show();
                }
            }


        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [com.luciada.modids.BappClaass$69] */
    public void displayQurekaInterstitialAd(final Context context, final String s) {
        final Dialog dialog = new Dialog(context);
        View view = LayoutInflater.from(context).inflate(R.layout.ad_loading_progress_dialog, (ViewGroup) null);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(view);
        dialog.setCancelable(false);
        dialog.getWindow();
        if (Dialog_Show == 1) {
            dialog.show();
            new CountDownTimer(ad_dialog_time_in_second * 1000, 10) { // from class: com.luciada.modids.69
                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                    double d = (millisUntilFinished / 10) / ad_dialog_time_in_second;
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    dialog.dismiss();
                    openChromeCustomTabUrl(context, s);
                }
            }.start();
            // return;
        }else{
            openChromeCustomTabUrl(context, s);
        }
    }

    public void openChromeCustomTabUrl(Context activity2, String s) {
        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            int coolorInt = Color.parseColor("#66bb6a");
            builder.setToolbarColor(coolorInt);
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.intent.setPackage("com.android.chrome");
            customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            customTabsIntent.launchUrl(activity2, Uri.parse(s));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void loadApplovinInterstital1(final Activity activity2, String interid) {
        Log.e(TAG, "loadApplovinInterstital1: ");
        maxapplovin_i_pre = interid;
        maxInterstitialAd = new MaxInterstitialAd(this.maxapplovin_i_pre, activity2);
        MaxAdListener maxAdListener = new MaxAdListener() { // from class: com.luciada.modids.70
            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd ad) {
                Log.e(TAG, "onAdLoadedmax1: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayed(MaxAd ad) {
                Log.e(TAG, "onAdDisplayedmax1: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdHidden(MaxAd ad) {
                Log.e(TAG, "onAdHiddenmax1: ");
                if (!maxapplovin_i_pre.isEmpty()) {
                    loadApplovinInterstital1(activity2, maxapplovin_i_pre);
                }
                interstitialCallBack();
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdClicked(MaxAd ad) {
                Log.e(TAG, "onAdClickedmax1: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                Log.e(TAG, "onAdLoadFailedmax1: ");
                loadApplovinInterstital2(activity2, app_ApplovinInterstitialId2);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                Log.e(TAG, "onAdDisplayFailedmax1: ");
                loadApplovinInterstital2(activity2, app_ApplovinInterstitialId2);
            }
        };
        this.maxInterstitialAd.setListener(maxAdListener);
        this.maxInterstitialAd.loadAd();
    }

    public void loadApplovinInterstital2(final Activity activity2, String interid) {
        Log.e(TAG, "loadApplovinInterstital2: ");
        maxapplovin_i_pre = interid;
        maxInterstitialAd = new MaxInterstitialAd(this.maxapplovin_i_pre, activity2);
        MaxAdListener maxAdListener = new MaxAdListener() { // from class: com.luciada.modids.71
            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd ad) {
                Log.e(TAG, "onAdLoadedmax2: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayed(MaxAd ad) {
                Log.e(TAG, "onAdDisplayedmax2: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdHidden(MaxAd ad) {
                Log.e(TAG, "onAdHiddenmax2: ");
                if (!maxapplovin_i_pre.isEmpty()) {

                    loadApplovinInterstital2(activity2, maxapplovin_i_pre);
                }
                interstitialCallBack();
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdClicked(MaxAd ad) {
                Log.e(TAG, "onAdClickedmax2: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                Log.e(TAG, "onAdLoadFailedmax2: ");
                loadApplovinInterstital3(activity2, app_ApplovinInterstitialId3);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                Log.e(TAG, "onAdDisplayFailedmax2: ");
                loadApplovinInterstital3(activity2, app_ApplovinInterstitialId3);
            }
        };
        this.maxInterstitialAd.setListener(maxAdListener);
        this.maxInterstitialAd.loadAd();
    }

    public void loadApplovinInterstital3(final Activity activity2, String interid) {
        Log.e(TAG, "loadApplovinInterstital3: ");
        maxapplovin_i_pre = interid;
        maxInterstitialAd = new MaxInterstitialAd(this.maxapplovin_i_pre, activity2);
        MaxAdListener maxAdListener = new MaxAdListener() { // from class: com.luciada.modids.72
            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd ad) {
                Log.e(TAG, "onAdLoadedmax3: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayed(MaxAd ad) {
                Log.e(TAG, "onAdDisplayedmax3: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdHidden(MaxAd ad) {
                Log.e(TAG, "onAdHiddenmax3: ");
                if (!maxapplovin_i_pre.isEmpty()) {
                    loadApplovinInterstital3(activity2, maxapplovin_i_pre);
                }
                interstitialCallBack();
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdClicked(MaxAd ad) {
                Log.e(TAG, "onAdClickedmax3: ");
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                Log.e(TAG, "onAdLoadFailedmax3: ");
                if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadAdmobInterstitial(activity2, AD_MOB_APP_ID_Inter1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && FACEBOOK_AD_STATUS.equalsIgnoreCase("false") && UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else {
                    nextInterstitialPlatform();
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                Log.e(TAG, "onAdDisplayFailedmax3: ");
                if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("google")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("facebook")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadAdmobInterstitial(activity2, AD_MOB_APP_ID_Inter1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && FACEBOOK_AD_STATUS.equalsIgnoreCase("false") && UNITY_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("applovin")) {
                    loadUnityInterstital1(activity2, app_UnityInterstitialId1);
                } else {
                    nextInterstitialPlatform();
                }
            }
        };
        this.maxInterstitialAd.setListener(maxAdListener);
        this.maxInterstitialAd.loadAd();
    }

    public void applovinBannerDisplay(RelativeLayout banner_container) {
        Log.e(TAG, "applovinBannerDisplay: ");
        adViewBanner = new MaxAdView(app_ApplovinBanner1, activity);
        int heightPx = app_ApplovinBannerSize;
        adViewBanner.setLayoutParams(new FrameLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, heightPx));
        this.adViewBanner.setBackgroundColor(ContextCompat.getColor(activity, R.color.white));
        banner_container.addView(this.adViewBanner);
        this.adViewBanner.loadAd();
        this.adViewBanner.startAutoRefresh();
    }

    public void applovinNativeDisplay(final ViewGroup banner_container) {
        Log.e(TAG, "applovinNativeDisplay: ");
        nativeAdLoader = new MaxNativeAdLoader(app_ApplovinNative1, activity);

        nativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.luciada.modids.73
            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoaded(MaxNativeAdView nativeAdView, MaxAd ad) {
                if (nativeAd != null) {
                    nativeAdLoader.destroy(nativeAd);
                }
                nativeAd = ad;
                banner_container.removeAllViews();
                banner_container.addView(nativeAdView);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoadFailed(String adUnitId, MaxError error) {
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdClicked(MaxAd ad) {
            }
        });
        this.nativeAdLoader.loadAd();
    }

    public void loadUnityInterstital1(final Activity activity2, String appunityInterstitialId) {
        Log.e(TAG, "loadUnityInterstital1: ");
        this.unity_i_pre = appunityInterstitialId;
        UnityAds.load(appunityInterstitialId, new IUnityAdsLoadListener() { // from class: com.luciada.modids.74
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String placementId) {
                Log.e(TAG, "onUnityAdsAdLoaded4: ");
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
                Log.e(TAG, "onUnityAdsFailedToLoad4: ");
                loadUnityInterstital2(activity2, app_UnityInterstitialId2);
            }
        });
        this.showListener = new IUnityAdsShowListener() { // from class: com.luciada.modids.75
            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
                Log.e("UnityAdsExample", "Unity Ads failed to show ad for  with error: [" + error + "] " + message);
                loadUnityInterstital2(activity2, app_UnityInterstitialId2);
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowStart(String placementId) {
                Log.e("UnityAdsExample", "onUnityAdsShowStart: ");
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowClick(String placementId) {
                Log.e("UnityAdsExample", "onUnityAdsShowClick: ");
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
                Log.e("UnityAdsExample", "onUnityAdsShowComplete: ");
                if (!unity_i_pre.isEmpty()) {
                    UnityAds.load(unity_i_pre, new IUnityAdsLoadListener() { // from class: com.luciada.modids.75.1
                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public void onUnityAdsAdLoaded(String placementId2) {
                            Log.e(TAG, "onUnityAdsAdLoaded5: ");
                        }

                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                            Log.e(TAG, "onUnityAdsFailedToLoad5: ");
                            loadUnityInterstital2(activity2, app_UnityInterstitialId2);
                        }
                    });
                }
                interstitialCallBack();
            }
        };
    }

    public void loadUnityInterstital2(final Activity activity2, String appunityInterstitialId) {
        Log.e(TAG, "loadUnityInterstital2: ");
        this.unity_i_pre = appunityInterstitialId;
        UnityAds.load(appunityInterstitialId, new IUnityAdsLoadListener() { // from class: com.luciada.modids.76
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String placementId) {
                Log.e(TAG, "onUnityAdsAdLoaded6: ");
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
                Log.e(TAG, "onUnityAdsFailedToLoad6: ");
                loadUnityInterstital3(activity2, app_UnityInterstitialId3);
            }
        });
        this.showListener = new IUnityAdsShowListener() { // from class: com.luciada.modids.77
            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
                Log.e("UnityAdsExample", "Unity Ads failed to show ad for  with error: [" + error + "] " + message);
                loadUnityInterstital3(activity2, app_UnityInterstitialId3);
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowStart(String placementId) {
                Log.e("UnityAdsExample", "onUnityAdsShowStart: ");
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowClick(String placementId) {
                Log.e("UnityAdsExample", "onUnityAdsShowClick: ");
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
                Log.e("UnityAdsExample", "onUnityAdsShowComplete: ");
                if (!unity_i_pre.isEmpty()) {
                    UnityAds.load(unity_i_pre, new IUnityAdsLoadListener() { // from class: com.luciada.modids.77.1
                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public void onUnityAdsAdLoaded(String placementId2) {
                            Log.e(TAG, "onUnityAdsAdLoaded7: ");
                        }

                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                            Log.e(TAG, "onUnityAdsFailedToLoad7: ");
                            loadUnityInterstital3(activity2, app_UnityInterstitialId3);
                        }
                    });
                }
                interstitialCallBack();
            }
        };
    }

    public void loadUnityInterstital3(final Activity activity2, String appunityInterstitialId) {
        Log.e(TAG, "loadUnityInterstital3: ");
        this.unity_i_pre = appunityInterstitialId;
        UnityAds.load(appunityInterstitialId, new IUnityAdsLoadListener() { // from class: com.luciada.modids.78
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String placementId) {
                Log.e(TAG, "onUnityAdsAdLoaded8: ");
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
                Log.e(TAG, "onUnityAdsFailedToLoad8: ");
                showListener = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadAdmobInterstitial(activity2, AD_MOB_APP_ID_Inter1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else {
                    nextInterstitialPlatform();
                }
            }
        });
        this.showListener = new IUnityAdsShowListener() { // from class: com.luciada.modids.79
            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
                Log.e("UnityAdsExample", "Unity Ads failed to show ad for  with error: [" + error + "] " + message);
                showListener = null;
                if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadAdmobInterstitial(activity2, AD_MOB_APP_ID_Inter1);
                } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                    loadFacebookInterstitial(activity2, FB_Inter_ID1);
                } else {
                    nextInterstitialPlatform();
                }
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowStart(String placementId) {
                Log.e("UnityAdsExample", "onUnityAdsShowStart: ");
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowClick(String placementId) {
                Log.e("UnityAdsExample", "onUnityAdsShowClick: ");
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
                Log.e("UnityAdsExample", "onUnityAdsShowComplete: ");
                if (!unity_i_pre.isEmpty()) {
                    UnityAds.load(unity_i_pre, new IUnityAdsLoadListener() { // from class: com.luciada.modids.79.1
                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public void onUnityAdsAdLoaded(String placementId2) {
                            Log.e(TAG, "onUnityAdsAdLoaded9: ");
                        }

                        @Override // com.unity3d.ads.IUnityAdsLoadListener
                        public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                            Log.e(TAG, "onUnityAdsFailedToLoad9: ");
                            showListener = null;
                            if (AD_MOB_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                                loadAdmobInterstitial(activity2, AD_MOB_APP_ID_Inter1);
                            } else if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                                loadFacebookInterstitial(activity2, FB_Inter_ID1);
                            } else if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                                loadApplovinInterstital1(activity2, app_ApplovinInterstitialId1);
                            } else if (AD_MOB_STATUS.equalsIgnoreCase("false") && FACEBOOK_AD_STATUS.equalsIgnoreCase("true") && app_AdsPriority.equalsIgnoreCase("unity")) {
                                loadFacebookInterstitial(activity2, FB_Inter_ID1);
                            } else {
                                nextInterstitialPlatform();
                            }
                        }
                    });
                }
                interstitialCallBack();
            }
        };
    }

    public void unityBannerDisplay(RelativeLayout banner_container) {
        Log.e(TAG, "unityBannerDisplay: ");
        BannerView view = new BannerView(activity, app_UnityBannerId, new UnityBannerSize(LinearLayout.LayoutParams.MATCH_PARENT, app_UnityBannerHeight));
        view.load();
        banner_container.removeView(view);
        banner_container.addView(view);
    }

    public void distoryAllAd() {
        Log.e(TAG, "distoryAllAd: ");

        if (AD_MOB_STATUS.equalsIgnoreCase("true")) {
            if (mInterstitialAd != null) {
                mInterstitialAd = null;
            }

            if (admobNativeAd_preLoad != null) {
                admobNativeAd_preLoad.destroy();
            }

            if (admobBannerNativeAd != null) {
                admobBannerNativeAd.destroy();
            }

            if (mAdView != null) {
                mAdView.destroy();
            }
        }

        if (FACEBOOK_AD_STATUS.equalsIgnoreCase("true")) {

            if (fbinterstitialAd1 != null) {
                fbinterstitialAd1.destroy();
            }

            if (fbNativeAd_preLoad != null) {
                fbNativeAd_preLoad.destroy();
            }

            if (nativeAd1 != null) {
                nativeAd1.destroy();
            }

            if (this.fbadView != null) {
                this.fbadView.destroy();
            }
        }

        if (APPLOVIN_ADS_STATUS.equalsIgnoreCase("true")) {
            if (maxInterstitialAd != null) {
                maxInterstitialAd.destroy();
            }

            if (nativeAd != null) {
                nativeAdLoader.destroy(nativeAd);
            }

            if (adViewBanner != null) {
                adViewBanner.stopAutoRefresh();
                this.adViewBanner.destroy();
            }
        }

        if (UNITY_ADS_STATUS.equalsIgnoreCase("true")) {
            if (this.showListener != null) {
                this.showListener = null;
            }
        }

        if (AD_MOB_OpenAd_STATUS.equalsIgnoreCase("true")) {
            MianCallerOera.appOpenManager.DestroyAllAds();
        }


    }
}