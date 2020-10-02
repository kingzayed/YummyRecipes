package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class CreamChickenSoup : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_chickencreamsoup)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """
            1.1 tbsp olive oil

            2.50 g / 3.5 tbsp unsalted butter

            3.½ cup / 75 g flour

            4.1 garlic clove , minced

            5.½ small brown onion , finely chopped

            6.1 small carrot , diced

            7.1/2 red capsicum/bell pepper , finely chopped

            8.1 small celery stick , diced

            9.2 cups / 500 ml chicken stock / broth , preferably low sodium

            10.3 cups / 750 ml milk , any fat %

            11.½ tsp salt

            12.¼ tsp EACH garlic powder , onion powder, dried thyme, black pepper (“Spices”)

            13.3/4 cup frozen peas

            14.1 cup cooked chicken , diced or shredded

            Croutons:

            1.2 slices white bread , cut into cubes

            2.Olive oil spray

            3.Salt
            """.trimIndent()
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Heat oil in a large pot over medium high heat. Add onion and garlic and cook for 2 minutes until partly translucent but not browned.


            2.Add carrots, celery and capsicum, cook for 1 minute to soften.


            3.Add butter and melt. Then add flour and mix until incorporated, and stir constantly for 1 minute.


            4.Add broth, mix until flour is incorporated, then add milk. Mix to combine, then add salt, Spices, chicken and peas.


            5.Bring to simmer, mixing occasionally to stop bottom of sticking. As it heats, it will thicken – about 4 to 5 minutes. Don’t let it bubble.


            6.Once thickened to your taste, adjust salt and pepper. Ladle into bowls and serve garnished with croutons and fresh thyme if desired.


            Croutons: Spray croutons generously with oil, sprinkle with salt, then bake for 5 minutes at 180C/350F or until golden and crunchy.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}