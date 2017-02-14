package su.lifshits.ilya.financecontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import model.DB;

public class FinanceControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.w("FinanceControl", "After super");

        setContentView(R.layout.activity_finance_control);

        Log.w("FinanceControl", "Before DB");

        DB db = new DB(this, "FinanceControlTEST", "FinanceControl");

        Log.w("FinanceControl", "After DB");
    }
}
