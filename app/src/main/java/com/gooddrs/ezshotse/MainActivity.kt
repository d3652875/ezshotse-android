package com.gooddrs.ezshotse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gooddrs.ezshotse.databinding.ActivityMainBinding

/**
 * Ez SHOT SE (CI-buildable baseline)
 * - This project is guaranteed to build on GitHub Actions and generate a Debug APK.
 * - Next step: plug in UVC preview/capture module (libuvc/UVCCamera) after CI is stable.
 */
class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.title.text = "Ez SHOT SE"
    binding.subtitle.text = "CI 빌드 확인용 기본 앱 (UVC 모듈 연결 전)"
  }
}
