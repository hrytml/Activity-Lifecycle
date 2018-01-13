package com.androideduio.activity_lifecycle

import android.app.Fragment
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Uygulama bir aktivite içindeki onCreate() metodunun çağrılması ile başlar. Her zaman onStart ile devam eder.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "onCreate yasam döngüsünün ilk basamagi")

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    //Bu metod aktivite kullanıcıya görünür olduğu zaman çağrılır.
    override fun onStart() {
        super.onStart()

        Log.e("MainActivity", "onStart")
    }

    //Bu metod aktivite beklemeye alındığı zaman çağrılır. onResume ile aktivite çalışmaya geri döner veya aktivite görünür değilse onStop ile çağrılır
    override fun onPause() {
        super.onPause()

        Log.e("MainActivity", "onPause")
    }

    //Bu metod aktivite artık görünür değil ise çağrılır.
    override fun onStop() {
        super.onStop()

        Log.e("MainActivity", "onStop")
    }

    //Bu metod kullanıcı uygulama ile etkileşime başladığı zaman çağrılır, yani uygulama kullanıcının etkileşimine hazır ise bu metod çağrılır diyebiliriz. Her zaman onPause ile devam eder.
    override fun onResume() {
        super.onResume()

        Log.e("MainActivity", "onResume")
    }

    //Kullanıcı geri komutuna bastığı zaman cagrilir.
    override fun onBackPressed() {
        super.onBackPressed()

        Log.e("MainActivity", "onBackPressed")
    }

    //Kullanıcın device ile nasıl interaction yaptigini anlamak istersek kullanabiliriz. Yani kullanıcı bir tuşa bastığında veya dokundugunda cagrilir.
    override fun onUserInteraction() {
        super.onUserInteraction()

        Log.e("MainActivity", "onUserInteraction")
    }

    //Aktivitenin status bar bildirimlerini daha iyi yonetmek icin cagrilir. Bir bildirimin iptali için uygun zamanı belirler.
    override fun onUserLeaveHint() {
        super.onUserLeaveHint()

        Log.e("MainActivity", "onUserLeaveHint")
    }

    //onStopdan sonra kullanici aktiviteye tekrar donmek istediginde cagrilir.
    override fun onRestart() {
        super.onRestart()

        Log.e("MainActivity", "onRestart")
    }

    //Ekranin content goruntusu degistiginde cagrilir.
    override fun onContentChanged() {
        super.onContentChanged()

        Log.e("MainActivity", "onContentChanged")
    }

    //Aktivite daha onceki kaydedilmis durumundan sonra tekrar baslatıgında onStopdan sonra cagrılır.
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.e("MainActivity", "onRestoreInstanceState")
    }

    //Aktivitenin baslaması tamamlandıgında cagrılır. onStart() ve onRestoreInstanceState(Bundle)'dan sonra. (Ben pek anlamadım acıkcası)
    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)

        Log.e("MainActivity", "onPostCreate")
    }

    //onResume'dan sonra cagrilir. yani aktivitenin resume u, (kaldıgı yerden devam etmesi) tamamlandıktan sonra.
    override fun onPostResume() {
        super.onPostResume()

        Log.e("MainActivity", "onPostResume")
    }

    //This is called when the view is attached to a window??
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        Log.e("MainActivity", "onAttachedToWindow")
    }

    //Kullanici menuyu ilk ken actıgında opsiyon yaratmak icin cagrilir.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)

        Log.e("MainActivity", "onCreateOptionsMenu")
    }

    //Ekranın standart opsiyonlar menüsünü göstermek icin kullanılır
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        return super.onPrepareOptionsMenu(menu)

        Log.e("MainActivity", "onPrepareOptionsMenu")
    }

    //Bir aktiviteyi arka plana almadan once cagrilir.
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        Log.e("MainActivity", "onSaveInstanceState")
    }

    //Aktivite yok edilmeden once cagrılır, son method.
    override fun onDestroy() {
        super.onDestroy()

        Log.e("MainActivity", "onDestroy")
    }

    //Aktivite calismayi durdurdugunda cagrılır.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.e("MainActivity", "onActivityResult")
    }

    //Bir fragment eklendiginde cagrılır.
    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)

        Log.e("MainActivity", "onAttachFragment")
    }

    //Aktivite calısırken cihazın yapılanması degistiginde sistem tarafından cagrilir.
    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)

        Log.e("MainActivity", "onConfigurationChanged")
    }
}














