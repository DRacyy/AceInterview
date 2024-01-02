package com.danielsapplication.app.modules.endmodulefour.`data`.model

import com.danielsapplication.app.R
import com.danielsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EndmodulefourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnd: String? = MyApp.getInstance().resources.getString(R.string.lbl_end)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourresult: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouscoredEightyTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_scored_8_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_time_taken_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_average_time_ta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTryagain: String? = MyApp.getInstance().resources.getString(R.string.lbl_try_again)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
