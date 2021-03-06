package in.forwardcode.bluetoothmessenger;


import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.forwardcode.bluetoothmessenger.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashScreen.this, ChatActivity.class);
                startActivity(i);
                finish();

            }
        }, 3000);
    }
}
