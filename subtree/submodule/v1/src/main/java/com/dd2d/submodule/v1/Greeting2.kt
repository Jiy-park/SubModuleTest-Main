package com.dd2d.submodule.v1

import android.R.attr.name

class Greeting2 {
  fun greeting(name: String, age: Int): String {
    return "i am $name $age old"
  }
  fun greetingFromMain(): String {
    return "hello main!"
  }
}