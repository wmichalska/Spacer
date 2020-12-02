package com.michalska.spacer.feature.main

import android.os.Bundle
import com.michalska.spacer.R
import com.michalska.spacer.application.ThreadManager
import com.michalska.spacer.application.base.BaseActivity
import com.michalska.spacer.persistence.dao.DogDao
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {
//    @Inject
//    lateinit var dogDao: DogDao

    @Inject
    lateinit var threadManager: ThreadManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}