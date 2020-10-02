package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Stawberry : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_stawberry)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 cups whole milk
            2.2 cups heavy cream
            3.1 cup white sugar
            4.1/4 teaspoon salt
            5.2 teaspoons vanilla extract
            6.2 cups mashed fresh strawberries
            7.2 drops red food coloring (optional)

            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = "In a large bowl, combine the milk, cream, sugar, salt, vanilla, strawberries, and food coloring. \nPour the mixture into the freezer bowl of an ice cream maker, and freeze according to manufacturer's directions."
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}