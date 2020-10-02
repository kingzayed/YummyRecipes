package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Blueberry : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_blueberry)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.4 cups fresh or frozen blueberries
            2.2 cups sugar
            3.2 tablespoons water
            4.4 cups half-and-half cream
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """1.In a large saucepan, combine the blueberries, sugar and water. Bring to a boil.
 Reduce heat; simmer, uncovered, until sugar is dissolved and berries are softened.
 Press mixture through a fine-mesh strainer into a bowl; discard pulp.
 Stir in cream. Cover and refrigerate overnight.
2.Fill cylinder of ice cream freezer two-thirds full; freeze according to the manufacturer’s directions.
(Refrigerate any remaining mixture until ready to freeze.)
 Transfer ice cream to freezer containers, allowing headspace for expansion.
 Freeze until firm, 2-4 hours. Repeat with any remaining ice cream mixture.
"""
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}