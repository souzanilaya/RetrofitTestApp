package in.co.integro.retrofittestapp;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

public class ServiceGenerator {
    private static final String BASE_URL = "https://developer.github.com/v3/";

    private static RestAdapter.Builder builder = new RestAdapter.Builder().setEndpoint(BASE_URL).setClient(new OkClient(new OkHttpClient()));

    protected static <S> S createService(Class<S> serviceClass) {
        RestAdapter adapter = builder.build();
        return adapter.create(serviceClass);
    }
}
