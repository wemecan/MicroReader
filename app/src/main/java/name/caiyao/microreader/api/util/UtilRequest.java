package name.caiyao.microreader.api.util;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * Created by 蔡小木 on 2016/3/9 0009.
 */
public class UtilRequest {
    private static UtilApi utilApi = null;

    public static UtilApi getUtilApi() {
        if (utilApi == null) {
            utilApi = new Retrofit.Builder()
                    .baseUrl("http://www.baidu.com")
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build().create(UtilApi.class);
        }
        return utilApi;
    }
}