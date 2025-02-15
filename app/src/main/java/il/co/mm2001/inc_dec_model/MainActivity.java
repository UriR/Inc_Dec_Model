package il.co.mm2001.inc_dec_model;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import il.co.mm2001.model.IntNumber;

public class MainActivity extends AppCompatActivity {
    private TextView  tvNumber;
    private Button    btnIncrement;
    private Button    btnDecrement;
    private IntNumber number;

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

        initializeViews();
        number = new IntNumber();
        tvNumber.setText(String.valueOf(number.getNum()));
    }

    private void initializeViews() {
        tvNumber     = findViewById(R.id.tvNumber);
        btnIncrement = findViewById(R.id.btnIncrement);
        btnDecrement = findViewById(R.id.btnDecrement);

        setListeners();
    }

    private void setListeners() {
        btnIncrement.setOnClickListener(v -> {
            number.increment();
            tvNumber.setText(String.valueOf(number.getNum()));
        });

        btnDecrement.setOnClickListener(v -> {
            number.decrement();
            tvNumber.setText(String.valueOf(number.getNum()));
        });
    }
}