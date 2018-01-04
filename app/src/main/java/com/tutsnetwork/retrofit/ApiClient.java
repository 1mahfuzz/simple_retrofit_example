package com.tutsnetwork.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mahfuz on 3/1/18.
 */

public interface ApiClient {

    @GET("users/mahfuz001/repos")
    Call<List<Repo>> getRepo();
}
