package thigk2.duquangtrung;

import android.os.Bundle;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.*;

public class ChucNang1Activity extends AppCompatActivity {

    EditText edtTien;
    TextView txtKq;
    Button btnDoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chucnang1);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ánh xạ
        edtTien = findViewById(R.id.edtTien);
        txtKq = findViewById(R.id.txtKq);
        btnDoi = findViewById(R.id.btnDoi);

        // xử lý click
        btnDoi.setOnClickListener(v -> {
            String s = edtTien.getText().toString().trim();

            if (s.isEmpty()) {
                Toast.makeText(this, "Nhập tiền!", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                double tien = Double.parseDouble(s);
                double usd = tien / 25000;
                txtKq.setText("USD: " + usd);
            } catch (Exception e) {
                Toast.makeText(this, "Dữ liệu không hợp lệ!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}