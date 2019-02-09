package androidavancadoaula01kotlin.fabiolindemberg.com.br.androidavancadoaula01kotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Util.show(context, 9, "Titulo", "Texto", intent)
    }

}
