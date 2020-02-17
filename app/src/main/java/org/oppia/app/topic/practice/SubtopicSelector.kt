package org.oppia.app.topic.practice

/** Interface to update the selectedSubtopicList in [TopicPracticeFragmentPresenter]. */
interface SubtopicSelector {
  /** This skill will get added to selectedSubtopicList in [TopicPracticeFragmentPresenter]. */
  fun subtopicSelected(subtopicId: String, skillIdsList: ArrayList<String>)

  /** This skill will get removed from selectedSubtopicList in [TopicPracticeFragmentPresenter]. */
  fun subtopicUnselected(subtopicId: String, skillIdsList: ArrayList<String>)
}
