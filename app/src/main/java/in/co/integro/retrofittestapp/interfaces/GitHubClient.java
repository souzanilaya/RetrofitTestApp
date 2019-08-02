package in.co.integro.retrofittestapp.interfaces;

import java.util.List;

import in.co.integro.retrofittestapp.models.Contributor;
import retrofit.http.GET;
import retrofit.http.Path;

public interface GitHubClient {

    @GET("/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors (
            @Path("owner") String owner,
            @Path("repo") String repo
    );
}
