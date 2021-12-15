package com.journaldev.androiduploadimageretrofitnodejs;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;

interface ApiService {
    @Multipart
    @POST("/api/id_verification")
    Call<ResponseBody> postImage(
            @Part MultipartBody.Part image,
            @Part("image_file") RequestBody name,
            @Part MultipartBody.Part daktar_id,
            @Part MultipartBody.Part nid_number
    );
}
