package com.example.cityguide.Helper.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cityguide.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedViewHolder> {

    ArrayList<FeaturedHelperClass> featuredLocation;

    public FeaturedAdapter(ArrayList<FeaturedHelperClass> featuredHelperClasses) {
        this.featuredLocation = featuredHelperClasses;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_design,parent,false);
        FeaturedViewHolder featuredViewHolder=new FeaturedViewHolder(view);

        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {

        FeaturedHelperClass featuredHelperClass= featuredLocation.get(position);
        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTitle());
        holder.desc.setText(featuredHelperClass.getDescription());


    }

    @Override
    public int getItemCount() {
        return featuredLocation.size();
    }


    public static class  FeaturedViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title,desc;

        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);


            image=itemView.findViewById(R.id.featured_image);
            title=itemView.findViewById(R.id.featured_title);
            desc=itemView.findViewById(R.id.featured_desc);
        }
    }

    public static class FeaturedMostViewAdapter extends RecyclerView.Adapter<FeaturedMostViewAdapter.FeaturedMostViewViewHolder>{

        ArrayList<FeaturedHelperClass> featureMostView2;

        public FeaturedMostViewAdapter(ArrayList<FeaturedHelperClass> featureMostView2) {
            this.featureMostView2 = featureMostView2;
        }

        @NonNull
        @Override
        public FeaturedMostViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_design,parent,false);
            FeaturedMostViewViewHolder featuredMostViewViewHolder =new FeaturedMostViewViewHolder(view);
            return featuredMostViewViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull FeaturedMostViewViewHolder holder, int position) {
            FeaturedHelperClass featuredHelperClass= featureMostView2.get(position);
            holder.image.setImageResource(featuredHelperClass.getImage());
            holder.title.setText(featuredHelperClass.getTitle());
            holder.desc.setText(featuredHelperClass.getDescription());

        }

        @Override
        public int getItemCount() {
            return featureMostView2.size();
        }

        public static class FeaturedMostViewViewHolder extends RecyclerView.ViewHolder{

            ImageView image;
            TextView title,desc;

            public FeaturedMostViewViewHolder(@NonNull View itemView) {
                super(itemView);
                image=itemView.findViewById(R.id.mv_image);
                title=itemView.findViewById(R.id.mv_title);
                desc=itemView.findViewById(R.id.mv_desc);
            }
        }
    }
    public static class FeaturedCategoriesAdapter extends RecyclerView.Adapter<FeaturedCategoriesAdapter.FeaturedCategoriesViewHolder>{

        ArrayList<FeaturedHelperClass> featureMostView3;

        public FeaturedCategoriesAdapter(ArrayList<FeaturedHelperClass> featureMostView3) {
            this.featureMostView3 = featureMostView3;
        }

        @NonNull
        @Override
        public FeaturedCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_card_design,parent,false);
            FeaturedCategoriesViewHolder featuredCategoriesViewHolder =new FeaturedCategoriesViewHolder(view);
            return featuredCategoriesViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull FeaturedCategoriesViewHolder holder, int position) {
            FeaturedHelperClass featuredHelperClass= featureMostView3.get(position);
            holder.image.setImageResource(featuredHelperClass.getImage());
            holder.title.setText(featuredHelperClass.getTitle());
            holder.desc.setText(featuredHelperClass.getDescription());

        }

        @Override
        public int getItemCount() {
            return featureMostView3.size();
        }

        public static class FeaturedCategoriesViewHolder extends RecyclerView.ViewHolder{

            ImageView image;
            TextView title,desc;

            public FeaturedCategoriesViewHolder(@NonNull View itemView) {
                super(itemView);
                image=itemView.findViewById(R.id.cc_image);
                title=itemView.findViewById(R.id.cc_title);
                desc=itemView.findViewById(R.id.cc_desc);
            }
        }
    }

}
