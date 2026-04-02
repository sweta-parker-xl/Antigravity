package com.example.antigravityfigma.ui.onboarding

import androidx.fragment.app.viewModels
import com.example.antigravityfigma.core.ui.BaseFragment
import com.example.antigravityfigma.databinding.FragmentOnboardingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnboardingFragment : BaseFragment<FragmentOnboardingBinding>(FragmentOnboardingBinding::inflate) {

    private val viewModel: OnboardingViewModel by viewModels()

    override fun setupViews() {
        binding.btnGetStarted.setOnClickListener {
            // Future navigation to Login or Home Screen
        }
    }

    override fun observeViewModel() {
        // Observables
    }
}
