package com.danielsapplication.app.modules.settwelvepage.ui

import androidx.activity.viewModels
import com.danielsapplication.app.R
import com.danielsapplication.app.appcomponents.base.BaseActivity
import com.danielsapplication.app.databinding.ActivitySettwelvepageBinding
import com.danielsapplication.app.modules.settwelvepage.`data`.viewmodel.SettwelvepageVM
import kotlin.String
import kotlin.Unit

class SettwelvepageActivity :
    BaseActivity<ActivitySettwelvepageBinding>(R.layout.activity_settwelvepage) {
  private val viewModel: SettwelvepageVM by viewModels<SettwelvepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settwelvepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SETTWELVEPAGE_ACTIVITY"

  }
}
