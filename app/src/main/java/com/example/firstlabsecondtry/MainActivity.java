package com.example.firstlabsecondtry;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

private TextView txtPagrindinis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtPagrindinis = (TextView)findViewById(R.id.txtPagrindinis);
        this.txtPagrindinis.setText("Dirba kaip pagrindinis Java");
    }

    public void onBtnPagrindinisClick(View view) {
        txtPagrindinis.setText("Sveiki visi");
    }

    public void onBtnColorClick(View view) {
        String text = txtPagrindinis.getText().toString();
        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsYellow = new ForegroundColorSpan(Color.YELLOW);
        ForegroundColorSpan fcsBlue = new ForegroundColorSpan(Color.BLUE);

        ss.setSpan(fcsYellow, 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcsBlue, 6, text.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        this.txtPagrindinis.setText(ss);
    }
}