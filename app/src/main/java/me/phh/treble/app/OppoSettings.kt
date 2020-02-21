package me.phh.treble.app

import android.os.Bundle

object OppoSettings : Settings {
    val dt2w = "key_oppo_double_tap_to_wake"
    val gamingMode = "key_oppo_ts_game_mode"

    override fun enabled() = Tools.deviceId == "RMX1931"
}

class OppoSettingsFragment : SettingsFragment() {
    override val preferencesResId = R.xml.pref_oppo

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        android.util.Log.d("PHH", "Loading oppo fragment ${OppoSettings.enabled()}")
    }
}
