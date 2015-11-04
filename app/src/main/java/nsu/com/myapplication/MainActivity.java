package nsu.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView s;
       // s = (TextView) findViewById(R.id.text_summer);

        //TextView w;
        //w = (TextView) findViewById(R.id.text_summer);

    }

    public void onSummerClicked(View view){
        ImageView summerView = (ImageView) findViewById(R.id.image_season);
        summerView.setImageResource(R.drawable.summer);
    }


    public void onWinterClicked(View view){
        ImageView winterView = (ImageView) findViewById(R.id.image_season);
        winterView.setImageResource(R.drawable.winter);
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
