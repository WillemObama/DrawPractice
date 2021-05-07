package com.example.drawpractice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    List<PageModel> pageModels;

    {
        pageModels = new ArrayList<>();
        pageModels.add(new PageModel(R.layout.practice_color,R.string.title_draw_color));
        pageModels.add(new PageModel(R.layout.practice_circle,R.string.title_draw_circle));
        pageModels.add(new PageModel(R.layout.practice_rect,R.string.title_draw_rect));
        pageModels.add(new PageModel(R.layout.practice_point,R.string.title_draw_point));
        pageModels.add(new PageModel(R.layout.practice_oval,R.string.title_draw_oval));
        pageModels.add(new PageModel(R.layout.practice_line,R.string.title_draw_line));
        pageModels.add(new PageModel(R.layout.practice_round_rect,R.string.title_draw_round_rect));
        pageModels.add(new PageModel(R.layout.practice_arc,R.string.title_draw_arc));
        pageModels.add(new PageModel(R.layout.practice_path,R.string.title_draw_path));
        pageModels.add(new PageModel(R.layout.practice_histogram,R.string.title_draw_histogram));
        pageModels.add(new PageModel(R.layout.practice_pie_chart,R.string.title_draw_pie_chart));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);
                PageFragment fragment = PageFragment.newInstance(pageModel.practiceLayoutRes);
                return fragment;
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return getString(pageModels.get(position).titleRes);
            }
        });

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    class PageModel{
        int practiceLayoutRes;
        int titleRes;
        PageModel(int practiceLayoutRes, int titleRes){
            this.practiceLayoutRes = practiceLayoutRes;
            this.titleRes = titleRes;
        }
    }
}