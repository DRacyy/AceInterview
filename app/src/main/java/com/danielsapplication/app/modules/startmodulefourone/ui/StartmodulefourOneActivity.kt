package com.danielsapplication.app.modules.startmodulefourone.ui

import androidx.activity.viewModels
import com.danielsapplication.app.R
import com.danielsapplication.app.appcomponents.base.BaseActivity
import com.danielsapplication.app.databinding.ActivityStartmodulefourOneBinding
import com.danielsapplication.app.modules.startmodulefourone.`data`.viewmodel.StartmodulefourOneVM
import kotlin.String
import kotlin.Unit

class StartmodulefourOneActivity :
    BaseActivity<ActivityStartmodulefourOneBinding>(R.layout.activity_startmodulefour_one) {
  private val viewModel: StartmodulefourOneVM by viewModels<StartmodulefourOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startmodulefourOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STARTMODULEFOUR_ONE_ACTIVITY"

  }
}
