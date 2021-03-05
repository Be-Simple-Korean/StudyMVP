package com.example.studymvp;

import android.widget.EditText;

public interface MainConstatns {
    interface View{
        void showResult(int result);
    }
    interface Presenter{
        void addNums(int input1,int input2);

        void saveData(int data);
    }
}
