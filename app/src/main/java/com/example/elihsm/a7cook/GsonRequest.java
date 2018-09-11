package com.example.elihsm.a7cook;

import android.support.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GsonRequest<T> extends Request<T> {
    private Gson gson=new Gson();
    private Response.Listener<T> responseListener;
    // private Class<T> clazz;
     private Type type;
    public GsonRequest(int method, String url,Type type,Response.Listener<T>  responseListener, @Nullable Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this.responseListener=responseListener;
        this.type=type;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String json=new String(response.data);
            return (Response<T>) Response.success(gson.fromJson(json,type), HttpHeaderParser.parseCacheHeaders(response));
        }
        catch (Exception e){
            return Response.error( new VolleyError(e));
        }

    }

    @Override
    protected void deliverResponse(T response) {
        responseListener.onResponse(response);

    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
//     Map<String,String> map=new HashMap<>();
//      map.put("Authorization","bearer your TOKEN");
//      map.put("key","value");
//
//        return map();
        return super.getHeaders();
    }

    @Override
    public byte[] getBody() throws AuthFailureError {

//        JSONObject jsonObject=new JSONObject();
//        try {
//            jsonObject.put("email","test@gmail.com");
//            jsonObject.put("password","654321");
//        } catch (JSONException e) {
//
//        }
//        return jsonObject.toString().getBytes();
        return super.getBody();
    }
}

