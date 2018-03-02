package cn.netease.music.zxk.neteasemusic;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import cn.netease.music.zxk.neteasemusic.activity.SearchActivity;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    View mainView;
    ImageView search;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        mainView = findViewById(R.id.main_layouts);
        tabLayout = mainView.findViewById(R.id.main_tab);
        search = mainView.findViewById(R.id.navigation_search);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.actionbar_music_prs));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.actionbar_discover_prs));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.actionbar_friends_prs));
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
