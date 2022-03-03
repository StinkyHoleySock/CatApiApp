package com.example.trytoparse_2.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.trytoparse_2.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_kitty.*

class KittyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewModel = ViewModelProvider(this).get(KittyViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_kitty, container, false)

        viewModel.getKitty()

        viewModel.kitty.observe(viewLifecycleOwner, {list ->
            list.body()?.let {
                Picasso.with(context)
                    .load(it[0].url)
                    .into(iv_kitty)
                }
            })



        return view
    }

}