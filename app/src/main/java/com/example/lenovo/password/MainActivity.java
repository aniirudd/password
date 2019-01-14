package com.example.lenovo.password;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

    public class MainActivity extends AppCompatActivity {
        Button generate;
        TextView passwordPriview;






        int length = 13;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            generate = (Button) findViewById(R.id.passGen);
            passwordPriview = (TextView) findViewById(R.id.passPreview);

            generate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    passwordPriview.setVisibility(View.VISIBLE);
                    passwordPriview.setText("Generated Password : "+generateString(length));

                }
            });
        }

        private String  generateString(int length){
            char[] chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()".toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            Random random = new Random();
            for (int i=0; i<length;i++)
            {
                char c=chars[random.nextInt(chars.length)];
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
    }

}
