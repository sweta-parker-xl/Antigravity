package com.example.antigravityfigma.ui.signin

import androidx.fragment.app.viewModels
import com.example.antigravityfigma.core.ui.BaseFragment
import com.example.antigravityfigma.databinding.FragmentSignInBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {

    private val viewModel: SignInViewModel by viewModels()

    override fun setupViews() {
        // Hook click listeners here when navigation/auth flow is added.
    }

    override fun observeViewModel() {
        // Observe sign-in state here when business logic is added.
    }
}
