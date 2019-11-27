package com.aldamr01.nymphaeaapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aldamr01.nymphaeaapp.home.HomeActivity;
import com.aldamr01.nymphaeaapp.R;
import com.aldamr01.nymphaeaapp.config.RetrofitClient;
import com.aldamr01.nymphaeaapp.config.URL;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.tv_login_username);
        password = findViewById(R.id.tv_login_password);
        submit = findViewById(R.id.btn_login_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals(""))
                    username.setError("Username tidak boleh kosong");
                else if(password.getText().toString().equals(""))
                    password.setError(("Password tidak boleh kosong"));
                else
                    Login();
            }
        });
    }

    private void Login(){
        final String username = this.username.getText().toString().trim();
        final String password = this.password.getText().toString().trim();
        String url = URL.LOGIN;

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Authenticating...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();


        Call<LoginModel> call = RetrofitClient
                .getInstance()
                .getApi()
                .login(username, password);

        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                Log.d("response", response.toString());
                try{
                    Integer status_code = response.body().getStatus_code();
                    String message = response.body().getMessage();
                    try{
                        LoginModel.Data data = response.body().getData();
                        if(status_code.equals(200)){
                            Toast.makeText(LoginActivity.this, "Sukses", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(LoginActivity.this, "gagal melakukan login, pastikan username atau password sudah benar.", Toast.LENGTH_SHORT).show();
                        }
                    }catch (NullPointerException e){}
                }catch(Exception e){}
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                Log.d("error", call.toString()+" "+t.getMessage());
                progressDialog.dismiss();
            }
        });
    }
}
