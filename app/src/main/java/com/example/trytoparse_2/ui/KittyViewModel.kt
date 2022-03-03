package com.example.trytoparse_2.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trytoparse_2.data.repository.Repository
import com.example.trytoparse_2.model.Kitty
import kotlinx.coroutines.*
import retrofit2.Response

class KittyViewModel: ViewModel() {

    private var repository = Repository()
    val kitty: MutableLiveData<Response<List<Kitty>>> = MutableLiveData()

    fun getKitty() {
        viewModelScope.launch {
            kitty.value = repository.getCat()
        }
    }
}