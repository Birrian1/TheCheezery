package brian.jimenez.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button

        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)

        }


        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button

        btnHot.setOnClickListener {
            var intent: Intent = Intent(this, ProductosHot::class.java)
            startActivity(intent)
        }


        var btnSweet: Button = findViewById(R.id.button_sweet) as Button

        btnSweet.setOnClickListener {
            var intent: Intent = Intent(this, ProductoSweet::class.java)
            startActivity(intent)
        }



        var btnSalties: Button = findViewById(R.id.button_salties) as Button

        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosSalties::class.java)
            startActivity(intent)
        }




    }
}