package com.pregon.elpregon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class Manualdeuso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manualdeuso)

        val pdfLayout = findViewById<PDFView>(R.id.pdfview)

        pdfLayout.fromAsset("manual.pdf").enableSwipe(true).swipeHorizontal(false).load()
    }
}