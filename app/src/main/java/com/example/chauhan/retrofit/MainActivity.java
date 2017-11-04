package com.example.chauhan.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    EditText name,clas,phone;
    Button Submit;
    UsersAdapter usersAdapter;
    ListView listView;
    List<Result> list;

    ArrayList<Result> list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.editText);
        clas = (EditText)findViewById(R.id.editText2);
        phone = (EditText)findViewById(R.id.editText3);
        listView = (ListView)findViewById(R.id.listView);
        Submit = (Button) findViewById(R.id.button);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String nm = name.getText().toString();
                String cl = clas.getText().toString();
                String pn = phone.getText().toString();
                final ApiClass apiClass = RetrofitInstance.getRetrofit().create(ApiClass.class);
                apiClass.InsertUser(nm,cl,pn, new Callback<Example>() {
                    @Override
                    public void success(Example example, Response response) {

                        list = example.getResult();
                        for (int i = 0; i < list.size(); i++) {

                            String a = list.get(i).getName();
                            String b = list.get(i).getClass_();
                            String c = list.get(i).getPhoneNo();
                            Toast.makeText(MainActivity.this,a+""+b+""+c+"", Toast.LENGTH_SHORT).show();
                            Result result = new Result(a,b,c);

                            list1=new ArrayList();
                            list1.add(result);
                           usersAdapter = new UsersAdapter(MainActivity.this,R.layout.customlist, (ArrayList<Result>) list1);
                            listView.setAdapter(usersAdapter);

                             }
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_SHORT).show();
                    }


                });
            }

        });
    }
}
