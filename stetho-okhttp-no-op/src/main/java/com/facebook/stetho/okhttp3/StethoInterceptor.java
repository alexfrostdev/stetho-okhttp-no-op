package com.facebook.stetho.okhttp3;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;


public class StethoInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        throw new UnsupportedOperationException("You should not call this dummy implementation or you do some thing wrong!");
    }
}
