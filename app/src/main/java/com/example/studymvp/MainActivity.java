package com.example.studymvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainConstatns.View{
    MainConstatns.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new MainPresenter(this);
        init();
    }

    private void init() {
        //=버튼 클릭시 덧셈 결과 받기
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputA=((EditText)findViewById(R.id.editInputA)).getText().toString();
                String inputB=((EditText)findViewById(R.id.editTextInputB)).getText().toString();
                presenter.addNums(Integer.parseInt(inputA),Integer.parseInt(inputB));
            }
        });
    }

    @Override
    public void showResult(int result) {
        ((TextView)findViewById(R.id.textR)).setText(Integer.toString(result));
    }
}