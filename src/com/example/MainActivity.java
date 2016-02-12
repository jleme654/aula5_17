package com.example;

import android.app.Activity;
import android.app.Fragment;
<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
=======
import android.os.Bundle;
>>>>>>> 1dfa07a2a511edc76cefc9279b671fdfcf438c38
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
<<<<<<< HEAD

public class MainActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		Button botao = (Button) findViewById(R.id.mProximoButton);
		botao.setOnClickListener(this);
		Log.v("curso", "Tela 1 executando evento OnCreate");
	}

	@Override
	public void onClick(View v) {
		Intent intencao = new Intent(this, MainActivity2.class);
		Bundle params = new Bundle();
		params.putString("nome", "Julio Leme");
		intencao.putExtras(params);
		startActivity(intencao);
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		Log.i("curso", "Tela 2 executando evento onStart");
=======
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	public void onClick(View v) {
		TextView rotuloStatus = (TextView) findViewById(R.id.mProximoButton);
		rotuloStatus.setText("Botao proximo clicado");

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button botao = (Button) findViewById(R.id.mStatusTextView);
		botao.setOnClickListener(this);
>>>>>>> 1dfa07a2a511edc76cefc9279b671fdfcf438c38
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}
	}

}
