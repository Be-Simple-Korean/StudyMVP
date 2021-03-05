package com.example.studymvp;

public class MainPresenter implements MainConstatns.Presenter{
    MainConstatns.View mainView;
    MainModel mainModel;
    public MainPresenter(MainConstatns.View view){
        mainView=view;
        mainModel=new MainModel(this);
    }
    @Override
    public void addNums(int input1, int input2) {
        mainView.showResult(input1+input2);
    }

    @Override
    public void saveData(int data) {
        mainModel.saveData(data);
    }
}
