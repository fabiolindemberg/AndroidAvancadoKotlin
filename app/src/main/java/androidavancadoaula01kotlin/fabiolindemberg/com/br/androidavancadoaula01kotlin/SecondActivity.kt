package androidavancadoaula01kotlin.fabiolindemberg.com.br.androidavancadoaula01kotlin

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    val INTENT_FILTER = "TESTE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnSendBroadcast.setOnClickListener({ view ->
            LocalBroadcastManager.getInstance(this).sendBroadcast(Intent(INTENT_FILTER))
        })
        Toast.makeText(this, intent.getStringExtra("extra01"), Toast.LENGTH_SHORT).show()
    }

    val dynamicReceiver = object: BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            btnSendBroadcast.text = "Ok"
        }

    }

    override fun onPause() {
        super.onPause()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(dynamicReceiver)
    }

    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(this).registerReceiver(dynamicReceiver, IntentFilter(INTENT_FILTER))
    }

}
