package com.Tejasproject.groceryapp.UI

import com.Tejasproject.groceryapp.Database.Entity.GroceryItems

interface DialogListener {
    fun onAddButtonClicked(item:GroceryItems)
}