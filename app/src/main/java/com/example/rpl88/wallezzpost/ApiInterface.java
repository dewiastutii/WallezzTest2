package com.example.rpl88.wallezzpost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by rpl88 on 11/04/18.
 */

public interface ApiInterface {
    @POST("test/biodata")
    Call<Biodata> saveBiodata(@Body Biodata biodata, @Header("apikey") String apikey);
}
