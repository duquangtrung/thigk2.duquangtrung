package thigk2.duquangtrung;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.*;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ánh xạ
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        // chức năng 1
        btn1.setOnClickListener(v ->
                startActivity(new Intent(this, ChucNang1Activity.class)));

        // chức năng 2
        btn2.setOnClickListener(v ->
                startActivity(new Intent(this, BaiHatActivity.class)));

        // chức năng 3
        btn3.setOnClickListener(v ->
                startActivity(new Intent(this, DanhNhanActivity.class)));

        // chức năng 4
        btn4.setOnClickListener(v ->
                startActivity(new Intent(this, ThongTinActivity.class)));
    }
}