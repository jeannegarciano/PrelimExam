package tech.sidespell.prelimexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {



    private ToggleButton tog;
    private SeekBar sb1;
    private TextView value, svalue;
    private RadioGroup rg;
    private RadioButton rb1, rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void seekbar()
    {
        value = (TextView) findViewById(R.id.val);
        svalue = (TextView) findViewById(R.id.seekvalue);
        tog = (ToggleButton) findViewById(R.id.toggleButton1);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        final int progress_value;


        svalue.setText("" +sb1.progress());

        new  sb1.setOnSeekBarChangeListener() {
            int progress_value;
            @Override
            public void onProgressChanged(SeekBar sb1, int progress, boolean fromUser) {
                progress_value = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar sb1) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar sb1) {

            }


        };
    }













    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
