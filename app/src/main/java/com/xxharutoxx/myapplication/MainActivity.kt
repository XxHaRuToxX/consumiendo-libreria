package com.xxharutoxx.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.xxharutoxx.sjelnextprogressbar.CircleSegmentBar
import com.xxharutoxx.sjelnextprogressbar.utils.ProgressStartPoint


class MainActivity : AppCompatActivity() {
    private var segmentBar: CircleSegmentBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initSegmentProgressBar()

    }

    private fun initSegmentProgressBar() {
        val segmentBarView = findViewById<CircleSegmentBar>(R.id.segment_bar)
        segmentBar = segmentBarView?: return
        // Puedes establecer el ancho para cada vista de progreso, el ancho de fondo de progreso, el ancho de la línea de la barra de progreso
        segmentBar!!.setCircleViewPadding(2)
        segmentBar!!.setWidth(250)
        segmentBar!!.setWidthProgressBackground(10.0f)
        segmentBar!!.setWidthProgressBarLine(25.0f)
        // Puedes establecer la posición de inicio para el progreso
        segmentBar!!.setStartPositionInDegrees(ProgressStartPoint.RIGHT)
        // Puedes establecer un degradado lineal con colores predeterminados o configurar los tuyos, o un degradado radial
        segmentBar!!.setLinearGradientProgress(true)
    }
}