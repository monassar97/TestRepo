package com.arabbank.evouchers;

import com.arabbank.evouchers.response.Balance;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

interface APIInterface {

    @POST("balance")
    Call<Balance> getBalance(@Body BalanceRequest request);

}