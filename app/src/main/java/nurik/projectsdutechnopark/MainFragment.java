package nurik.projectsdutechnopark;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainFragment extends Fragment {

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        ImageView imageView = rootView.findViewById(R.id.image);

        Picasso.with(getContext())
                .load(R.drawable.diagram)
                .fit()
                .centerCrop()
                .into(imageView);

        TabLayout tabLayout = rootView.findViewById(R.id.tab);
        ViewPager viewPager = rootView.findViewById(R.id.view_pager);

        MainPagerAdapter adapter = new MainPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new ListFragment(), "по дням");
        adapter.addFragment(new ListFragment(), "по неделям");
        adapter.addFragment(new ListFragment(), "по месяцам");
        adapter.addFragment(new ListFragment(), "по годам");

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);

        return rootView;
    }

}
