package com.example.btt8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editname;
    EditText editmssv;
    EditText editngaysinh;
    EditText editsdt;
    EditText editemail;
    Button buttonExit;
    CheckBox checkdk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViews();

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editname.getText().toString();
                String mssv = editmssv.getText().toString();
                String ngaysinh = editngaysinh.getText().toString();
                String sdt = editsdt.getText().toString();
                String email = editemail.getText().toString();
                if ( name.isEmpty() ) {
                    editname.setError("Vui long nhap ten");
                }
                else if ( mssv.isEmpty() ) {
                    editmssv.setError("Vui long nhap mssv");
                }
                else if ( ngaysinh.isEmpty()) {
                    editngaysinh.setError("Vui long nhap ngay sinh");
                }
                else if ( sdt.isEmpty() ) {
                    editsdt.setError("Vui long nhap sdt");
                }
                else if ( email.isEmpty()) {
                    editemail.setText("Vui long nhap email");
                }
                else if ( checkdk.isChecked()) {
                    finish();
                }
                else {
                    checkdk.setError("Vui long dong y voi cac dieu khoan");
                }

            }
        });
    }

    private void getViews() {

        editname = findViewById(R.id.edit_name);
        editmssv = findViewById(R.id.edit_mssv);
        editngaysinh = findViewById(R.id.edit_ngaysinh);
        editsdt = findViewById(R.id.edit_dienthoai);
        editemail= findViewById(R.id.edit_email);
        buttonExit = findViewById(R.id.button_exit);
        checkdk = findViewById(R.id.check_dk);

    }

}