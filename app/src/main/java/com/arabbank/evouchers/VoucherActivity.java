package com.arabbank.evouchers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class VoucherActivity extends AppCompatActivity{

    ListView vouchers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);
        setXmlReferences();
        try {
            String jsonInput = "[\"one\",\"two\",\"three\",\"four\",\"five\",\"six\",\"seven\",\"eight\",\"nine\",\"ten\"]";
            JSONArray jsonArray = new JSONArray(jsonInput);
            int length = jsonArray.length();
            List<String> listContents = new ArrayList<>(length);
            for (int i = 0; i < length; i++) {
                listContents.add(jsonArray.getString(i));
            }

            vouchers.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listContents));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setXmlReferences() {
        vouchers = findViewById(R.id.vouchers);
    }


}
