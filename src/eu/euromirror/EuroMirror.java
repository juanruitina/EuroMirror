package eu.euromirror;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.widget.Toast;

public class EuroMirror extends Activity {

	private WebView mWebView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		mWebView = (WebView) findViewById(R.id.MyWebview);
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
		mWebView.setWebViewClient(new WebViewClient());
		mWebView.loadUrl("file:///android_asset/index.html");	
		mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
	}

	// Back hw button
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_DOWN) {
			switch (keyCode) {
			case KeyEvent.KEYCODE_BACK:
				if (mWebView.canGoBack() == true) {
					mWebView.goBack();
				} else {
					openMyDialog(null);
				}
				return true;
			}

		}
		return super.onKeyDown(keyCode, event);
	}

	public void openMyDialog(View view) {
		showDialog(10);
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case 10:
			Builder builder = new AlertDialog.Builder(this);
			builder.setMessage("Do you want to exit EuroMirror?")
			.setCancelable(true)
			.setPositiveButton("Exit",
					new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,
						int which) {
					EuroMirror.this.finish();
				}
			})
			.setNegativeButton("Stay!",
					new DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialog,
						int which) {
					Toast.makeText(getApplicationContext(),
							"Great!", Toast.LENGTH_SHORT)
							.show();
				}
			});

			return builder.create();
		}
		return super.onCreateDialog(id);
	}
}
