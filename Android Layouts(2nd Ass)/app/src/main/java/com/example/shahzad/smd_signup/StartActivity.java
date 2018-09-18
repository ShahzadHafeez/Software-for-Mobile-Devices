package com.example.shahzad.smd_signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button relative;
    private Button constraint;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        initial();

    }

    private void initial() {

        relative=(Button)findViewById(R.id.relative_btn);
        constraint=(Button)findViewById(R.id.constraint_btn);

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==R.id.relative_btn)
                {
                    intent=new Intent(StartActivity.this,RelativeLayout.class);
                    startActivity(intent);

                }
            }
        });

        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==R.id.constraint_btn)
                {
                    intent = new Intent(StartActivity.this,ConstraintLayout.class);
                    startActivity(intent);
                }
            }
        });

    }
}
