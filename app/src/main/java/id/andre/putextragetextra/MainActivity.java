package id.andre.putextragetextra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText nama, alamat, umur, hobi, makanan, minuman, nomer;
    RadioGroup kelamin;
    RadioButton jenis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.et_nama);
        alamat = findViewById(R.id.et_alamat);
        umur = findViewById(R.id.et_umur);
        hobi = findViewById(R.id.et_hobi);
        makanan = findViewById(R.id.et_makanan);
        minuman = findViewById(R.id.et_minuman);
        nomer = findViewById(R.id.et_nomer);
        kelamin = findViewById(R.id.group_kelamin);

        int selected = kelamin.getCheckedRadioButtonId();
        jenis = findViewById(selected);

    }
}
