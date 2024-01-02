package com.danielsapplication.app.modules.startmodulefourone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.danielsapplication.app.modules.startmodulefourone.`data`.model.StartmodulefourOneModel
import org.koin.core.KoinComponent

class StartmodulefourOneVM : ViewModel(), KoinComponent {
  val startmodulefourOneModel: MutableLiveData<StartmodulefourOneModel> =
      MutableLiveData(StartmodulefourOneModel())

  var navArguments: Bundle? = null
}
