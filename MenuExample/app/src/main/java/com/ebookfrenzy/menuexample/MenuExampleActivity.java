package com.ebookfrenzy.menuexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MenuExampleActivity extends ActionBarActivity {

    private int[] colors = {android.graphics.Color.RED, android.graphics.Color.GREEN,
            android.graphics.Color.YELLOW, android.graphics.Color.BLUE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_example);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.layoutView);

        if (item.isChecked())
            item.setChecked(false);
        else
            item.setChecked(true);

        mainLayout.setBackgroundColor(colors[item.getOrder()]);
        return true;
    }
}
