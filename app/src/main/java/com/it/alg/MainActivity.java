package com.it.alg;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("最：", "====" + isPrime(29));

        tv = (TextView) findViewById(R.id.tv);

//        tv.setText("关于（无限）流量的相关声明：\\n&#8194;&#8194;&#8194;&#8194;为了保障每一位用户的全国4G高速使用体验和网络公平使用权，本流量及设备必须在实名注册、车机捆绑的前提下，具备中国电信4G网络稳定覆盖区域内进行使用！由于非实名、非合法车机捆绑、拆卡等原因造成的无法使用等后果均由使用人及购买人自行承担。为了防治恶意使用、避免浪费，用户当月全部国内数据总流量达到15G后将关闭数据上网功能，次月恢复！");
        SpannableStringBuilder spannable = new SpannableStringBuilder(tv.getText());
        spannable.setSpan(new ForegroundColorSpan(Color.RED), 0, 15
                , Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(spannable);



    }



    public static boolean isPrime(int N) {
        if (N < 2)
            return false;
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0)
                return false;
        return true;
    }

    private boolean isDD() {
        int a = 1;

        if (a == 2)
            return true;
        return false;
    }


}
