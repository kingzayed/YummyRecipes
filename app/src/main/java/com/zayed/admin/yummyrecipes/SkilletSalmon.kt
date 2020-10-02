package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SkilletSalmon : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_skilletslamon)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.4 (6 oz) skinless salmon fillets (about 1-inch thick)

            2.Salt and freshly ground black pepper

            3.2 tsp olive oil

            4.2 garlic cloves , minced

            5.1/4 cup low-sodium chicken broth

            6.2 Tbsp fresh lemon juice

            7.3 Tbsp + 1 tsp unsalted butter , diced into 1 Tbsp pieces

            8.1/2 tsp honey

            9.2 Tbsp minced fresh parsley

            10.Lemon slices for garnish (optional)
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Remove salmon fillets from refrigerator and allow to rest at room temperature 10 minutes.


            2/Meanwhile prepared garlic lemon butter sauce. In a small saucepan melt 1 tsp butter over medium heat.


            3.Add garlic and saute until lightly golden brown, about 1 - 2 minutes. Pour in chicken broth and lemon juice.


            4.Let sauce simmer until it has reduced by half (to about 3 Tbsp), about 3 minutes. Stir in butter and honey and whisk until combined, set sauce aside.





            5.Dab both sides of salmon dry with paper towels, season both sides with salt and pepper.


            6.Heat olive oil in a (heavy) 12-inch non-stick skillet over medium-high heat.


            7.Once oil is shimmering add salmon and cook about 4 minutes on the first side until golden brown on bottom then flip and cook salmon on opposite side until salmon has cooked through, about 2 - 3 minutes longer.


            8.Plate salmon (leaving oil in pan) and drizzle each serving generously with butter sauce, sprinkle with parsley and garnish with lemon slices if desired. Serve immediately.


            9.Recipe source: Cooking Classy
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}