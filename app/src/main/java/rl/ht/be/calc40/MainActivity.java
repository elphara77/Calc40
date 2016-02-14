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
    }
}
