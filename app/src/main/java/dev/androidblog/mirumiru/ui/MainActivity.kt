package dev.androidblog.mirumiru.ui

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import dev.androidblog.mirumiru.R
import dev.androidblog.mirumiru.SampleClass
import dev.androidblog.mirumiru.base.BaseActivity
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    @Inject
    lateinit var sample: SampleClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample.abc()
    }

}