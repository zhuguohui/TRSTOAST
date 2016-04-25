package trs.com.trstoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import trs.com.trstoast.view.SlideToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int n=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_show).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        SlideToast.MakeText(this, "第" + n + "次show").show();
        n++;
    }
}
