package com.example.user.calci;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt1, bt2, bt3, bt4;
    private TextView tv1;
    private EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        bt1=(Button)findViewById(R.id.b1);
        bt2=(Button)findViewById(R.id.b2);
        bt3=(Button)findViewById(R.id.b3);
        bt4=(Button)findViewById(R.id.b4);
        tv1=(TextView)findViewById(R.id.tv);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        bt1.setOnClickListener((View.OnClickListener) this);
        bt2.setOnClickListener((View.OnClickListener) this);
        bt3.setOnClickListener((View.OnClickListener) this);
        bt4.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        float n1=Integer.parseInt(ed1.getText().toString());
        float n2=Integer.parseInt(ed2.getText().toString());
        switch(v.getId()){
            case R.id.b1: tv1.setText(String.valueOf(n1+n2));break;
            case R.id.b2:tv1.setText(String.valueOf(n1-n2));break;
            case R.id.b3: tv1.setText(String.valueOf(n1*n2));break;
            case R.id.b4: tv1.setText(String.valueOf(n1/n2));break;

        }

    }
}



