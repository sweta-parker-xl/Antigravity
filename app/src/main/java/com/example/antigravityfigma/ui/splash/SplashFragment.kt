package com.example.antigravityfigma.ui.splash

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.example.antigravityfigma.R
import com.example.antigravityfigma.core.ui.BaseFragment
import com.example.antigravityfigma.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    private val viewModel: SplashViewModel by viewModels()

    override fun setupViews() {
        // UI Setup if necessary
    }

    override fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.navigateToNext.collect { navigate ->
                    if (navigate) {
                        findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
                    }
                }
            }
        }
    }
}
