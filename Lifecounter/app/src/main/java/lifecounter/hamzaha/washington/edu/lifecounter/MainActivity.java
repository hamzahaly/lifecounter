package lifecounter.hamzaha.washington.edu.lifecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListener myListener = new MyListener();
    }

    private class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Button button = (Button) view.get();

        }
    }

    //add one to life counter
    public void plusOne(View view) {

    }

    //add five to life counter
    public void plusFive() {

    }

    //minus one life counter
    public void minusOne() {

    }

    //minus five to life counter
    public void minusFive() {

    }

}
