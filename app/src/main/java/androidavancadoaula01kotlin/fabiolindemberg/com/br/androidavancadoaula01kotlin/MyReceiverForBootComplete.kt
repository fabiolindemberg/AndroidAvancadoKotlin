package androidavancadoaula01kotlin.fabiolindemberg.com.br.androidavancadoaula01kotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyReceiverForBootComplete : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        TODO("MyReceiverForBootComplete.onReceive() is not implemented")
        Log.d("Messagem", "Recebido!")
    }
}
