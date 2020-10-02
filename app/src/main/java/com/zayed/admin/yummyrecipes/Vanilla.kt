package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Vanilla : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_vanilla)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.2 1/4 cup milk
            2.1 tablespoon corn flour
            3.1/2 cup fresh cream
            4.1/2 cup sugar
            5.1 teaspoon vanilla essence
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.Preparing this Vanilla Ice cream at home will surely win you praises.
Here are some easy tips and tricks to prepare this easy delight.
Take a small bowl and add 1/4 cup of milk and cornflour to it.
Mix well and keep the mixture aside.
2.Take a deep non-stick pan and add the remaining 2 cups of milk.
 Heat it over moderate flame and allow it to boil for 7-8 minutes, while stirring occasionally.
 Now, add the sugar and the cornflour-milk mixture in the milk, mix well and cook on a medium flame for 5 minutes, while stirring continuously.
 Cool completely.
3.Once the mixture is cooled, add the fresh cream and vanilla essence and mix well.
 After mixing, pour the mixture into a aluminium container.
 Cover the container with an aluminium foil and freeze for 6 hours or till semi-set.
4.Now pour the mixture into a mixer and blend till smooth.
Transfer the mixture back into the same aluminium container.
Cover with an aluminium foil and freeze for 10 hours or till set.
Scoop the vanilla ice cream in some crispy waffle cones and enjoy the flavourful dessert.
"""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}