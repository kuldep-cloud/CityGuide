package com.example.cityguide.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.cityguide.Helper.HomeAdapter.FeaturedAdapter;
import com.example.cityguide.Helper.HomeAdapter.FeaturedHelperClass;
import com.example.cityguide.R;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView featuredRecycler,featuredRecycler2,featuredRecycler3;
    RecyclerView.Adapter adapter,adapter1,adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        featuredRecycler=findViewById(R.id.featured_recyclerview);
        featuredRecycler2=findViewById(R.id.featured_mostviewed);
        featuredRecycler3=findViewById(R.id.featuerd_categories);
        featuredmostview();
        featurecategories();
        featuredRecycler();
    }

    private void featuredmostview() {
        featuredRecycler2.setHasFixedSize(true);
        featuredRecycler2.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featureMostView =new ArrayList<>();
        featureMostView.add(new FeaturedHelperClass(R.drawable.mcd,"Mcdonald's","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featureMostView.add(new FeaturedHelperClass(R.drawable.unionbank,"Union Bank","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featureMostView.add(new FeaturedHelperClass(R.drawable.burgerking,"Burger King","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featureMostView.add(new FeaturedHelperClass(R.drawable.khaitan,"Khaitan Public","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));

        adapter1 =new FeaturedAdapter.FeaturedMostViewAdapter(featureMostView);
        featuredRecycler2.setAdapter(adapter1);

    }
    private void featurecategories() {
        featuredRecycler3.setHasFixedSize(true);
        featuredRecycler3.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featureMostView =new ArrayList<>();
        featureMostView.add(new FeaturedHelperClass(R.drawable.mcd,"Resturent's","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featureMostView.add(new FeaturedHelperClass(R.drawable.unionbank,"Banks's","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featureMostView.add(new FeaturedHelperClass(R.drawable.burgerking,"Burger's\nPoint","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featureMostView.add(new FeaturedHelperClass(R.drawable.khaitan,"Schools","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));

        adapter2 =new FeaturedAdapter.FeaturedCategoriesAdapter(featureMostView);
        featuredRecycler3.setAdapter(adapter2);
    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocation =new ArrayList<>();
        featuredLocation.add(new FeaturedHelperClass(R.drawable.mcd,"Mcdonald's","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featuredLocation.add(new FeaturedHelperClass(R.drawable.unionbank,"Union Bank Of India","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featuredLocation.add(new FeaturedHelperClass(R.drawable.burgerking,"Burger King","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));
        featuredLocation.add(new FeaturedHelperClass(R.drawable.khaitan,"Khaitan Public School","asdfsdfsf asddfasdf asddfasdf asdfsdf asdfdfsf asddfsdf"));

        adapter =new FeaturedAdapter(featuredLocation);
        featuredRecycler.setAdapter(adapter);


       // GradientDrawable gradientDrawable=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{0xffeff400,0xffaff600});
    }
}