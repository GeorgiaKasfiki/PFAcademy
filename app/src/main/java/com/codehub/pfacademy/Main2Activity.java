package com.codehub.pfacademy;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle saveInstanceState) {
            super.onCreate(saveInstanceState);
            setContentView(R.layout.content_main);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle saveInstanceState) {
        super.onPostCreate(savedInstrancesState);

        TextView textView = findViewById(R.id.mainTxt);
        textView.setText("Jojo");
        textView.setBackgroundColor(R.color.colorPrimary);

        EditText edit = findViewById(R.id.editTxt);

        Button btn = findViewById(R.id.mainBtn);

//        btn.setOnTouchListener(new View.OnTouchListener(){
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return false;
//            }
//        });

        btn.isFocused();
        btn.setFocusable();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });

        private 
    }

}
