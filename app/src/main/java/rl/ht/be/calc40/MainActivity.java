package rl.ht.be.calc40;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListerners();
    }

    private void initListerners(){
        final TextView display = (TextView) findViewById(R.id.textView);

        Button.OnClickListener buttonListener=new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button7:
                        addToDisplay("7");
                        break;
                    case R.id.button8:
                        addToDisplay("8");
                        break;
                    case R.id.button9:
                        addToDisplay("9");
                        break;
                    case R.id.button6:
                        addToDisplay("6");
                        break;
                    case R.id.button5:
                        addToDisplay("5");
                        break;
                    case R.id.button4:
                        addToDisplay("4");
                        break;
                    case R.id.button3:
                        addToDisplay("3");
                        break;
                    case R.id.button2:
                        addToDisplay("2");
                        break;
                    case R.id.button1:
                        addToDisplay("1");
                        break;
                    case R.id.button0:
                        addToDisplay("0");
                        break;
                    case R.id.buttonPoint:
                        addToDisplay(".");
                        break;
                    case R.id.buttonPlus:
                        addToDisplay("+");
                        break;
                    case R.id.buttonMinus:
                        addToDisplay("-");
                        break;
                    case R.id.buttonMult:
                        addToDisplay("X");
                        break;
                    case R.id.buttonDiv:
                        addToDisplay("/");
                        break;
                    case R.id.buttonEnter:
                        addToDisplay("=");
                        break;
                }
            }
            private void addToDisplay(String text){
                display.setText(display.getText()+text);
            }
        };

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(buttonListener);

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(buttonListener);

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(buttonListener);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(buttonListener);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(buttonListener);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(buttonListener);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(buttonListener);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(buttonListener);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(buttonListener);

        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(buttonListener);

        Button buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonPoint.setOnClickListener(buttonListener);

        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(buttonListener);

        Button buttonMinus= (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(buttonListener);

        Button buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonMult.setOnClickListener(buttonListener);

        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(buttonListener);

        Button buttonEnter = (Button) findViewById(R.id.buttonEnter);
        buttonEnter.setOnClickListener(buttonListener);
    }
}
