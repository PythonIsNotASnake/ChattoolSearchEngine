package chat;

import com.google.gson.JsonElement;
import model.SearchResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ISearch {
    @GET("search/{question}")
    Call<SearchResult> getSearchResult(@Path("question") String question);
}
