package com.swancodes.miprofile

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.swancodes.miprofile.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val githubLink = "https://github.com/OmolaraIdowu"

        binding.webView.apply {
            webViewClient = WebViewClient()
            githubLink.let { link ->
                loadUrl(link)
                binding.progressBar.isVisible = false
            }
        }
    }
}