package com.example.android.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.android.hellotoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b ;
    int qty = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        eventHandler();
    }

    private void eventHandler() {
        b.button2.setOnClickListener(v -> countUp());

        b.button.setOnClickListener(v -> showToast());
    }

    //To show the toast
    private void showToast() {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    //To count increase
    private void countUp() {
        b.textView.setText("" + qty++);
    }
}