package nurik.projectsdutechnopark;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {

    private MainFragment mainFragment;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationViewEx menu = (BottomNavigationViewEx) findViewById(R.id.menu);

        mainFragment = new MainFragment();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, mainFragment);
        fragmentTransaction.commit();

        menu.enableShiftingMode(false);
        menu.enableItemShiftingMode(false);
        menu.setTextVisibility(false);
        menu.setIconSize(25, 25);
        menu.setCurrentItem(1);

    }

}
