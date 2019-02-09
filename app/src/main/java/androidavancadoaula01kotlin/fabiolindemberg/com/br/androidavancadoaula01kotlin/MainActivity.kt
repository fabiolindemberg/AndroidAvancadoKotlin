package androidavancadoaula01kotlin.fabiolindemberg.com.br.androidavancadoaula01kotlin

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val MEU_CANAL = "Meu Canal"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("extra01", "E ai tabacudo")
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        /*
        Quando usa o channel, o channelId deve ser o mesmo utilizado no Notification/NotificationCompat Builder

        val bigText = "Quando usa o channel, o channelId deve ser o mesmo utilizado no Notification/NotificationCompat Builder"

        val nofificationBuilder = NotificationCompat.Builder(this, MEU_CANAL)
                .setContentText("Meu texto")
                .setContentTitle("Meu Titulo")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.notification_icon_background)
                .setStyle(NotificationCompat.BigTextStyle().bigText(bigText)
                        .setBigContentTitle("Big Text"))

        val myBitmap = BitmapFactory.decodeResource(resources, R.drawable.segunda)
        val bigPictureNotificationBuilder = NotificationCompat.Builder(this, MEU_CANAL)
                .setContentTitle("Meu Título")
                .setContentText("Meu Texto")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_filter_hdr_black_24dp)
                .setStyle(NotificationCompat.BigPictureStyle().bigPicture(myBitmap))

        val service = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channel = NotificationChannel(MEU_CANAL, "name", NotificationManager.IMPORTANCE_HIGH)
        service.createNotificationChannel(channel)
         */
        btnShowMessage.setOnClickListener({ view ->
            //service.notify(98,nofificationBuilder.build())
            //service.notify(99,bigPictureNotificationBuilder.build())
            val myBitmap = BitmapFactory.decodeResource(resources, R.drawable.segunda)
            Util.showBigPictureNotification(view.context, 97, "Conheça Noronha", "Venha mergulhar nas águas claras de Fernando de Noronha",intent, myBitmap)
        })

        btnBroadCast.setOnClickListener({ view ->
            val intent = Intent(this, MyReceiver::class.java)
            sendBroadcast(intent)
        })
    }
}
