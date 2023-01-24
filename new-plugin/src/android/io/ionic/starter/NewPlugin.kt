package io.ionic.starter

import org.apache.cordova.CallbackContext
import org.apache.cordova.CordovaPlugin
import org.json.JSONArray

class NewPlugin : CordovaPlugin() {

  override fun execute(action: String, args: JSONArray, callbackContext: CallbackContext): Boolean {
    callbackContext.success()
    return false
  }
}
