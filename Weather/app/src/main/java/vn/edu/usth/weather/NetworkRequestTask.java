package vn.edu.usth.weather;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public class NetworkRequestTask extends AsyncTask<Void, Void, String> {
    private Context context;

    public NetworkRequestTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Void... params) {
        // Simulate a network request here, e.g., by sleeping for a few seconds.
        try {
            Thread.sleep(2000); // Simulate a 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // You can return any result or data you want here.
        return "Network request completed!";
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        // Show a toast message with the result of the network request.
        Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
    }
}