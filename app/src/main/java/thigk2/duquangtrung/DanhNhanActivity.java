package thigk2.duquangtrung;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.*;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DanhNhanActivity extends AppCompatActivity {

    RecyclerView rvDanhNhan;
    ArrayList<DanhNhan> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_danh_nhan);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ánh xạ
        rvDanhNhan = findViewById(R.id.rvDanhNhan);

        // layout list
        rvDanhNhan.setLayoutManager(new LinearLayoutManager(this));

        // tạo dữ liệu
        list = new ArrayList<>();

        list.add(new DanhNhan("Hồ Chí Minh", "Nghệ An", R.drawable.hcm));
        list.add(new DanhNhan("Võ Nguyên Giáp", "Quảng Bình", R.drawable.giap));

        // gắn adapter
        DanhNhanAdapter adapter = new DanhNhanAdapter(this, list);
        rvDanhNhan.setAdapter(adapter);
    }
}