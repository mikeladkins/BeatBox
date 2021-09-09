package com.madkins.beatbox

private const val WAV = ".wav"
private const val TAG = "Sound"

class Sound(val assetPath: String, var soundId: Int? = null) {
    val name = assetPath.split("/").last().removeSuffix(WAV)
}