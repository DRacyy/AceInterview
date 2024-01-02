package com.danielsapplication.app.modules.settwelvepage.`data`.model

import com.danielsapplication.app.R
import com.danielsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettwelvepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt1225: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_when_optimizing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_a_hardcoding)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentySeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_b_utilizing_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCIgnoringcro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_c_ignoring_cro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentySix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_d_restricting)

)
