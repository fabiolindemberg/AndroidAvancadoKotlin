package androidavancadoaula01kotlin.fabiolindemberg.com.br.androidavancadoaula01kotlin

import android.content.Intent
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val MEU_CANAL = "Meu Canal"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("extra01", "E ai tabacudo!")

        btnShowMessage.setOnClickListener({ view ->
            val myBitmap = BitmapFactory.decodeResource(resources, R.drawable.segunda)
            Util.showBigPictureNotification(view.context,
                    97,
                    "Conheça Noronha",
                    "Venha mergulhar nas águas claras de Fernando de Noronha",
                    intent,
                    myBitmap)
        })

        btnBroadCast.setOnClickListener({ view ->
            val intent = Intent(this, MyReceiver::class.java)
            sendBroadcast(intent)
        })
    }
}
