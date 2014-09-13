package com.dpsil.loung.practicehelloworld;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MyActivity extends Activity {

    private Button greetButton;
    private TextView hellotext;
    private TextView worldText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);



        greetButton = (Button)findViewById(R.id.greet_button);
        hellotext = (TextView)findViewById(R.id.hello_text);
        worldText = (TextView)findViewById(R.id.world_text);

        /*
        greetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] color1 = createRandomColor();
                int[] color2 = createRandomColor();
                hellotext.setTextColor(Color.rgb(color1[0],color1[1],color1[2]));
                worldText.setTextColor(Color.rgb(color2[0],color2[1],color2[2]));
            }
        });*/
    }



    public int [] createRandomColor(){
        int [] color = new int[3];
        Random random = new Random();

        for(int i = 0; i<3; i++){
            color[i] = random.nextInt(255);
        }

        return color;
    }

    public void onClick_sayHello(View v){
        int[] color1 = createRandomColor();
        int[] color2 = createRandomColor();
        hellotext.setTextColor(Color.rgb(color1[0], color1[1], color1[2]));
        worldText.setTextColor(Color.rgb(color2[0],color2[1],color2[2]));
    }

    protected void onResume(){
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
