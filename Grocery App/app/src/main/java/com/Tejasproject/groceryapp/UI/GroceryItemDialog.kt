package com.Tejasproject.groceryapp.UI

import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.Tejasproject.groceryapp.Database.Entity.GroceryItems
import com.Tejasproject.groceryapp.R
import kotlinx.android.synthetic.main.grocerydialog.*

class GroceryItemDialog(context: Context,var dialogListener: DialogListener):AppCompatDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.grocerydialog)

        tvSave.setOnClickListener {

            val name = etItemName.text.toString()
            val quantity = etItemQuantity.text.toString().toInt()
            val price = etItemPrice.text.toString().toInt()

            if (name.isEmpty()){
                Toast.makeText(context,"Please Enter Item Name",Toast.LENGTH_SHORT).show()
            }

            val item = GroceryItems(name , quantity , price)
            dialogListener.onAddButtonClicked(item)
            dismiss()

        }

        tvCancel.setOnClickListener {
            cancel()
        }
    }
}