package fa.setyadi.tugas_ppb_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Pilih Action yang dilakukan");
        menu.add(0,v.getId(),0, "Bookmark");//groupId, itemId, order, tittle
        menu.add(0,v.getId(),0, "Save");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Bookmark) {
            Toast.makeText(getApplicationContext(), "Button Bookmark di klik", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.Save) {
            Toast.makeText(getApplicationContext(), "Button Save di klik", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.Search) {
            Toast.makeText(getApplicationContext(), "Button Search di klik", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.Share) {
            Toast.makeText(getApplicationContext(), "Button Share di klik", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.Delete) {
            Toast.makeText(getApplicationContext(), "Button Delete di klik", Toast.LENGTH_LONG).show();
        }
        if (id == R.id.Preferences) {
            Toast.makeText(getApplicationContext(), "Button Preferences di klik", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
