package com.example;

import android.app.Activity;
import android.app.Fragment;
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 1dfa07a2a511edc76cefc9279b671fdfcf438c38
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends Activity implements OnClickListener  {

	@Override
<<<<<<< HEAD
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		Button botao = (Button) findViewById(R.id.mAnteriorButton);
		botao.setOnClickListener(this);
		
		Intent intencao = getIntent();
		Bundle params = intencao.getExtras();
		String nome = params.getString("nome");
		
		TextView status = (TextView) findViewById(R.id.mStatusTextView);
		status.setText("Nome Aluno: " + nome);
	}

	@Override
	public void onClick(View v) {
		finish();
	}
	
=======
	public void onClick(View v) {
		TextView rotuloStatus = (TextView) findViewById(R.id.mAnteriorButton);
		rotuloStatus.setText("Botao anterior clicado");

	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		Button botao = (Button) findViewById(R.id.mStatusTextView);
		botao.setOnClickListener(this);
	}
>>>>>>> 1dfa07a2a511edc76cefc9279b671fdfcf438c38

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
