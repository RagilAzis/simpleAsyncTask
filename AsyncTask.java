package com.example.simpleasynctask;

public abstract class AsyncTask<S, I extends Number, B> {

    protected abstract String doInBackground(Void... voids);

    public abstract void execute();
}
