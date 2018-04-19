package com.nareshpoola.feddup.api;

import com.nareshpoola.feddup.data.models.PostConfirmation;

import retrofit2.Response;

public interface PostUploadListener {
    void onStart();

    void onSuccess(PostConfirmation postConfirmation);

    void onNetworkError(Response throwable);

    void onError(Throwable throwable);
}
