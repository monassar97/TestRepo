package com.arabbank.evouchers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.arabbank.evouchers.response.Balance;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button voucher, buy;
    APIInterface apiInterface;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setXmlReferences();
        setListeners();
        apiInterface = APIClient.getClient().create(APIInterface.class);
        final BalanceRequest request = new BalanceRequest();
        request.setData(new ArrayList<Object>());
        request.setUsername("arabbankplc");
        request.setPassword("dEFyewA8");
        System.out.println("request = " + request.toString());

       /* Call<Balance> call1 = apiInterface.getBalance(request);
        call1.enqueue(new Callback<Balance>() {
            @Override
            public void onResponse(Call<Balance> call, Response<Balance> response) {
                Log.d(TAG, "response.message() = " + response.message());

            }

            @Override
            public void onFailure(Call<Balance> call, Throwable t) {
*//*                ObjectMapper mapper=new ObjectMapper();
                try {
                    String res=mapper.writeValueAsString(request);
                    System.out.println("request Failure = " + res);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                t.printStackTrace();*//*
                Log.e(TAG, "onFailure: ", t);
            }
        });
*/


    }

    private void setListeners() {
        buy.setOnClickListener(this);
        voucher.setOnClickListener(this);
    }

    private void setXmlReferences() {
        buy = findViewById(R.id.buy);
        voucher = findViewById(R.id.voucher);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buy:
                Intent buyIntent = new Intent(this, BuyActivity.class);
                startActivity(buyIntent);
                break;
            case R.id.voucher:
                Intent voucherIntent = new Intent(this, VoucherActivity.class);
                startActivity(voucherIntent);
                break;
        }
    }
}
