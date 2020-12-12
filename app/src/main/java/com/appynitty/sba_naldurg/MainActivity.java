package com.appynitty.sba_naldurg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.appynitty.swachbharatabhiyanlibrary.activity.SplashScreenActivity;
import com.appynitty.swachbharatabhiyanlibrary.pojos.LanguagePojo;
import com.appynitty.swachbharatabhiyanlibrary.utils.AUtils;
import com.pixplicity.easyprefs.library.Prefs;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

Prefs.putInt(AUtils.VERSION_CODE,BuildConfig.VERSION_CODE);
        Prefs.putString(AUtils.APP_ID, "3039");
        initLanguageList();

        startActivity(new Intent(MainActivity.this, SplashScreenActivity.class));
    }

    private void initLanguageList() {

        ArrayList<LanguagePojo> languagePojos = new ArrayList<>();

        LanguagePojo eng = new LanguagePojo();
        eng.setLanguage(AUtils.LanguageNameConstants.ENGLISH);
        eng.setLanguageId(AUtils.LanguageIDConstants.ENGLISH);
        languagePojos.add(eng);

        LanguagePojo mar = new LanguagePojo();
        mar.setLanguageId(AUtils.LanguageIDConstants.MARATHI);
        mar.setLanguage(AUtils.LanguageNameConstants.MARATHI);
        languagePojos.add(mar);

        LanguagePojo hindi = new LanguagePojo();
        hindi.setLanguageId(AUtils.LanguageIDConstants.HINDI);
        hindi.setLanguage(AUtils.LanguageNameConstants.HINDI);
        languagePojos.add(hindi);

        AUtils.setLanguagePojoList(languagePojos);

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}