package com.example.greg.disneyquotesapp;
import android.view.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import java.util.*;
import android.widget.*;
public class MainActivity extends AppCompatActivity {


    private String [] quoteArray = {"Venture outside your comfort zone. The rewards are worth it. --Rapunzel","All it takes is faith and trust. -- Peter Pan",
            "A little consideration, a little thought for others, makes all the difference. -- Eeyore" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void getQuote(View view)
    {

        Button button = (Button) findViewById(R.id.QuoteButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.quote_display);
                Random r = new Random();
                int num = r.nextInt(3);
                textView.setText(quoteArray[num]);
            }
        });

//        Intent intent = new Intent(this,DisplayQuote.class);
//        Random rand = new Random();
//        EditText editText = (EditText) findViewById(R.id.quote_display);
//        int num = rand.nextInt(quoteArray.length);
//        intent.putExtra("THE_QUOTE", quoteArray[num]);



    }


}
