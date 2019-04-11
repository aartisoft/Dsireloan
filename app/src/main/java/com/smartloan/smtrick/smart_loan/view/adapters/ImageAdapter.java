package com.smartloan.smtrick.smart_loan.view.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.smartloan.smtrick.smart_loan.R;
import com.smartloan.smtrick.smart_loan.models.Upload;
import com.smartloan.smtrick.smart_loan.view.activites.Advertise_Activity;

import java.util.List;


public class ImageAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.one,R.drawable.two,R.drawable.four};
    private List<Upload> image1;

    public ImageAdapter(Context context, List<Upload> image) {
        this.context = context;
        this.image1 = image;
    }

    @Override
    public int getCount() {
        return image1.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
       // imageView.setImageResource(images[position]);

        Glide.with(context).load(image1.get(position).getUrl())
                .apply(new RequestOptions().placeholder(R.drawable.loading))
                .into(imageView);

        view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //this will log the page number that was click
                Log.i("TAG", "This page was clicked: " + position);
                Toast.makeText(context, "This page was clicked:" +image1.get(position).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Advertise_Activity.class);
                intent.putExtra("imagename",image1.get(position).getName());
                context.startActivity(intent);
            }
        });


        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}