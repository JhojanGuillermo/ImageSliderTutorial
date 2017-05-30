package slider.app.tecsup.com.imageslidertutorial;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
    customSwip customSwip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        customSwip = new customSwip(this);
        viewPager.setAdapter(customSwip);
    }
}
