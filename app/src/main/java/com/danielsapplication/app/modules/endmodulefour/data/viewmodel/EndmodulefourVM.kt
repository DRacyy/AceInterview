package com.danielsapplication.app.modules.endmodulefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.danielsapplication.app.modules.endmodulefour.`data`.model.EndmodulefourModel
import org.koin.core.KoinComponent

class EndmodulefourVM : ViewModel(), KoinComponent {
  val endmodulefourModel: MutableLiveData<EndmodulefourModel> =
      MutableLiveData(EndmodulefourModel())

  var navArguments: Bundle? = null
}
