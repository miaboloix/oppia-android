package org.oppia.app.utility

import android.content.Context
import android.content.Context.WINDOW_SERVICE
import android.util.DisplayMetrics
import android.view.WindowManager
import org.oppia.app.model.StoryTextSize

object FontScaleConfigurationUtil {
  fun adjustFontSize(
    context: Context,
    result: StoryTextSize
  ) {
    val configuration = context.resources.configuration
    configuration.fontScale = getStoryTextSize(result)
    val metrics: DisplayMetrics = context.getResources().getDisplayMetrics()
    val wm =
      context.getSystemService(WINDOW_SERVICE) as WindowManager?
    wm!!.defaultDisplay.getMetrics(metrics)
    metrics.scaledDensity = configuration.fontScale * metrics.density
    context.createConfigurationContext(configuration)
    context.resources.displayMetrics.setTo(metrics)
  }

  fun getStoryTextSize(storyTextSize: StoryTextSize): Float {
    return when (storyTextSize) {
      StoryTextSize.SMALL_TEXT_SIZE -> .8f
      StoryTextSize.MEDIUM_TEXT_SIZE -> 1.0f
      StoryTextSize.LARGE_TEXT_SIZE -> 1.4f
      else -> 1.6f
    }
  }
}