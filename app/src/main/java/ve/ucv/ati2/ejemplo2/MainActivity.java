package ve.ucv.ati2.ejemplo2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText correo = null;
    EditText contrasenha = null;
    Button ingresar = null;
    Button recuperar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText)findViewById(R.id.correo_input);
        contrasenha = (EditText)findViewById(R.id.contrasenha_input);
        ingresar = (Button)findViewById(R.id.ingresar_button);
        recuperar = (Button)findViewById(R.id.recuperar_button);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirRecuperar(View view){

        Intent intent = new Intent(this, RecuperarActivity.class);
        intent.putExtra("info_correo",correo.getText().toString());
        this.startActivity(intent);
    }
}
