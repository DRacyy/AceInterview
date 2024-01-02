package com.danielsapplication.app.modules.endmodulefour.ui

import androidx.activity.viewModels
import com.danielsapplication.app.R
import com.danielsapplication.app.appcomponents.base.BaseActivity
import com.danielsapplication.app.databinding.ActivityEndmodulefourBinding
import com.danielsapplication.app.modules.endmodulefour.`data`.viewmodel.EndmodulefourVM
import kotlin.String
import kotlin.Unit

class EndmodulefourActivity :
    BaseActivity<ActivityEndmodulefourBinding>(R.layout.activity_endmodulefour) {
  private val viewModel: EndmodulefourVM by viewModels<EndmodulefourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.endmodulefourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENDMODULEFOUR_ACTIVITY"

  }
}
