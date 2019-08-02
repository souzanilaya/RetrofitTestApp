package in.co.integro.retrofittestapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import in.co.integro.retrofittestapp.interfaces.GitHubClient;
import in.co.integro.retrofittestapp.interfaces.TaskService;
import in.co.integro.retrofittestapp.models.Contributor;
import in.co.integro.retrofittestapp.models.Task;
import retrofit.RestAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GitHubClient client = (GitHubClient) ServiceGenerator.createService(GitHubClient.class);

        List<Contributor> contributors = client.contributors("fs_opensource","android-boilerplate");

        for (Contributor contributor: contributors) {
            Log.i(TAG, "onCreate: " +contributor.contributions);
        }
    }
}
