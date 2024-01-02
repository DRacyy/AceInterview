package com.danielsapplication.app.modules.settwelvepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.danielsapplication.app.modules.settwelvepage.`data`.model.SettwelvepageModel
import org.koin.core.KoinComponent

class SettwelvepageVM : ViewModel(), KoinComponent {
  val settwelvepageModel: MutableLiveData<SettwelvepageModel> =
      MutableLiveData(SettwelvepageModel())

  var navArguments: Bundle? = null
}
