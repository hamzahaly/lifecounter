package lifecounter.hamzaha.washington.edu.lifecounter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private static final String TAG = "TAG";
    private static final int LIFE = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    private class MyListener implements View.OnClickListener {
//
//        @Override
//        public void onClick(View view) {
//            Button button = (Button) view.getId();
//
//        }
//    }

    //add one to life counter
    public void modifyLife(View view) {
        int counter = LIFE;
        int counter2 = LIFE;
        int counter3 = LIFE;
        int counter4 = LIFE;

        Button button = (Button) view;
        String op = (String) button.getText();
        Log.v(TAG, op);

        String tag = (String) view.getTag();

        switch (op) {
            case "+" :
                //Add one to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    text.setText(counter++);
                } else if (tag.equals("player_2")) {

                } else if (tag.equals("player_3")) {

                } else {

                }
                break;
            case "+5" :
                //Add five to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    counter = counter + 5;
                    text.setText(counter);
                } else if (tag.equals("player_2")) {

                } else if (tag.equals("player_3")) {

                } else {

                }
                break;
            case "-" :
                //Minus one to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    text.setText(counter--);
                } else if (tag.equals("player_2")) {

                } else if (tag.equals("player_3")) {

                } else {

                }
                break;
            case "-5" :
                //Minus five to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    counter = counter - 5;
                    text.setText(counter);
                } else if (tag.equals("player_2")) {

                } else if (tag.equals("player_3")) {

                } else {

                }
                break;
            default :
                Log.v(TAG, "DEFAULT SHOULD NEVER HAPPEN");
        }


//        if (((Button) view).getText().equals("+")) {
//            String tag = (String) view.getTag();
//            if (tag.equals("player_1")) {
//
//            }
//        }
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
