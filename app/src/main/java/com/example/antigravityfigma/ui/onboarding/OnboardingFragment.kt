package com.example.antigravityfigma.ui.onboarding

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.antigravityfigma.core.ui.BaseFragment
import com.example.antigravityfigma.databinding.FragmentOnboardingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnboardingFragment : BaseFragment<FragmentOnboardingBinding>(FragmentOnboardingBinding::inflate) {

    private val viewModel: OnboardingViewModel by viewModels()

    override fun setupViews() {
        binding.btnGetStarted.setOnClickListener {
            val action = OnboardingFragmentDirections.actionOnboardingFragmentToSignInFragment()
            findNavController().navigate(action)
        }
    }

    override fun observeViewModel() {
        // Observables
    }
}
