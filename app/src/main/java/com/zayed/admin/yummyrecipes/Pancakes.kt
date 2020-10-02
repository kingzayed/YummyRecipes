package com.zayed.admin.yummyrecipes

import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Pancakes : Activity() {
    private var imageView: ImageView? = null
    private var textName: TextView? = null
    private var textingredients: TextView? = null
    private var textPreparation: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_pancakes)
        imageView = findViewById<View>(R.id.imageview) as ImageView
        textName = findViewById<View>(R.id.textname) as TextView
        textingredients = findViewById<View>(R.id.ingredients) as TextView
        textPreparation = findViewById<View>(R.id.Preparation) as TextView
        val ing = """1.2 cups rolled oats

2.2 1/2 cups buttermilk, divided

3.1/2 cup whole wheat flour or oat flour

4.1 tsp baking powder

5.1 tsp baking soda

6.1/4 tsp cinnamon

7.1/4 tsp salt

8.2 large eggs

9.canola oil 60 mL

10.1 Tbsp honey or maple syrup

11.canola oil cooking spray or extra canola
 oil for cooking

"""
        textingredients!!.text = ing
        textingredients!!.movementMethod = ScrollingMovementMethod()
        val prepare = """
            1.Instructions:


            2.1. In large bowl, stir together oats and 2 cups (500 mL) buttermilk. Set aside for an hour or until buttermilk is absorbed and oats are soft. (To do this ahead of time, cover and refrigerate overnight.)


            3.2. In small bowl, stir together flour, baking powder, baking soda, cinnamon and salt. Add to softened oatmeal.


            4.3. Add remaining 1/2 cup (125 mL) buttermilk along with eggs, canola oil, honey or maple syrup. Stir with rubber spatula just until well combined.


            5.4. Heat large, heavy skillet over medium-high heat and spray with canola oil cooking spray or brush with canola oil.


            6.5. Cook about 1/2 cup (125 mL) batter at a time; spread it out with bottom of ladle or spoon (it will be thick) to about 4 inches (10 cm) in diameter. Turn heat down to medium-low and cook until edges appear dry and bubbles begin to break on surface. Using thin spatula, flip and cook until golden on other side.


            7.6. Repeat with remaining batter. If you like, keep cooked pancakes warm in 200 ˚F (100 ˚C) oven while cooking rest. Serve with maple syrup and enjoy!


            8.Tips: If you like, scatter the tops of pancakes with fresh or frozen blueberries or sliced banana as soon as you spread the batter into the pan; this way, the fruit is evenly distributed and the blueberries won't turn the batter purple with their juice. Freeze leftover pancakes with a piece of waxed paper in between them to pop into the toaster (straight from frozen) on busy weekday mornings.
            """.trimIndent()
        textPreparation!!.text = prepare
        textPreparation!!.movementMethod = ScrollingMovementMethod()
    }
}