package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {


Boolean add=false,sub=false,division=false,product=false;// koi bhi operator ko dbaane k baad hmara value save hoga kisi variable mai or usse wipeout krna hai
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button dot;
    Button multi;
    Button plus;
    Button minus;
    Button div;
    Button equals;
    Button clear;
    Button zero;
    TextView text;
    double first,second;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         // finding id's of buttons and text view

        zero=findViewById(R.id.zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        dot=findViewById(R.id.dot);
        equals=findViewById(R.id.equals);
        clear=findViewById(R.id.clear);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multi=findViewById(R.id.multi);
        div=findViewById(R.id.div);
        text=findViewById(R.id.text);



        //setup ONClick Listener

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("2");
            }
        });



        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("3");
            }
        });




        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("4");
            }
        });



        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("5");
            }
        });



        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("8");
            }
        });



        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("9");
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append("0");
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.append(".");
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first =Double.valueOf(""+text.getText());
                add=true;
                text.setText("");
                // wipe out kr diya text ko ab second no. ko dalega phir equals to pr jayega
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first =Double.valueOf(""+text.getText());
                sub=true;
                text.setText("");
               // wipe out kr diya text ko ab second no. ko dalega phir equals to pr jayega
            }
        });


        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first =Double.valueOf(""+text.getText());
                product=true;
                text.setText("");
                // wipe out kr diya text ko ab second no. ko dalega phir equals to pr jayega
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first =Double.valueOf(""+text.getText());
                division=true;
                text.setText("");
                // wipe out kr diya text ko ab second no. ko dalega phir equals to pr jayega
            }
        });
     equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                second = Double.valueOf("" +text.getText());
                if (add == true) {
                    text.setText("" + (first+second));

                }
                else if (sub == true) {
                    text.setText("" + (first-second));

                }
                else if (product == true) {
                    text.setText("" + (first*second));

                }
                else if (division == true) {
                    text.setText("" + (first/second));
                }

            }
                catch(Exception e)
                {
                    text.setText("0");
                }

                // reset the flags
                add=false;
                sub=false;
                product=false;
                division=false;



            }
        });


      clear.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String textw = "" + text.getText();// text recive krna hai phle text view se

              try {
                  text.setText(textw.substring(0, textw.length() - 1));//ab last vale no. ko chor kr baaki ki string set ho jayegi textview mai
              } catch (Exception e) {
                  Toast.makeText(MainActivity.this, "we have nothing written", Toast.LENGTH_SHORT).show();
              }


          }

      } );

      clear.setOnLongClickListener(new View.OnLongClickListener() {
          @Override
          public boolean onLongClick(View view) {
              text.setText("");
              return false;
          }
      });



     }
    }