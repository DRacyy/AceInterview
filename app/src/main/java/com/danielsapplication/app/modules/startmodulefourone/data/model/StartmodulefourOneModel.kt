package com.danielsapplication.app.modules.startmodulefourone.`data`.model

import com.danielsapplication.app.R
import com.danielsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StartmodulefourOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStart: String? = MyApp.getInstance().resources.getString(R.string.lbl_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_acei)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourindu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_indu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartyourInte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_your_inte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyOneValue: String? = null
)
