package com.example.neuroapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView, textview3, textview4, textView5;
    private String one = "AJIYQ";
    private String two = "BKR";
    private String three = "CGLS";
    private String four = "DMT";
    private String five = "EHNX";
    private String six = "UVW";
    private String seven = "OZ";
    private String eight = "FP";
    String name;
    // String passname;
    int myValue = 0, newValue = 0, pyramidvalue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //castui\
        textView = findViewById( R.id.textview2 );
        textview3 = findViewById( R.id.textview3 );
        textview4 = findViewById( R.id.textview4 );
        textView5 = findViewById( R.id.pyrmaidtext );
        editText = findViewById( R.id.text_View );
        button = findViewById( R.id.button );
        textview4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText( "" );
                textview3.setText( "" );
                editText.setText( "" );


            }
        } );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myValue = 0;
                name = editText.getText().toString();
                Log.e( "MainActivity", "The Name is" + name );
                char[] character = name.toCharArray();
                for (int i = 0; i < character.length; i++) {
                    addName( character[i] );
                    // System.out.println(i);
                }
                Log.e( "myupdatedvalue", "" + myValue );
                Toast.makeText( MainActivity.this, "the number is" + myValue, Toast.LENGTH_SHORT ).show();
                textView.setText( "The number is " + myValue );

                //one singal digital become
                newValue = myValue;
                char[] valuessA = String.valueOf( myValue ).toCharArray();

                int myTempValue = 0;
                for (int j = 0; j < valuessA.length; j++) {
                    String va = String.valueOf( valuessA[j] );
                    int vaa = Integer.parseInt( va );
                    myTempValue = myTempValue + vaa;
                }
                textview3.setText( "the number is  " + myTempValue );
                Log.e( "myTempValue", "" + myTempValue );

            }
        } );

    }

    private void addName(char myLetter) {

        String letter = String.valueOf( myLetter ).toUpperCase();
        Log.e( "Addname_function", "" + letter );
        if (one.contains( letter )) {
            myValue = myValue + 1;
        } else if (two.contains( letter )) {
            myValue = myValue + 2;
        } else if (three.contains( letter )) {
            myValue = myValue + 3;
        } else if (four.contains( letter )) {
            myValue = myValue + 4;
        } else if (five.contains( letter )) {
            myValue = myValue + 5;
        } else if (six.contains( letter )) {
            myValue = myValue + 6;
        } else if (seven.contains( letter )) {
            myValue = myValue + 7;
        } else {
            myValue = myValue + 8;
        }
    }
}