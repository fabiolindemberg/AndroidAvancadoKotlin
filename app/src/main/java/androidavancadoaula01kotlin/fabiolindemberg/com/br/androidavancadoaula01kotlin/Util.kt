package androidavancadoaula01kotlin.fabiolindemberg.com.br.androidavancadoaula01kotlin

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v4.app.NotificationCompat
import android.support.v4.content.ContextCompat.getSystemService
import androidavancadoaula01kotlin.fabiolindemberg.com.br.androidavancadoaula01kotlin.R.id.btnShowMessage

object Util{
    val MEU_CANAL = "Meu Canal"

    /*
    fun notify(context: Context, id: Int, title: String, text: String, intent: Intent) {

        val MEU_CANAL = "Meu Canal"

        val pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        /*
        Quando usa o channel, o channelId deve ser o mesmo utilizado no Notification/NotificationCompat Builder
         */
        val bigText = "Quando usa o channel, o channelId deve ser o mesmo utilizado no Notification/NotificationCompat Builder"

        val nofificationBuilder = NotificationCompat.Builder(context, MEU_CANAL)
                .setContentText(text)
                .setContentTitle(title)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.notification_icon_background)
                .setStyle(NotificationCompat.BigTextStyle().bigText(bigText)
                        .setBigContentTitle(bigText))


        val service = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channel = NotificationChannel(MEU_CANAL, "name", NotificationManager.IMPORTANCE_HIGH)
        service.createNotificationChannel(channel)

        service.notify(98, nofificationBuilder.build())
        //service.notify(99, bigPictureNotificationBuilder.build())

    }
*/

    fun showBigPictureNotification(context: Context, id: Int, title: String, text: String, intent: Intent, picture: Bitmap){

        val pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val nofificationBuilder = NotificationCompat.Builder(context, MEU_CANAL)
                .setContentText(text)
                .setContentTitle(title)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.notification_icon_background)
                .setStyle(NotificationCompat.BigPictureStyle().bigPicture(picture))

        val service = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channel = NotificationChannel(MEU_CANAL, "name", NotificationManager.IMPORTANCE_HIGH)
        service.createNotificationChannel(channel)

        service.notify(98, nofificationBuilder.build())
    }

    fun show(context: Context, id: Int, title: String, text: String, intent: Intent){

        val pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        /*
        Quando usa o channel, o channelId deve ser o mesmo utilizado no Notification/NotificationCompat Builder
         */
        val bigText = "Quando usa o channel, o channelId deve ser o mesmo utilizado no Notification/NotificationCompat Builder"

        val nofificationBuilder = NotificationCompat.Builder(context, MEU_CANAL)
                .setContentText(text)
                .setContentTitle(title)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.notification_icon_background)
                .setStyle(NotificationCompat.BigTextStyle().bigText(bigText)
                        .setBigContentTitle(bigText))


        val service = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channel = NotificationChannel(MEU_CANAL, "name", NotificationManager.IMPORTANCE_HIGH)
        service.createNotificationChannel(channel)

        service.notify(98, nofificationBuilder.build())

    }

}