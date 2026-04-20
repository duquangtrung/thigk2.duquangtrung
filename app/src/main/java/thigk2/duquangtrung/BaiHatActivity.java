package thigk2.duquangtrung;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.*;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BaiHatActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<BaiHat> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_hat);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rv = findViewById(R.id.rvBaiHat);
        rv.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        // dữ liệu mẫu
        for (int i = 1; i <= 9; i++) {
            list.add(new BaiHat("Bài hát " + i));
        }

        list.add(new BaiHat("Dư Quang Trung")); // bắt buộc

        BaiHatAdapter adapter = new BaiHatAdapter(this, list);
        rv.setAdapter(adapter);
    }
}