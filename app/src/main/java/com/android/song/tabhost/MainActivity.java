package com.android.song.tabhost;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        // 첫 번째 Tab
        TabHost.TabSpec ts1 = tabHost.newTabSpec("Tab1") ;
        // 보여줄 페이지 설정
        ts1.setContent(R.id.tab1) ;
        // 1. 탭 표시 텍스트 : "첫번째 탭"
        // ts1.setIndicator("첫번째 탭") ;
        // 2. 탭에 이미지 출력
        ts1.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.image1, null));
        // TabHost에 Tab 추가
        tabHost.addTab(ts1) ;

        // 두 번째 Tab
        TabHost.TabSpec ts2 = tabHost.newTabSpec("Tab2") ;
        // 보여줄 페이지 설정
        ts2.setContent(R.id.tab2) ;
        // 탭 표시 텍스트:"두번째 탭"
        // ts2.setIndicator("두번째 탭") ;
        // 2. 탭에 이미지 출력
        ts2.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.image2, null));
        // TabHost에 Tab 추가
        tabHost.addTab(ts2) ;

        // 세 번째 Tab
        TabHost.TabSpec ts3 = tabHost.newTabSpec("Tab3") ;
        // 보여줄 페이지 설정
        ts3.setContent(R.id.tab3) ;
        // 탭 표시 텍스트:"세번째 탭"
        // ts3.setIndicator("세번째 탭") ;
        // 2. 탭에 이미지 출력
        ts3.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.image3, null));
        // TabHost에 Tab 추가
        tabHost.addTab(ts3) ;

        // 네 번째 Tab
        TabHost.TabSpec ts4 = tabHost.newTabSpec("Tab4") ;
        // 보여줄 페이지 설정
        ts4.setContent(R.id.tab4) ;
        // 탭 표시 텍스트:"네번째 탭"
        // ts4.setIndicator("네번째 탭") ;
        // 2. 탭에 이미지 출력
        ts4.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.image4, null));
        // TabHost에 Tab 추가
        tabHost.addTab(ts4) ;



    }
}
