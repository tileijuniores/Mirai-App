package miraiscanner.facom.ufu.br.miraiscanner.Network;

//com.chikeandroid.retrofittutorial2.data.model.Post;
//com.chikeandroid.retrofittutorial2.data.model;

import miraiscanner.facom.ufu.br.miraiscanner.Network.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {


    @POST("api/produto")
    //@FormUrlEncoded
    Call<Post> savePost(@Body Post post);

}