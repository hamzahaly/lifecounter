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

    private int counter = LIFE;
    private int counter2 = LIFE;
    private int counter3 = LIFE;
    private int counter4 = LIFE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Modifies the life counter
    public void modifyLife(View view) {

        Button button = (Button) view;
        String op = (String) button.getText();
        Log.v(TAG, op);

        String tag = (String) button.getTag();
        Log.v(TAG, tag);

        switch (op) {
            case "+" :
                //Add one to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    counter++;
                    text.setText("" + counter);
                } else if (tag.equals("player_2")) {
                    TextView text = (TextView) findViewById(R.id.player_2_life);
                    counter2++;
                    text.setText("" + counter2);
                } else if (tag.equals("player_3")) {
                    TextView text = (TextView) findViewById(R.id.player_3_life);
                    counter3++;
                    text.setText("" + counter3);
                } else {
                    TextView text = (TextView) findViewById(R.id.player_4_life);
                    counter4++;
                    text.setText("" + counter4);
                }
                break;
            case "+5" :
                //Add five to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    counter = counter + 5;
                    text.setText("" + counter);
                } else if (tag.equals("player_2")) {
                    TextView text = (TextView) findViewById(R.id.player_2_life);
                    counter2 = counter2 + 5;
                    text.setText("" + counter3);
                } else if (tag.equals("player_3")) {
                    TextView text = (TextView) findViewById(R.id.player_3_life);
                    counter3 = counter3 + 5;
                    text.setText("" + counter3);
                } else {
                    TextView text = (TextView) findViewById(R.id.player_4_life);
                    counter4 = counter4 + 5;
                    text.setText("" + counter4);
                }
                break;
            case "-" :
                //Minus one to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    counter--;
                    text.setText("" + counter);
                } else if (tag.equals("player_2")) {
                    TextView text = (TextView) findViewById(R.id.player_2_life);
                    counter2--;
                    text.setText("" + counter2);
                } else if (tag.equals("player_3")) {
                    TextView text = (TextView) findViewById(R.id.player_3_life);
                    counter3--;
                    text.setText("" + counter3);
                } else {
                    TextView text = (TextView) findViewById(R.id.player_4_life);
                    counter4--;
                    text.setText("" + counter4);
                }
                break;
            case "-5" :
                //Minus five to life
                if (tag.equals("player_1")) {
                    TextView text = (TextView) findViewById(R.id.player_1_life);
                    counter = counter - 5;
                    text.setText("" + counter);
                } else if (tag.equals("player_2")) {
                    TextView text = (TextView) findViewById(R.id.player_2_life);
                    counter2 = counter2 - 5;
                    text.setText("" + counter2);

                } else if (tag.equals("player_3")) {
                    TextView text = (TextView) findViewById(R.id.player_3_life);
                    counter3 = counter3 - 5;
                    text.setText("" + counter3);
                } else {
                    TextView text = (TextView) findViewById(R.id.player_4_life);
                    counter4 = counter4 - 5;
                    text.setText("" + counter4);
                }
                break;
            default :
                Log.v(TAG, "DEFAULT SHOULD NEVER HAPPEN");
        }

        if (counter <= 0) {
            TextView text = (TextView) findViewById(R.id.loss_text);
            text.setText("player 1 has lost!");
        } else if (counter2 <= 0) {
            TextView text = (TextView) findViewById(R.id.loss_text);
            text.setText("player 2 has lost!");
        } else if (counter3 <= 0) {
            TextView text = (TextView) findViewById(R.id.loss_text);
            text.setText("player 3 has lost!");
        } else if (counter4 <= 0) {
            TextView text = (TextView) findViewById(R.id.loss_text);
            text.setText("player 4 has lost!");
        }

    }

}
