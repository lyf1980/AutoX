package org.autojs.autojs.ui.main.web

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.autojs.autojs.ui.widget.SwipeRefreshWebView
import org.autojs.autojs.ui.widget.WebDataKt
import org.autojs.autojs.ui.widget.fillMaxSize

class WebViewFragment : Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            return SwipeRefreshWebView(requireContext()).apply {
                webView.loadUrl(WebDataKt.homepage)
                fillMaxSize()
            }
        }
    }