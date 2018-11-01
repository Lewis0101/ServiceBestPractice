package com.example.user.servicebestpractice;

import android.os.AsyncTask;

/**
 * @author : LiuYang
 * @date : 2018/11/1
 */
public class DownloadTask extends AsyncTask<String, Integer,Integer> {

    public static final int TYPE_SUCCESS = 0;
    public static final int TYPE_FAILED = 1;
    public static final int TYPE_PAUSED = 2;
    public static final int TYPE_CANCELED = 3;

    private DownloadListener listener;
    private boolean isCanceled = false;
    private boolean isPaused = false;
    private int lastProgress ;

    public DownloadTask(DownloadListener listener){
        this.listener  = listener;
    }

    @Override
    protected Integer doInBackground(String... strings) {
        return null;
    }
}
