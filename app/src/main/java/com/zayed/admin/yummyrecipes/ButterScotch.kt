package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ButterScotch : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_buterscotch)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1 cup firmly packed brown sugar
            2.2 tablespoons butter
            3.1 tablespoon vanilla 1
            4.1/2 cups whipping cream
            5.2 cups half-and-half (light cream)
            6.6 large egg yolks
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1
            In a 1- to 2-quart pan over medium heat, stir brown sugar, butter, and vanilla until butter is melted, sugar is dissolved, and mixture is bubbly, 3 to 4 minutes. Whisk in 1/2 cup whipping cream until smooth; remove butterscotch mixture from heat.

            2
            In a 3- to 4-quart pan over medium-high heat, combine remaining 1 cup whipping cream and the half-and-half; bring to a simmer.

            3
            Meanwhile, in a bowl, beat egg yolks to blend. Whisk 1/2 cup of the warm cream mixture into egg yolks, then pour egg yolk mixture into pan with cream. Stir constantly over low heat just until mixture is slightly thickened, 2 to 4 minutes. Immediately remove from heat.

            4
            Pour through a fine strainer into a clean bowl and whisk in butterscotch mixture. Chill until cold, stirring occasionally, about 2 hours; or cover and chill up to 1 day.

            5
            Freeze mixture in an ice cream maker according to manufacturer's instructions. Serve softly frozen, or transfer ice cream to an airtight container and freeze until firm, at least 6 hours or up to 1 week.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}