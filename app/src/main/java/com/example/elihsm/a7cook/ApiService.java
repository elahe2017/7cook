package com.example.elihsm.a7cook;

import android.content.Context;
import android.net.sip.SipSession;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.elihsm.a7cook.data.Banner;
import com.example.elihsm.a7cook.data.Category;
import com.example.elihsm.a7cook.data.Recipe;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class ApiService {
    private Context context;
    public ApiService(Context context){
        this.context=context;
    }

    public void getRecipes(Response.Listener<List<Recipe>> listListener){
        GsonRequest<List<Recipe>> request=new GsonRequest<>(
                Request.Method.GET, "https://api.myjson.com/bins/n7bxs", new TypeToken<List<Recipe>>() {
        }.getType(),
                listListener,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG","onErrorResponse:");

                    }
                }
        );

       Volley.newRequestQueue(context).add(request);

    }
    public void getBanners(Response.Listener<List<Banner>> listListener){
        GsonRequest<List<Banner>> request=new GsonRequest<>(
                Request.Method.GET, "https://api.myjson.com/bins/110sw0", new TypeToken<List<Banner>>() {
        }.getType(),
                listListener,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG","onErrorResponse:");

                    }
                }
        );

        Volley.newRequestQueue(context).add(request);

    }
    public void getCategories(Response.Listener<List<Category>> listListener){
        GsonRequest<List<Category>> request=new GsonRequest<>(
                Request.Method.GET, "https://api.myjson.com/bins/v0bog", new TypeToken<List<Category>>() {
        }.getType(),
                listListener,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG","onErrorResponse:");

                    }
                }
        );

        Volley.newRequestQueue(context).add(request);




    }
}
