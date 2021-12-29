package com.example.androidbdd.utils

import android.app.Activity
import android.os.Handler
import android.os.Looper
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.lifecycle.ActivityLifecycleMonitor
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry
import androidx.test.runner.lifecycle.Stage

class ActivityFinisher private constructor() : Runnable {

    private val activityLifecycleMonitor: ActivityLifecycleMonitor =
        ActivityLifecycleMonitorRegistry.getInstance()

    companion object {
        fun finishOpenActivities() {
            Handler(Looper.getMainLooper()).post(ActivityFinisher())
        }
    }

    override fun run() {
        val activities: MutableList<Activity> = emptyList<Activity>().toMutableList()

        val stages = arrayOf(
            Stage.CREATED,
            Stage.STOPPED,
            Stage.PAUSED,
            Stage.STARTED,
            Stage.RESUMED,
            Stage.RESTARTED,
            Stage.PRE_ON_CREATE
        )

        for (stage in stages) {
            activities.addAll(activityLifecycleMonitor.getActivitiesInStage(stage))
        }

        for (activity in activities) {
            InstrumentationRegistry.getInstrumentation().callActivityOnStop(activity)
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
    }
}
