package com.example.calculadorapedro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Float2;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn0,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnDot;
    Button btnClear;
    EditText ed1;
    float Res1,Res2;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01=(Button)findViewById(R.id.btn01);
        btn02=(Button)findViewById(R.id.btn02);
        btn03=(Button)findViewById(R.id.btn03);
        btn04=(Button)findViewById(R.id.btn04);
        btn05=(Button)findViewById(R.id.btn05);
        btn06=(Button)findViewById(R.id.btn06);
        btn07=(Button)findViewById(R.id.btn07);
        btn08=(Button)findViewById(R.id.btn08);
        btn09=(Button)findViewById(R.id.btn09);
        btn0=(Button)findViewById(R.id.btn0);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnDot=(Button)findViewById(R.id.bntDot);
        btnClear=(Button)findViewById(R.id.btnClear);
        ed1=(EditText) findViewById(R.id.editText);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                    }
                else{
                    Res1=Float.parseFloat( ed1.getText()+"");
                    Add=true;

                    ed1.setText(null);
                }
            }

        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat( ed1.getText()+"");
                    Sub=true;

                    ed1.setText(null);
                }
            }

        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat( ed1.getText()+"");
                    Mul=true;

                    ed1.setText(null);
                }
            }

        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat( ed1.getText()+"");
                    Div=true;

                    ed1.setText(null);
                }
            }

        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2= Float.parseFloat(ed1.getText()+"");

                if (Add==true){
                    ed1.setText(Res1+Res2+"");
                    Add=false;
                }
                if (Sub==true){
                    ed1.setText(Res1-Res2+"");
                    Sub=false;
                }
                if (Mul==true){
                    ed1.setText(Res1*Res2+"");
                    Mul=false;
                }
                if (Div==true){
                    ed1.setText(Res1/Res2+"");
                    Div=false;
                }

            }

        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });


    }
}
