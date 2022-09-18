package com.Tejasproject.groceryapp.UI

import androidx.lifecycle.ViewModel
import com.Tejasproject.groceryapp.Database.Entity.GroceryItems
import com.Tejasproject.groceryapp.Database.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository):ViewModel() {

     fun insert(item:GroceryItems) = GlobalScope.launch {
        repository.insert(item)
    }
    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }
    fun allGroceryItems() = repository.allGroceryItems()


}