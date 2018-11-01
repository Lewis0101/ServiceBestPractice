package com.example.user.servicebestpractice;

/**
 * @author : LiuYang
 * @date : 2018/11/1
 */
public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
