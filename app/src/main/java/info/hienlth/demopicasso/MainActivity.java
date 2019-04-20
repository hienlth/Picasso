package info.hienlth.demopicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imgHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //map control
        imgHinh = (ImageView)findViewById(R.id.imgHinh);

        //Đọc và hiển thị hình dùng Picasso
        Picasso.get()
                .load("http://hcmup.edu.vn/images/stories/site_18/mainsite/daotao.png")
                .error(R.drawable.noimage)//lỗi thì load hình sẵn có
                .fit()
                .into(imgHinh);
    }
}
